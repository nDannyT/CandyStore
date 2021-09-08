
public class Candy extends DessertItem{
	private double price;
	private double weight;
	private int calories;
	
	/**
	 * Null constructor for candy class
	 */
	public Candy() {
		this("");
	}
	
	/**
	 * Constructor method that passes the name of the candies
	 * @param name - passes name of candies 
	 */
	public Candy(String name) {
		super(name);
	}
	
	/**
	 * sets the price of the candies
	 * @param price - passes price of candies as a double 
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * gets the price of of the candies
	 * @return the price of the candies as a double
	 */
	public double getPrice() {
		return this.price;
		
	}
	/**
	 * sets the weight of the candies
	 * @param weight - passes the weight of the candies
	 */
	public void setWeight(double weight2) {
		this.weight = weight2;
	}
	
	/**
	 * gets the weight of the candies
	 * @return the weight of the candies
	 */
	public double getWeight() {
	
		return this.weight;	 
	}
	
	/**
	 * sets the calories of the candies
	 * @param calories - sets the calories of the candies as a double
	 */
	 
	public void setCalories(int calories) {
		this.calories = calories; 
	}
	 
	/**
	 * gets  the calories of the candies
	 * @return the calories of the candies as an integer
	 */
	public int getCalories () {
		return this.calories;
	}
	
	/**
	 * gets the total cost of the candies 
	 * @return total cost of candy as double
	 */
	@Override
	public double getCost() {
		return price * weight; // cost = price of the candy * weight of candies
	}
	
	/**
	 * converts the candy object to a string
	 */
	public String toString() {
		String str = "";
		str = String.format("%.2f lbs. @ %.2f /lbs.\n%s\t%.2f  ", this.getWeight(), getPrice(), this.getName(), this.getCost());
		return str;
	} 
	

	/**
	* compares 2 items to see which one comes first
	* @param k - item to be compared with
	* @return  -1 if first item is bigger, 1 if second item is bigger and 0 if they are equal
	*/
	@Override
	public int compareTo(Object k) {
		DessertItem other = (DessertItem) k;
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
