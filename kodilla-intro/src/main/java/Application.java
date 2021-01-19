public class Application {
    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        public Notebook(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public void checkAge() {
            if (this.age < 45) {
                System.out.println("This user is young.");
            } else if (this.age > 45 || this.age < 100) {
                System.out.println("This user is  old.");
            } else {
                System.out.println("This user is in average age.");
            }
        }
        public void checkHeight() {
            if (this.height < 170) {
                System.out.println("This user is short.");
            } else if (this.height > 170 || this.height < 210) {
                System.out.println("This user is tall.");
            } else{
                System.out.println("This user is in medium height.");
            }
