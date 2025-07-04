public class TestProduct extends Product {
    public TestProduct(int model, int price) {
        super(model, price);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Printer printer = new Printer(1, 10000);
        Scaner scaner = new Scaner(2, 10000);

        TestProduct tp = new TestProduct(101, 15000);
        tp.printer.print();


        
        }
}
