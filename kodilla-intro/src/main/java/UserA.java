public class UserA {

    static String name = "Adam";
    static double age = 40.5;
    static double height = 178;

    public UserA(String name, double age, double height) {
        this.name = name;
        this.age = age;
        UserA.height = height;
    }

    public static void showInfo() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}







