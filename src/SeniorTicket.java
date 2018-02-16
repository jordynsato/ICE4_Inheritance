
public class SeniorTicket extends AdultTicket implements Sellable{
	private double price;
	
	public SeniorTicket() {
		price = 10.00;
	}

	public double getPrice() {
		return price;
	}
	
	@Override public double calculatePrice(int quantity) {
		return quantity * price;
	}
}
