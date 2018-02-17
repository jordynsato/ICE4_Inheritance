import java.util.*;

public class Inventory {
        private final int MAXTICKETS = 50;
        private int remainingTickets;
        
        public Inventory() {
                remainingTickets = MAXTICKETS;
                ticketSoldList = new ArrayList<MovieTicket>();
        }
        
        public void refundTicket(int numOfTickets) throws Exception {
                if (remainingTickets+numOfTickets>50) {
                        throw new Exception();
                }
                else {
                        remainingTickets+= numOfTickets;
                }
        }
        

        public void sellTicket(int numOfTickets) throws Exception {
                if(remainingTickets-numOfTickets<0)
                        throw new RuntimeException();
                else {
                        remainingTickets-= numOfTickets;
                }
        }
}
