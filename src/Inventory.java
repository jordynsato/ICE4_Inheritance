

public class Inventory {
	private final int MAXTICKETS = 50;
	private int remainingTickets;
	//private double moneyMade;
	
	public Inventory() {
		remainingTickets = MAXTICKETS;
		//moneyMade = 0;
	}
	
	public void refundTicket(int numOfTickets) throws RuntimeException {
		if (remainingTickets+numOfTickets>50) {
			throw new RuntimeException();
		}
		else
			remainingTickets+= numOfTickets;
		
	}
	
	public void sellTicket(int numOfTickets) throws RuntimeException {
		if(remainingTickets<0)
			throw new RuntimeException();
			//System.out.println("Error, please try again");
			
		else
			remainingTickets-= numOfTickets;
	}
	
	public int getRemainingTickets() {
		return remainingTickets;
	}
}
