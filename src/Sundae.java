
public class Sundae extends IceCream{
	private String topping;
	private double toppingPrice;
	private int calories;
	
	/**
	 * Null constructor for Sundae class
	 */
	public Sundae() {
		this("");
	}
	/**
	 * Constructor method that passes the name of the ice cream
	 * @param name - passes name of ice cream
	 */
	public Sundae(String name) {
		super(name);
	}
	/**
	 * sets the toping name
	 * @param topping- passes the name of the toping to be set
	 */
	public void setTopping(String topping) {
		this.topping = topping; 
	}
	/**
	 * gets the name of the toping 
	 * @return the name of the toping
	 */
	public String getTopping() {
		return this.topping;
	}
	
	/**
	 * sets the price of the toping 
	 * @param toppingPrice- passes the price of the toping as a double
	 */
	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	
	/**
	 * gets the price of the toping 
	 * @return the price of the toping as a double
	 */
	public double getTopPrice() {
		return this.toppingPrice;
	}
	
	/**
	 * sets the calories of the sundae
	 * @param calories - sets the calories as a double
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	/**
	 * gets  the calories of the sundae
	 * @return the calories of the sundae as an integer
	 */
	public int getCalories () {
		return this.calories;
	}
	
	/**
	 * gets the cost of the sundae as a double  
	 */
	@Override
	public double getCost() { 
		
		return this.toppingPrice +  super.getCost(); //the cost of the sundae = price of the toping + price of the ice cream
	}
	
	/**
	 * converts the object data to a string 
	 */
	public String toString() { 
		String str = "";
		str = String.format("%s Sundae with\n%s", this.topping, this.name);
		return str;
	}

}
