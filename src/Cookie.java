
public class Cookie extends DessertItem{
	private double price;
	private double cost;
	private int cookieNumber;
	private int calories;
	
	/**
	 * Null constructor for cookie class
	 */
	public Cookie() {
		this("");
	} 
	
	/**
	 * Constructor method that passes the name of the cookies
	 * @param name - passes name of cookies 
	 */
	public Cookie(String name) {
		super(name);
	}
	
	/**
	 * sets the price of the cookies
	 * @param price - passes price of cookies as a double 
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * gets the price of of the cookies
	 * @return the price of the cookies as a double
	 */
	public double getPrice() {
		return this.price;
		
	}
	/**
	 * sets the number of cookies the costumer wants
	 * @param cookieNumber - the number of cookies as integer
	 */
	public void setCookieNumb(int cookieNumber) {
		this.cookieNumber = cookieNumber;
	}
	
	/**
	 * gets the number of cookies
	 * @return the number of cookies as double
	 */
	public double getCookieNumber() {
		return this.cookieNumber;
		
	}
	
	/**
	 * sets the calories of the cookies
	 * @param calories - sets the calories as a double
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	/**
	 * gets  the calories of the cookie
	 * @return the calories of the cookies as an integer
	 */
	public int getCalories () {
		return this.calories;
	}
	
	/**
	 * gets the total cost of the cookies 
	 * @return total cost as double
	 */
	@Override
	public double getCost() {
		cost = price /12; //divides the cost of the cookies by 12
		return cost * cookieNumber; // cost = number of cookies * the cost of the each cookie
	}
	/**
	 * converts the cookie object to a string
	 */
	public String toString() { 
		String str = "";
		str = String.format("%d @ %.2f /dz.\n%s", cookieNumber, this.price, this.name);
		return str;
	}
	
	/**
	* compares 2 items to see which one comes first
	* @param l - item to be compared with
	* @return  -1 if first item is bigger, 1 if second item is bigger and 0 if they are equal
	*/
	@Override
	public int compareTo(Object l) {
		DessertItem other = (DessertItem) l;
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
