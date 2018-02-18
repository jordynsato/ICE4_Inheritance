import java.util.*;

public class Inventory {
	private final int MAXTICKETS = 50;
	private int remainingTickets, studentTix, adultTix, seniorTix;

	public Inventory() {
		remainingTickets = MAXTICKETS;
		studentTix = 0;
		adultTix = 0;
		seniorTix = 0;
		//ticketSoldList = new ArrayList<MovieTicket>();
	}

	public void refundTicket(int numOfTickets, MovieTicket m) throws Exception {
		if (remainingTickets+numOfTickets>50) {
			throw new Exception();
		}
		else {
			remainingTickets+= numOfTickets;
			if(m.getClass().getName().equalsIgnoreCase("AdultTicket"))
				adultTix-=numOfTickets;
			else if (m.getClass().getName().equalsIgnoreCase("SeniorTicket"))
				seniorTix-=numOfTickets;
			else
				studentTix-=numOfTickets;
		}
	}


	public void sellTicket(int numOfTickets, MovieTicket m) throws Exception {
		if(remainingTickets-numOfTickets<0)
			throw new RuntimeException();
		else {
			remainingTickets-= numOfTickets;
			if(m.getClass().getName().equalsIgnoreCase("AdultTicket"))
				adultTix+=numOfTickets;
			else if (m.getClass().getName().equalsIgnoreCase("SeniorTicket"))
				seniorTix+=numOfTickets;
			else
				studentTix+=numOfTickets;
		}
	}
	
	public int getAdultTixSold() {
		return adultTix;
	}
	
	public int getSeniorTixSold() {
		return seniorTix;
	}
	
	public int getStudentTixSold() {
		return studentTix;
	}
}