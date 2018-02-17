/**
 * Last edited: 2/16/18 3:18 pm
 * @author Team Matcha
 */
public abstract class MovieTicket implements Sellable{
        
        //private Inventory inv;
        private String movie;
        
        public MovieTicket() {
                //inv = new Inventory();
                movie = "";
        }
        
        public MovieTicket(String movie) {
                this.movie = movie;
                //inv = new Inventory();
        }
        
        public String getMovieName() {
                return movie;
        }
        
        public void setMovieName(String newMovie) {
                movie = newMovie;
        }
        
        public abstract double calculatePrice(int numTickets);
}
