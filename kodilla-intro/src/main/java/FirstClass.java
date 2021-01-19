public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 1000,2018);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook("2000g", 1500,2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + notebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook("1600g", 500,2014);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + notebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

    }
}
