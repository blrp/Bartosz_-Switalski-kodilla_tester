package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOverEqual40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();

        System.out.println("Average numberOfPost of users over or equal to 40 yo: " + avgOverEqual40);

        double avgLess40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();

        System.out.println("Average numberOfPost of users less to 40 yo: " + avgLess40);

    }
}
