
public class SeniorTicket extends AdultTicket implements Sellable {
        
        public SeniorTicket() {
                setTicketPrice(10.00);
        }
        
        public double calculatePrice(int numTickets) {
                return getTicketPrice() * numTickets;
        }
}
