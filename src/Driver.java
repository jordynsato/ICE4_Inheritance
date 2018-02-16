import java.util.Scanner;

/**
 * This class takes in user input to find how many tickets a person wants to purchase for a movie.
 * 
 * Last update: 2/16/18 at 2: PM
 * @author Team Matcha: Serena Ing, Nana Mimura, Jordyn Sato
 */
public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean rerunFlag = true;
		System.out.println("Welcome to Matcha Cinemas!");
		
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
							System.out.println("");
						}
					}
				} catch(Exception e) {
					
				}
			} while(rerunOpt);
			//Gets movie option
			boolean rerunMovie = true;
			do {
				try {
					System.out.println("Please enter the numbered movie you would like to see:");
					System.out.println("Black Panther(1), ");
				} catch(Exception e) {
					
				}
			} while(rerunMovie);
			
		} while(rerunFlag);
	}

}
