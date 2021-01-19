public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 600 || this.price < 1000) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 600 || this.weight < 2000) {
            System.out.println("This notebook is not very heavy.");
        } else{
            System.out.println("This nootebook is heavy.");
        }
    }
    public void Notebook() {
        if (this.price > 1000 || this.year >2019) {
            System.out.println("This notebook is young.");
        } else if (this.price < 1000 || this.year < 2018) {
            System.out.println("This notebook is not young.");
        } else{
            System.out.println("This nootebook is old.");
}
