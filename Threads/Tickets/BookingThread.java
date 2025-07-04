public class BookingThread extends Thread{  
    Ticket ticket;
    public void run(){
        ticket.bookTicket(getName());
    }
    public BookingThread(Ticket ticket) {
        this.ticket = ticket;
    }
    
}
