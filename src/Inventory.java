import java.util.*;

public class Inventory {
        private final int MAXTICKETS = 50;
        private int remainingTickets;
        //private double moneyMade;
        private ArrayList<MovieTicket> ticketSoldList;
        
        public Inventory() {
                remainingTickets = MAXTICKETS;
                ticketSoldList = new ArrayList<MovieTicket>();
                //moneyMade = 0;
        }
        
        public void refundTicket(int numOfTickets) throws Exception {
                if (remainingTickets+numOfTickets>50) {
                        throw new Exception();
                }
                else {
                        remainingTickets+= numOfTickets;
                       //while(numOfTickets > 0) {
                        	//ticketSoldList.remove(t);
                        //}
                }
        }
        

        public void sellTicket(int numOfTickets) throws Exception {
                if(remainingTickets-numOfTickets<0)
                        throw new Exception();
                //System.out.println("Error, please try again");
                
                else {
                        remainingTickets-= numOfTickets;
                        //while(numOfTickets>0) {
                        	//ticketSoldList.add(t);
                        	//numOfTickets--;
                        //}
                }
        }
}
