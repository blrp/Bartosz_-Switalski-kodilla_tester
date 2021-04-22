package com.kodilla.mockito.homework;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

public class WeatherForecastServiceTestSuite {
    WeatherForecastService weatherAlertService = new WeatherForecastService();
    User user = Mockito.mock(User.class);
    Location location = Mockito.mock(Location.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    @BeforeAll
    public static void initiateTesting() {
        System.out.println("Beginning testing.");
    }

    @BeforeEach
    public void initializeTest() {
        System.out.println("Running test...");
    }

    @AfterEach
    public void endTest() {
        System.out.println("-----");
    }

    @AfterAll
    public static void closeTesting() {
        System.out.println("Ending testing.");
    }

    @Test
    public void notSubscribedPersonShouldNotReceiveNotifications() {
        weatherAlertService.addLocation(location);
        weatherAlertService.sendNotificationToLocation(weatherNotification, location);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldAddLocation() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addLocation(locationTwo);
        weatherAlertService.addSubscriber(user, locationTwo);
        Mockito.verify(locationTwo, Mockito.times(1)).receiveSubscriber(user);
    }

    @Test
    public void shouldAddSubscriberIfLocationIsInTheSystem() {
        weatherAlertService.addLocation(location);
        weatherAlertService.addSubscriber(user, location);
        Mockito.verify(location, Mockito.times(1)).receiveSubscriber(user);
    }

    @Test
    public void shouldAddSubscriberIfLocationWasNotTheSystem() {
        weatherAlertService.addSubscriber(user, location);
        Mockito.verify(location, Mockito.times(1)).receiveSubscriber(user);
    }

    @Test
    public void subscribedPersonShouldReceiveNotificationFromRightLocation() {
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.sendNotificationToLocation(weatherNotification, location);
        Mockito.verify(user, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void subscribedPersonShouldNotReceiveNotificationFromWrongLocation() {
        weatherAlertService.addSubscriber(user, location);
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.sendNotificationToLocation(weatherNotification, locationTwo);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldUnsubscribePersonFromLocation() {
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.removeSubscriberFromLocation(user, location);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(user);
    }

    @Test
    public void personUnsubbedFromLocationShouldNotReceiveNotificationsFromLocation() {
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.removeSubscriberFromLocation(user, location);
        weatherAlertService.sendNotificationToLocation(weatherNotification, location);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldUnsubscribePersonFromAll() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.addSubscriber(user, locationTwo);
        weatherAlertService.removeSubscriberFromAllLocations(user);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(user);
        Mockito.verify(locationTwo, Mockito.times(1)).removeSubscriber(user);


    }
    @Test
    public void shouldSendNotificationToAllWithRelevantMethod() {
        User userTwo = Mockito.mock(User.class);
        Location locationTwo = Mockito.mock(Location.class);
        User userThree = Mockito.mock(User.class);
        Location locationThree = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(userTwo, locationTwo);
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.addSubscriber(userThree, locationThree);
        weatherAlertService.sendNotificationToAll(weatherNotification);
        Mockito.verify(userTwo, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(user, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(userThree, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void personUnsubscribedFromAnyLocationShouldNotReceiveNotificationsToAll() {
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.removeSubscriberFromLocation(user, location);
        weatherAlertService.sendNotificationToAll(weatherNotification);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void personUnsubscribedFromAllShouldNotReceiveNotificationsToAll() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.addSubscriber(user, locationTwo);
        weatherAlertService.removeSubscriberFromAllLocations(user);
        weatherAlertService.sendNotificationToAll(weatherNotification);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void personUnsubscribedFromAllShouldNotReceiveAnyLocalNotifications() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.addSubscriber(user, locationTwo);
        weatherAlertService.removeSubscriberFromAllLocations(user);
        weatherAlertService.sendNotificationToLocation(weatherNotification,location);
        weatherAlertService.sendNotificationToLocation(weatherNotification,locationTwo);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldNotSendNotificationsToAllIfAllUnsubscribed() {
        User userTwo = Mockito.mock(User.class);
        Location locationTwo = Mockito.mock(Location.class);
        User userThree = Mockito.mock(User.class);
        Location locationThree = Mockito.mock(Location.class);

        weatherAlertService.addSubscriber(userTwo, locationTwo);
        weatherAlertService.addSubscriber(user, location);
        weatherAlertService.addSubscriber(userThree, locationThree);

        weatherAlertService.removeSubscriberFromLocation(user, location);
        weatherAlertService.removeSubscriberFromLocation(userTwo, locationTwo);
        weatherAlertService.removeSubscriberFromLocation(userThree, locationThree);

        weatherAlertService.sendNotificationToAll(weatherNotification);

        Mockito.verify(userTwo, Mockito.never()).receive(weatherNotification);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
        Mockito.verify(userThree, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void allShouldBeUnsubbedFromRemovedLocation() {
        User userTwo = Mockito.mock(User.class);
        weatherAlertService.addSubscriber(user,location);
        weatherAlertService.addSubscriber(userTwo,location);
        weatherAlertService.removeLocation(location);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(user);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(userTwo);
    }

    @Test
    public void personShouldNotReceiveNotificationsFromRemovedLocation() {
        weatherAlertService.addSubscriber(user,location);
        weatherAlertService.removeLocation(location);
        weatherAlertService.sendNotificationToLocation(weatherNotification,location);
        Mockito.verify(user, Mockito.never()).receive(weatherNotification);
    }

}
