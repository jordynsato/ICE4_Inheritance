/** 
 * 
 * @author Serena Ing, Jordyn Sato, Nana Mimura = Team Matcha
 * 2/16/18
 *
 */
public class AdultTicket extends MovieTicket implements Sellable {
        private double price;
        
        public AdultTicket() {
                price = 13.50;
        }
        
        public double getPrice() {
                return price;
        }
        public void setPrice(double p) {
                price = p;
        }
        
        @Override public double calculatePrice(int quantity) {
                return quantity * price;
        }
}
