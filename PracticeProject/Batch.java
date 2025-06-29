public class Batch {
    int batchid;
    int spots;
    String batchName;

    public Batch(int batchid, int spots, String batchName) 
    {
        this.batchid = batchid;
        this.spots = spots;
        this.batchName = batchName;
    }

    public int getSpots() {
        return spots;
    }

    public void setBatchid(int batchid) {
        this.batchid = batchid;
    }

    public void setSpots(int spots) {
        
        this.spots = spots;
    }

    public String getBatchName() {
        return batchName;
    }

    void decrementSpots(){
        if(spots<=0)
        spots--;
    }
    
    void incrementSpots(){
        spots++;
    }

    void displayBatch() {
        System.out.println("Batch Name: " + batchName);
        System.out.println(getSpots());
    }

    public int getBatchid() {
        return batchid;
    }

}
