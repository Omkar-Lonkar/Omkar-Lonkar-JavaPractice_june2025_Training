import java.util.Scanner;

public class Badminton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Batch batches[] = {
                new Batch(0, 5, "6am - 7am"),
                new Batch(1, 5, "7am - 8am"),
                new Batch(2, 0, "8am - 9am"),
                new Batch(3, 5, "6pm - 7pm"),
                new Batch(4, 5, "7pm - 8pm"),
                new Batch(5, 5, "8pm - 9pm"),
        };
        System.out.println("Enter Number of users: ");
        User[] user= new User[Integer.parseInt(sc.nextLine())];
        for(int i=0; i<user.length; i++){
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            user[i] = new User(name);
        int choice = 0;
        while (choice != 5) {
            System.out.println("Enter your choice: \n 1. See slots \n 2. Book a Slot  \n 3. Cancel Booking \n 4. User Details \n 5. Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (Batch batch : batches) {
                        System.out.println(batch.getBatchid() + ". " + batch.getBatchName() + "->  Slots: " + batch.getSpots());
                    }
                    break;

                case 2:
                    for (Batch batch : batches) {
                            System.out.println(batch.getBatchid() + ". " + batch.getBatchName() + "->  Slots: " + batch.getSpots());
                    }

                    System.out.println("Select batch number");
                    int num = Integer.parseInt(sc.nextLine());
                    if (0 <= num && num < batches.length) {
                        Batch selectedBatch = batches[num];
                        if(selectedBatch.spots>0){
                        selectedBatch.decrementSpots();
                        user.setBatchSelected(num);
                        System.out.println("Batch Selected: " + selectedBatch.batchName);
                        }
                        else
                            System.out.println("Sorry Batch is full");
                    } else
                        System.out.println("Invalid Batch");
                    break;

                case 3:
                    if (user.getBatchSelected() == -1){
                        System.out.println("No bookings made.");}
                    else{
                    batches[user.getBatchSelected()].incrementSpots();
                    user.setBatchSelected(-1);}
                    System.out.println("Your booking has been cancelled.");
                    break;

                case 4:
                    System.out.println(user.toString());
                case 5:
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }
        System.out.println("Thank you!!");
    }
}
}