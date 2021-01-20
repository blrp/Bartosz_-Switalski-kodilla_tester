public class User {
    String UserName;
    int UserAge;
    public User (String Username, int UserAge){
        this.UserName = Username;
        this.UserAge = UserAge;

    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", UserAge=" + UserAge +
                '}';
    }

    public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna, betty, carl, david, eva, frankie};
        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].UserAge;
        }
        double avg = sum / users.length;
        for (int i = 0; i < users.length; i++) {
          int age =  users[i].UserAge;
          if ( age < avg ){
              System.out.println(users[i]);
          }
        }


    }
}

