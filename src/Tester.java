import java.util.Scanner;
import java.util.ArrayList;

public class Tester {
	
	public static int displayDessertMenu(Scanner console) {								//Displays Menu of Desserts that User Chooses From
		System.out.println("Hello, What Would You Like?");	
		System.out.println("1.Cookie\n2.Ice Cream\n3.Sundae\n4.Candy\n5.Finished");
		System.out.print("Choice: ");
		
		int choice = console.nextInt();
		return choice;
	}
	
	public static DessertItem displayCandyMenu(Scanner console) {
		System.out.println("Candy (Price Per Pound): ");
		System.out.printf("1.%s\t%.2f\n2.%s\t%.2f\n3.%s\t%.2f\n4.%s\t%.2f\n5.%s\t%.2f", "Starburst", 0.80, "Snickers", 0.75, "Gummy Bears", 0.50, "Gummy Worms", 0.60, "Jawbreakers", 0.25);
		System.out.print("\nChoice: ");
		int choice = console.nextInt();
		System.out.println("How Many Pounds?");
		int weight = console.nextInt();
		
		Candy obj = new Candy();															//Used Default Constructor
		
		switch(choice) {															//Choice of Candy						
			case 1:	
				obj = new Candy("Starburst");										//Overloaded Constructor
				obj.setWeight(weight);
				obj.setPrice(0.80);
				obj.setCalories(45 * weight);
				break;
			case 2:					
				obj = new Candy("Snickers");
				obj.setWeight(weight);
				obj.setPrice(0.75);
				obj.setCalories(65 * weight);


				break;
			case 3:					
				obj = new Candy("Gummy Bears");
				obj.setWeight(weight);
				obj.setPrice(0.50);
				obj.setCalories(50 * weight);


				break;
			case 4:								
				obj = new Candy("Gummy Worms");
				obj.setWeight(weight);
				obj.setPrice(0.60);
				obj.setCalories(37 * weight);


				break;
			case 5:
				obj = new Candy("Jawbreakers");
				obj.setWeight(weight);
				obj.setPrice(0.25);
				obj.setCalories(33 * weight);

				break;
		}
		
		return obj;
	}
	
	public static DessertItem displayCookieMenu(Scanner console) {
		System.out.println("Cookie (Price Per Quantity): ");
		System.out.printf("1.%s\t%.2f\n2.%s\t%.2f\n3.%s\t%.2f\n4.%s\t%.2f\n5.%s\t%.2f", "Chocolate Chip Cookie", 0.75, "Macademia Cookie", 1.25, "Chocolate Cookie", 1.50, "Snickerdoodle Cookie", 0.90, "Peanut Butter Cookie", 0.50);
		System.out.print("\nChoice: ");
		int choice = console.nextInt(); 
		System.out.println("How Many?"); 
		int num = console.nextInt();
		
		Cookie obj = new Cookie();													//Used Default Constructor
		
		switch(choice) {															//Choice of Candy						
			case 1:	
				obj = new Cookie("Chocolate Chip Cookie");										//Overloaded Constructor
				obj.setCookieNumb(num);
				obj.setPrice(0.75);
				obj.setCalories(150);
				break;
			case 2:					
				obj = new Cookie("Macademia Cookie");
				obj.setCookieNumb(num);
				obj.setPrice(1.25);
				obj.setCalories(130);


				break;
			case 3:					
				obj = new Cookie("Chocolate Cookie");
				obj.setCookieNumb(num);
				obj.setPrice(1.50);
				obj.setCalories(190);


				break;
			case 4:								
				obj = new Cookie("Snickerdoodle Cookie");
				obj.setCookieNumb(num);
				obj.setPrice(0.90);
				obj.setCalories(350);


				break;
			case 5:
				obj = new Cookie("Peanut Butter Cookie");
				obj.setCookieNumb(num);
				obj.setPrice(0.50);
				obj.setCalories(180);

				break;
		}
		
		return obj;
	}

	public static DessertItem displayIceCreamMenu(Scanner console) {
		System.out.println("Ice Cream: ");
		System.out.printf("1.%s\t%.2f\n2.%s\t%.2f\n3.%s\t%.2f\n4.%s\t%.2f\n5.%s\t%.2f", "Vanilla Ice Cream", 1.50, "Chocolate Ice Cream", 1.75, "Cookies and Cream Ice Cream", 1.90, "Mango Ice Cream", 2.00, "Peanut Butter Fudge Ice Cream", 1.80);
		System.out.print("\nChoice: ");
		int choice = console.nextInt();
		
		
		IceCream obj = new IceCream();												//Used Default Constructor
		switch(choice) {															//Choice of Candy						
			case 1:	
				obj = new IceCream("Vanilla Ice Cream");							//Overloaded Constructor
				obj.setPrice(1.50);
				obj.setCalories(90);

				break;
			case 2:					
				obj = new IceCream("Chocolate Ice Cream");
				obj.setPrice(1.75);
				obj.setCalories(135);


				break;
			case 3:					
				obj = new  IceCream("Cookies and Cream Ice Cream");
				obj.setPrice(1.90);
				obj.setCalories(120);

 
				break;
			case 4:								
				obj = new IceCream("Mango Ice Cream");
				obj.setPrice(2.00);
				obj.setCalories(110);


				break;
			case 5:
				obj = new IceCream("Peanut Butter Fudge Ice Cream");
				obj.setPrice(1.80);
				obj.setCalories(115);

				break;
		}
		
		return obj;
	}
	
	public static DessertItem displaySundaeMenu(Scanner console) {
		IceCream Ic = (IceCream) displayIceCreamMenu(console);							//Converts the DessertItem object to IceCream
		System.out.println("Sundaes: ");
		System.out.printf("1.%s\t%.2f\n2.%s\t%.2f\n3.%s\t%.2f\n4.%s\t%.2f\n5.%s\t%.2f", "Reeses's Minis Sundae", 0.20, "M & M's Sundae", 0.25, "Wafer Sundae", 0.15, "Strawberry Sundae", .35, "Chicken Sundae", .40);
		System.out.print("\nChoice: ");
		int choice = console.nextInt();
		
		Sundae obj = new Sundae();												//Used Default Constructor
		switch(choice) {															//Choice of Candy						
			case 1:	
				obj = new Sundae(Ic.getName());							//Overloaded Constructor
				obj.setTopping("Reeses's Minis Sundae");
				obj.setPrice(Ic.getPrice());
				obj.setToppingPrice(0.20);
				obj.setCalories(30);

				break;
			case 2:					
				obj = new Sundae(Ic.getName());	
				obj.setTopping("M & M's Sundae");
				obj.setPrice(Ic.getPrice());
				obj.setToppingPrice(0.25);
				obj.setCalories(50); 


				break;
			case 3:
				obj = new Sundae(Ic.getName());	
				obj.setTopping("Wafer Sundae");
				obj.setPrice(Ic.getPrice());

				obj.setToppingPrice(0.15);
				obj.setCalories(70);


				break;
			case 4:		
				obj = new Sundae(Ic.getName());	
				obj.setTopping("Strawberry Sundae");
				obj.setPrice(Ic.getPrice());

				obj.setToppingPrice(0.35);
				obj.setCalories(58);


				break;
			case 5:
				obj = new Sundae(Ic.getName());	
				obj.setTopping("Chicken Sundae");
				obj.setPrice(Ic.getPrice());
				obj.setToppingPrice(0.40);
				obj.setCalories(125);

				break;
		}
		
		return obj; 
		
	}
	
	public static void printShoppingCart(ArrayList<DessertItem> sCart) {
		for(DessertItem n: sCart) {
			System.out.println("Item: " + n.getName() + " Calories: " + n.getCalories());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<DessertItem> shoppingCart = new ArrayList<DessertItem>();				//User's Shopping Cart
		Scanner console = new Scanner(System.in);										//Implementing Scanner Library to Ask User For Input
		
		int choice; 
		do{
			choice = displayDessertMenu(console);  
			switch(choice) {															//Displays Correct Dessert Menu From User Choice						
				case 1:																	//Cookie Menu
					shoppingCart.add(displayCookieMenu(console));	
					break;
				case 2:																	//Ice Cream Menu
					shoppingCart.add(displayIceCreamMenu(console));
					break;
				case 3:																	//Sundae Menu
					shoppingCart.add(displaySundaeMenu(console));
					break;
				case 4:																	//Candy Menu
					shoppingCart.add(displayCandyMenu(console));
					break;
			
			}
		}while(choice != 5);															//Keep Adding To Shopping Cart Until User Stops
		
		
		//Checkout Time
		Checkout register = new Checkout();
		register.setTax(0.09);															//Tax Rate = 9%
		
		for(DessertItem n: shoppingCart){												//Adds the Shopping Cart List to Register
			register.enterItem(n);
		} 
		
		//Comparing Objects
		Candy c2 = new Candy("(Candy) Powder");
		c2.setCalories(6);
		c2.setPrice(1.00);
		c2.setWeight(1);
		
		Candy c = new Candy("(Candy) Gummy");
		c.setCalories(10);
		c.setPrice(4.50);
		c.setWeight(3);
		
		IceCream iC2 = new IceCream();
		IceCream iC = new IceCream("(IceCream) Pumpkin Pie");
		iC.setCalories(100);
		iC.setPrice(3.50);
		
		Cookie cK2 = new Cookie();
		Cookie cK = new Cookie("(Cookie)Choco");
		cK.setCalories(50);
		cK.setCookieNumb(12);
		cK.setPrice(1);

		Sundae s = new Sundae(iC.getName());
		s.setCalories(35);
		s.setTopping("(Sundae)Mango");
		s.setToppingPrice(0.50);
		s.setPrice(iC.getPrice());
		
		System.out.println("Max(" + c.getName() +"," + c2.getName() + " = " + DessertItem.max(c,c2)); 			//Candy v. Candy
		System.out.println("Max(" + c.getName() +"," + iC.getName() + " = " + DessertItem.max(c,iC)); 			//Candy v. Ice Cream
		System.out.println("Max(" + iC.getName() +"," + s.getName() + " = " + DessertItem.max(iC,s)); 			//Ice Cream v. Sundae
		System.out.println("Max(" + s.getName() +"," + iC.getName() + " = " + DessertItem.max(s,iC)); 			//Sundae v. Ice Cream

		
		
		System.out.println("\nNumber of Items: " + register.numberOfItems()); 
		System.out.printf("Total Cost: %.2f\n",register.totalCost());
		System.out.printf("Total Tax: %.2f\n", register.totalTax());
		System.out.printf("Total Cost + Total Tax: %.2f\n", (register.totalCost() + (register.getTax() * register.totalCost())));
		System.out.println("" + register);										//Prints out the Receipt
		
		System.out.println("=======================================");
		System.out.println("List (Before Sort): ");
		printShoppingCart(shoppingCart);
		System.out.println();
		
		System.out.println("List (After Sort): ");
		register.sortDessertItems(shoppingCart);
		printShoppingCart(shoppingCart);
		
		//Once user is done checking out, empty shopping cart
		shoppingCart.clear();
		
	}
}
