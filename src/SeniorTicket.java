/**
 * Last edit: 2/16/18 3:53pm
 * @author Team Matcha
 * 
 * This class creates a new type of movie ticket called SeniorTicket which is a subclass of AdultTicket. The price for this ticket is $10.00.
 **/
public class SeniorTicket extends AdultTicket implements Sellable {
        
        public SeniorTicket() {
                setTicketPrice(10.00);
        }
        
        public double calculatePrice(int numTickets) {
                return getTicketPrice() * numTickets;
        }
}
