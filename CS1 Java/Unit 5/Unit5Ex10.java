/*10)	Write a program to take the place of a cashier at a fast food restaurant.  When a customer (user) approaches the computer they should be given the following options:
	
	1.  Menu  (displays a list of items available and their prices)
	2.  Order (prompts the user to enter the item they would like – only one item at a time)
	3.  List (shows the user what they have ordered so far)
	4.  Bill (calculates and displays the total with 8% tax)
	5.  Exit (ends the program)

Use a JOptionPane to let the user choose one of the five options, and loop it so they can continue choosing until they choose option 5 (to exit).  
The first 4 options above should also be methods, at least one of which must be a return method.  Your restaurant should sell at least 4 different items.  
Be creative with your restaurant name and items!
*/

import javax.swing.JOptionPane;

public class Unit5Ex10 {
	public static void main (String [] args) {
		String Stuff = JOptionPane.showInputDialog("1) Menu" + "\n" + "2) Order" + "\n" + "3) List" + "\n" + "4) Bill" + "\n" + "5) Exut");
		int s = Integer.parseInt(Stuff);
		int x = 0;
		int Order = 0;
		
		while (x == 0) {
			if (s == 1) {
				CallMenu();
			} else if (s == 2) {
				Order = CallOrder();
			} else if (s == 3) {
				CallList(Order);
			} else if (s == 4) {
				CallBill(Order);
			} else if (s == 5) {
				System.exit(0);
			}
		}
	}
	public static void CallMenu() {
		System.out.println("1) Hamburger $1.00" + "\n" + "2) Hotdog $2.00" + "\n" + "3) Taco $3.00" + "\n" + "4) Chicken $4.00");
	}
	public static int CallOrder() {
		String What = JOptionPane.showInputDialog("What do you want to order?");
		int W = Integer.parseInt(What);
		return(W);
	}
	public static void CallList(int Order) {
		if (Order == 1) {
			System.out.println("Hamgurger");
		} else if (Order == 2) {
			System.out.println("Hotdog");
		} else if (Order == 3) {
			System.out.println("Taco");
		} else if (Order == 4) {
			System.out.println("Chicken");
		}
	}
	public static void CallBill(int Order) {
		int x = 0;
		if (Order == 1) {
			x = 1;
		} else if (Order == 2) {
			x = 2;
		} else if (Order == 3) {
			x = 3;
		} else if (Order == 4) {
			x = 4;
		}
		System.out.println("Price: " + ((x * .08) + x));
	}
}