public class User {
    String name;
    int batchSelected;


    public User(String name) {
        this.name = name;
        batchSelected = -1;
    }

    public String getName() {
        return name;
    }
    

    void selectSlot(){
        System.out.println("Slot selected by "+ name);
    }


    public int getBatchSelected() {
        return batchSelected;
    }

    public void setBatchSelected(int index) {
        this.batchSelected = index;
    }

    public void cancelBooking(){
        this.batchSelected = -1;
}

    @Override
    public String toString() {
        return "User [name=" + name + ", batchSelected=" + batchSelected + "]";
    }

}
