package class36_Constructor;
/**
 * 19.03.2020
 * @author Eagle
 *
 */
public class Stock {
	/*
	 * 1.Variables name, symbol, price, openingPrice, closingPrice 
	 * 2.Methods
	 * getName(), setPrice( double newPrice), getPercentageOfPrice() 
	 * 3.Constructors
	 * default(no-arg) constructor take all of them
	 * 
	 */

	String name;
	String symbol;
	double openingPrice;
	double closingPrice;

	public Stock() {

	}

	public Stock(String newName, String newSymbol, double newOpeningPrice, double newClosingPrice) {

		name = newName;
		symbol = newSymbol;
		openingPrice = newOpeningPrice;
		closingPrice = newClosingPrice;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		openingPrice = price;
	}
	
	public double getPercentageOfPrice() {
		 return ((closingPrice-openingPrice)/closingPrice)*100;
	}
}
