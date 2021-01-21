public class Application {
    public static void main(String[] args) {
        UserA userA = new UserA("Adam", 40.5, 178);
        System.out.println(UserA.name + " " + UserA.age + " " + UserA.height);
        UserA.showInfo();
    }

}
