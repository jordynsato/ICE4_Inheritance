
public abstract MovieTicket implements Sellable{
        
        private int inventory;
        private String movie;
        private static final int MAX_INVENTORY = 50;
        
        public MovieTicket() {
                inventory = 0;
                movie = "";
        }
        
        public MovieTicket(String movie) {
                this.movie = movie;
                inventory = MAX_INVENTORY;
        }
        
        public String getMovieName() {
                return movie;
        }
        
        public void setMovieName(String newMovie) {
                movie = newMovie;
        }
        
        public abstract refundTicket(int numTickets, double ticketPrice);
        
        public abstract sellTIcket(int numTickets);
}
