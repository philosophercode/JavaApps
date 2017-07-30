//This program tallys a bill composed of 3 purchesed items.
import java.util.*;
public class Bill {
	public static void main(String[] args) {
//The following prompts the user to input the item name, quantity, and price for 3 items. The are all saved as variables.
      Scanner console = new Scanner (System.in);
      System.out.print("Item 1: ");
      String item1 = console.nextLine();
      System.out.print("Quantity: ");
      int quantity1 = console.nextInt();
      System.out.print("Price: ");
      double price1 = console.nextDouble();
      System.out.print("Item 2: ");
      String item2 = console.next();
      System.out.print("Quantity: ");
      int quantity2 = console.nextInt();
      System.out.print("Price: ");
      double price2 = console.nextDouble();
      System.out.print("Item 3: ");
      String item3 = console.next();
      System.out.print("Quantity: ");
      int quantity3 = console.nextInt();
      System.out.print("Price: ");
      double price3 = console.nextDouble();
//Methods are called and saved as variables.
      double total1 = totalOne(quantity1, price1);
      double total2 = totalTwo(quantity2, price2);
      double total3 = totalTwo(quantity3, price3);
      double totaltotal = totalAll(total1, total2, total3);
      double totaltax = totalTax(total1, total2, total3);
      double totaltwo;
      double totalthree;
//Strings are saved to format the columns of the bill.
      String item = "Item";
      String quantity = "Quantity";
      String price = "Price";
      String total = "Total";
      String subtotal = "Subtotal";
      String tax = "6.25% sales tax";
//The bill is printed as each variable is spaced out on the screen.
      System.out.println();
      System.out.println("Your bill:");
      System.out.printf("%-30s%-10s%-10s%-10s\n", item, quantity, price, total);
      System.out.printf("%-30s%-10s%-10s%-10s\n", item1, quantity1, price1, total1);
      System.out.printf("%-30s%-10s%-10s%-10s\n", item2, quantity2, price2, total2);
      System.out.printf("%-30s%-10s%-10s%-10s\n", item3, quantity3, price3, total3);
      System.out.println();
      System.out.printf("%-50s%-10.2f", subtotal, totaltotal);
      System.out.println();
      System.out.printf("%-50s%-10.2f", tax, totaltax);
      System.out.println();
      System.out.printf("%-50s%-10.2f", total, totaltotal+totaltax);
      System.out.println();
   }
   public static double totalOne(int quantity1, double price1) {
//This method calculated the total of item 1.
         double total1 = quantity1*price1;
         return total1;
   }
   public static double totalTwo(int quantity2, double price2) {
//This method calculated the total of item 2.
         double total2 = quantity2*price2;
         return total2;
   }
   public static double totalThree(int quantity3, double price3) {
//This method calculated the total of item 3.
         double total3 = quantity3*price3;
         return total3;
   }
   public static double totalAll(double total1, double total2, double total3) {
//This method calculated the total of all the items.
         double totaltotal = (total1+total2+total3);
         return totaltotal;
   }
   public static double totalTax(double total1, double total2, double total3) {
//This method calculated the total tax of all the items.
         double totaltax = (total1+total2+total3)*0.0625;
         return totaltax;
   }
}
