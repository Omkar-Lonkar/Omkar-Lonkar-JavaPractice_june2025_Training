public class Scaner extends Product implements Scannable{
    
    public Scaner(int model, int price) {
        super(model, price);
        //TODO Auto-generated constructor stub
    }

    public void scan() {
        System.out.println("Scanning...");
        }

}
