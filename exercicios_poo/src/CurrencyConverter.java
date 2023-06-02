

public class CurrencyConverter {
	public double price;
	public double amount;
	
	public double priceInReais() {
		return (((6.00/100.00) + 1.00) * price) * amount;
	}
}
