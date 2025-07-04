public class Ticket {
    int tickets = 10;

    public synchronized void bookTicket(String name){
        System.out.println("===================");
        System.out.println("Booking a ticket for " + name);
        if(tickets>0){
            tickets--;
            System.out.println("Ticket bokked for " + name);
            System.out.println("Ticket Available = " + tickets);
        }
        else{
            System.out.println("Sorry, no tickets available");
        }
        System.out.println("===================");
    }
}
