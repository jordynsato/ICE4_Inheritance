import java.util.Scanner;

/**
 * This class takes in user input to find how many tickets a person wants to purchase for a movie.
 * 
 * Last update: 2/16/18 at 3:48 PM
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
			
			//Buys or refunds the tickets
			try {
				switch(option) {
					case 1:
						switch(movie) {
							case 1:
								bp.sellTicket(num);
								break;
							case 2:
								gs.sellTicket(num);
								break;
							case 3:
								j.sellTicket(num);
								break;
						}
						break;
					case 2:
						switch(movie) {
							case 1:
								bp.refundTicket(num);
								break;
							case 2:
								gs.refundTicket(num);
								break;
							case 3:
								j.sellTicket(num);
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
				System.out.println("Thank you for using this program!");
			}
			scan.nextLine();
		} while(rerunFlag);
		scan.close();
	}
}