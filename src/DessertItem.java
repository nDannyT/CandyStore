
public abstract class DessertItem implements Comparable  {

	  protected String name;
	  protected int calories; 
		  
	/**		 
	 * Null constructor for DessertItem class
	 */
	  public DessertItem() {
		  this("");
	  }
		  
	/**
	 * Initializes DessertItem data
	 * @param name - name of DessertItem
	 */
	 public DessertItem(String name) {
	      this.name = name;
	 }
		  
	/**
	 * Returns name of DessertItem
	 * @return name of DessertItem
	 */
	 public final String getName() {
		 return name;
	 }
		  
	/**
	 * Returns cost of DessertItem
	 * @return cost of DessertItem
	 */
	  public abstract double getCost();
		  
	 /**
	  * Returns the calories of DesserItem
	  * @return calories of DesserItem
	  */
	  public abstract int getCalories();
	  
	  /**
		  * Sets a value for the calories of DesserItem
		  * @return calories of DesserItem
		  */
	 
		  
	/**
	 * compares 2 items to see which one comes first
	 * @param x - item to be compared with
	 * @return  -1 if first item is bigger, 1 if second item is bigger and 0 if they are equal
	 */
	  public int CompareTo(Object x) {
		  DessertItem other = (DessertItem) x; 
		  if(this.getCalories() < other.getCalories()) {
			  return -1;
		  }
		  if(this.getCalories() > other.getCalories()) {
			  return 1;
		  }
		  if(this.getCalories() == other.getCalories()) { 
			  return 0;
		  	}
		  return 0;
		  } 
		  
		  /**
		   * uses the compareTo method to return the biggest of the 2 items compared
		   * @param a - first item to be compared
		   * @param b - second item to be compared
		   * @return the larger of any DesserItems
		   */
		  public static String max(DessertItem a, DessertItem b) {
			  int temp = a.compareTo(b);
			  if(temp == 1) {
				return a.getName();
			  }else if(temp == -1) {
				 return b.getName(); 
			  }else {
				  return "Both items have the same amount of calories.";
			  }  
		  }

		
		}			
