
public class IceCream extends DessertItem {
	private double price;
	private int calories;
	
	/**
	 * Null construct for IceCream class
	 */
	public IceCream() {
		this("");
	}
	
	/**
	 * Constructor method that passes the name of the Ice Cream
	 * @param name - passes name of ice cream
	 */
	public IceCream(String name) {
		super(name);
	}
	
	/**
	 * sets the price of the ice cream
	 * @param price - passes price of ice cream as a double 
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * gets the price of of the ice cream
	 * @return the price of the ice cream as a double
	 */
	public double getPrice() {
		return this.price;	
	}
	
	/**
	 * sets the calories of the ice cream
	 * @param calories - passes the calories of the ice cream as an integer
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	/**
	 * gets the calories of the ice cream
	 * @return the calories of ice cream as an integer
	 */
	public int getCalories () {
		return this.calories;
	}
	
	/**
	 * gets the total cost of an ice cream as a double
	 * @return the cost of the ice cream
	 */
	@Override
	public double getCost() { 
		return price;
	}
	
	/**
	 * converts the ice cream object data to a string
	 */
	public String toString() {
		String str = "";
		str = String.format("%1s ", this.name);
		return str; 
	}
	
	/**
	* compares 2 items to see which one comes first
	* @param o - item to be compared with
	* @return  -1 if first item is bigger, 1 if second item is bigger and 0 if they are equal
	*/
	@Override
	public int compareTo(Object o) {
		DessertItem other = (DessertItem) o;
  		if(this.getCalories() < other.getCalories()) {
  			return -1;
  		}if(this.getCalories() > other.getCalories()) {
  			return 1;
  		}
  		if(this.getCalories() == other.getCalories()) {
  			return 0;
  		}return 0;
  }

}
