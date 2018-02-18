import java.util.*;

public class Inventory {
	private final int MAXTICKETS = 50;
	private int remainingTickets, studentTix, adultTix, seniorTix;

	public Inventory() {
		remainingTickets = MAXTICKETS;
		studentTix = 0;
		adultTix = 0;
		seniorTix = 0;
	}

	public void refundTicket(int numOfTickets, MovieTicket m) throws Exception {
		String typeOfTix = m.getClass().getName();
		
		switch(typeOfTix) {
			case "AdultTicket":
				if(numOfTickets > adultTix)
					throw new Exception();
				break;
			case "StudentTicket":
				if(numOfTickets > studentTix)
					throw new Exception();
				break;
			default:
				if(numOfTickets > seniorTix)
					throw new Exception();
				break;
		}
		
		if (remainingTickets+numOfTickets>50) {
			throw new Exception();
		}
		else {
			remainingTickets+= numOfTickets;
			if(typeOfTix.equalsIgnoreCase("AdultTicket"))
				adultTix-=numOfTickets;
			else if (typeOfTix.equalsIgnoreCase("SeniorTicket"))
				seniorTix-=numOfTickets;
			else
				studentTix-=numOfTickets;
		}
	}


	public void sellTicket(int numOfTickets, MovieTicket m) throws Exception {
		String typeOfTix = m.getClass().getName();
		
		if(remainingTickets-numOfTickets<0)
			throw new RuntimeException();
		else {
			remainingTickets-= numOfTickets;
			if(typeOfTix.equalsIgnoreCase("AdultTicket"))
				adultTix+=numOfTickets;
			else if (typeOfTix.equalsIgnoreCase("SeniorTicket"))
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