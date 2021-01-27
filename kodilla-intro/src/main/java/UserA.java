public class UserA {

    String UserName;

     double UserAge;

     double UserHeight;

    public UserA(String UserName, double UserAge, double UserHeight) {
        this.UserName = UserName;
        this.UserAge = UserAge;
        this.UserHeight = UserHeight;
    }

    public void showInfo() {
        if (UserName != null) {
            if (UserAge > 30 && UserHeight > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}







