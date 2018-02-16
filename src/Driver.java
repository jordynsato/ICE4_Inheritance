import java.util.Scanner;

/**
 * This class takes in user input to find how many tickets a person wants to purchase for a movie.
 * 
 * Last update: 2/16/18 at 2: PM
 * @author Team Matcha: Serena Ing, Nana Mimura, Jordyn Sato
 */
public class Driver {
        
        //Fields
        private static MovieTicket bp = new MovieTicket();
        private static MovieTicket gs = new MovieTicket();
        private static MovieTicket j = new MovieTicket();
        
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
                        
                        //When the user wants to buy a ticket
                        if(option == 1) {
                                System.out.println("What type of ticket would you like to buy?");
                                
                        }
                        //When the user wants to return a ticket
                        else {
                                System.out.aprintln("What type of ticket are you returning?");
                                
                        }
                        
                        //Checks to see if the user wants to rerun the program
                        System.out.println("Would you like to rerun the program?");
                        String response = scan.next();
                        if(!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("YES")) {
                                rerunFlag = false;
                                System.out.println("Thank you for using this program!");
                        }
                        scan.nextLine();
                } while(rerunFlag);
                scan.close();
                System.out.println("End program");
        }
        
}
