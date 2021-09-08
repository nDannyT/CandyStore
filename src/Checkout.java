
import java.util.ArrayList;
import java.util.Collections;

public class Checkout {
	private ArrayList <DessertItem> items;
	private double tax;
	
	/** 
	 * Null constructor for CheckOut class
	 */
	public Checkout() {
		this.tax = 0;
		items = new ArrayList<DessertItem>();
	}
	
	/**
	 * Constructor method that creates a new items array list and sets the tax
	 * @param tax - passes the tax of each DesserItem
	 */
	public Checkout(double tax) { 
		this.tax = tax;
		items = new ArrayList<DessertItem>();
	}
	
	/**
	 * deletes the items from items Array List
	 */
	public void clear() {
		this.items.clear();
		
	}
	
	/**
	 * adds items into the DessertItem arrayList
	 * @param items - passes the items to be added into the array List
	 */
	public void enterItem(DessertItem items) {
			this.items.add(items);
	}
	
	public ArrayList<DessertItem> getItems(){
		return this.items;
	}
	
	/**
	 * gets the number of items purchase
	 * @return the number of items purchase
	 */
	public int numberOfItems() {
		  return items.size();
	}
	
	/**
	 * sets the tax of DesserItem
	 * @param tax - passes the tax of DessertItem
	 */
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	/**
	 * gets the tax of DessertItem
	 * @return the tax of DessertItem
	 */
	public double getTax() {
		return this.tax;
	}
	
	/**
	 * gets the total of the purchase of DesserItem before tax
	 * @return the total of the purchase before tax as a double
	 */
	public double totalCost() {
		double cost = 0;
		for(DessertItem item: items) {
			cost += item.getCost() + (item.getCost() * this.tax);
		} 
		return cost;
	}

	/**
	 * gets the total of the purchase of DesserItem
	 * @return the total of the purchase as double
	 */
	public double totalTax() {
		double tax = 0;
		for(DessertItem item: items) {
			tax += (item.getCost() * this.tax);
		}
		return tax;
		
	}
	
	/**
	 * sort the DesserItem in order by calories
	 */
	 public void sortDessertItems(ArrayList<DessertItem> sCart) {
		 for (int i = 1; i < sCart.size(); i++) {   
			 	DessertItem key2 = sCart.get(i);
		        int key = sCart.get(i).getCalories(); 
		        int j = i - 1;
		        while (j >= 0 && sCart.get(j).getCalories() > key) {
		        	sCart.set(j + 1, sCart.get(j));
		            j = j - 1;
		        }
		        sCart.set(j + 1, key2);  
		 }	 
	}
	 
	 /**
	  * converts the object to string
	  */
	 public String toString() {
		 String str = "\nDanny and Nikko's Dessert Shop\n==============================\n";
		 for(DessertItem item: this.items) { 
			 str+= String.format("%s\t\t$%6.2f\t\t\n", item.toString(), item.getCost());
		 }
		 str += String.format("\nTax:\t\t\t\t$%6.2f\nTotal Cost:\t\t\t$%6.2f", this.totalTax(), this.totalCost());
		 return str;
	 } 
	
}

