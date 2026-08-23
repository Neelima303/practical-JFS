package practice;
import java.util.Scanner;
public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Purchase amount: ");
		 double amount = sc.nextInt();
		 double discount =0;
		  
		 if (amount < 0) {
			 System.out.println("Invalid amoiunt");
		 }
		 else if (amount < 1000) {
			 discount = 0;
		 }
		 else if (amount < 5000) {
			 discount = amount * 0.10;
		 }
		 else if (amount < 10000) {
			 discount = amount * 0.20;
		 }
		 else {
			 discount = amount * 0.30; 
		 }
		  if (amount >= 0) {
			  double finalAmount = amount - discount;
			  System.out.println("Original Amount: "+ amount);
			  System.out.println("Discount: " + discount); 
			  System.out.println(" Final Amount: " + finalAmount);
		  }
		  sc.close();
	}

}
