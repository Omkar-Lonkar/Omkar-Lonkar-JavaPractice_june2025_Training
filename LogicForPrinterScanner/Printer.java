public class Printer extends Product implements Printable {
    

    public Printer(int model, int price) {
        super(model, price);
        //TODO Auto-generated constructor stub
    }

    String func = "Printer";

    public void print() {
        System.out.println("Printing...");
        }

}
