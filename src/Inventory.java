
public class Inventory {

	private final int MAXTICKETS = 50;
	private int remainingTickets;
	//private double moneyMade;
	
	public Inventory() {
		remainingTickets = MAXTICKETS;
		//moneyMade = 0;
	}
	
	public void refundTicket(int numOfTickets) {
		remainingTickets+= numOfTickets;
		
	}
	
	public void sellTicket(int numOfTickets) {
		remainingTickets-= numOfTickets;
	}
	
	public int getRemainingTickets() {
		return remainingTickets;
	}

}
