
public class StudentTicket extends MovieTicket implements Sellable {
        
        private double price;
        
        public StudentTicket() {
                price = 10.50;
        }
        
        public double calculatePrice(int numTickets) {
                return numTickets * price;
        }
}
