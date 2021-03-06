import java.util.Scanner;

/**
 * This class takes in user input to find how many tickets a person wants to purchase for a movie.
 * 
 * Last update: 2/17/18 at 4:35 PM
 * @author Team Matcha: Serena Ing, Nana Mimura, Jordyn Sato
 */
public class Driver {

	//Fields
	private static Inventory bp = new Inventory();
	private static Inventory gs = new Inventory();
	private static Inventory j = new Inventory();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean rerunFlag = true;
		System.out.println("Welcome to Matcha Movies!");
		do {
			//Gets the user option to buy or refund a ticket
			boolean rerunOpt = true;
			int option = 0;
			do {
				try {
					System.out.println("Would you like to buy (1) or return (2) a ticket?");
					if(scan.hasNextLine()) {
						option = scan.nextInt();
						if(option != 1 && option != 2) {
							System.out.println("Please choose 1 or 2.");
							scan.nextLine();
							continue;
						}
						rerunOpt = false;
					}
				} catch(Exception e) {
					System.out.println("Please enter in a valid option.");
					scan.nextLine();
					continue;
				}
			} while(rerunOpt);
			
			//Gets movie option
			boolean rerunMovie = true;
			int movie = 0;
			do {
				try {
					System.out.println("Please enter the numbered movie you would like to see:");
					System.out.println("Black Panther(1), The Greatest Showman(2), Jumanji(3)");
					if(scan.hasNextLine()) {
						movie = scan.nextInt();
						if(movie != 1 && movie != 2 && movie != 3) {
							System.out.println("Please choose a valid movie option.");
							scan.nextLine();
							continue;
						}
						rerunMovie = false;
					}
				} catch(Exception e) {
					System.out.println("Please enter a valid option.");
					scan.nextLine();
					continue;
				}
			} while(rerunMovie);
			
			//Checks if user wants to buy or return a ticket
			String opt;
			if(option == 1) {
				opt = "buy";
			}
			else {
				opt = "return";
			}
			
			//Checks the type of ticket
			boolean rerunType = true;
			int ticketType = 0;
			MovieTicket m;
			do {
				try {
					System.out.printf("What kind of ticket would you like to %s?\n", opt);
					System.out.println("Adult Ticket(1), Senior Ticket(2), Student Ticket(3)");
					if(scan.hasNextLine()) {
						ticketType = scan.nextInt();
						if(ticketType != 1 && ticketType != 2 && ticketType != 3) {
							System.out.println("Please choose a valid ticket option.");
							scan.nextLine();
							continue;
						}
						rerunType = false;
					}
				} catch(Exception e) {
					System.out.println("Please enter in a valid option.");
					scan.nextLine();
					continue;
				}
			} while(rerunType);
			
			//Gets the quantity of tickets
			boolean rerunNum = true;
			int num = 0;
			do {
				System.out.println("Please enter the quantity.");
				try {
					if(scan.hasNextLine()) {
						num = scan.nextInt();
					}
					rerunNum = false;
				} catch(Exception e) {
					System.out.println("Please enter in a valid quantity.");
					scan.nextLine();
					continue;
				}
			} while(rerunNum);
			
			//Determines what type of MovieTicket is bought
			switch(ticketType) {
				case 1:
					m = new AdultTicket();
					break;
				case 2:
					m = new SeniorTicket();
					break;
				case 3:
					m = new StudentTicket();
					break;
				default:
					m = null;
			}
			
			//Buys or refunds the tickets
			try {
				switch(option) {
					case 1:
						switch(movie) {
							case 1:
								bp.sellTicket(num, m);
								break;
							case 2:
								gs.sellTicket(num, m);
								break;
							case 3:
								j.sellTicket(num, m);
								break;
						}
						break;
					case 2:
						switch(movie) {
							case 1:
								bp.refundTicket(num, m);
								break;
							case 2:
								gs.refundTicket(num, m);
								break;
							case 3:
								j.refundTicket(num, m);
								break;
						}
						
				}
			} catch(Exception e) {
				System.out.printf("Unable to %s that many tickets.\n", opt);
			}
			
			//Checks to see if the user wants to rerun the program
			System.out.println("Would you like to rerun the program? (Y/N)");
			String response = scan.next();
			if(!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("YES")) {
				rerunFlag = false;
				//Prints out the results of the day
				System.out.println("Here are the number of tickets sold for each movie:");
				System.out.printf("Black Panther:\n\tAdult Tickets: %d\n\tSenior Tickets: %d\n\tStudent Tickets: %d\n",
						bp.getAdultTixSold(), bp.getSeniorTixSold(), bp.getStudentTixSold());
				System.out.printf("The Greatest Showman:\n\tAdult Tickets: %d\n\tSenior Tickets: %d\n\tStudent Tickets: %d\n",
						gs.getAdultTixSold(), gs.getSeniorTixSold(), gs.getStudentTixSold());
				System.out.printf("Jumanji:\n\tAdult Tickets: %d\n\tSenior Tickets: %d\n\tStudent Tickets: %d\n",
						j.getAdultTixSold(), j.getSeniorTixSold(), j.getStudentTixSold());
				System.out.println("Thank you for using this program!");
			}
			scan.nextLine();
		} while(rerunFlag);
		scan.close();
	}
}