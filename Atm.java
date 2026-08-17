import java.util.Scanner;
public class ATM{
    public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      double balance =10000;
      System.out.println("Enter withdrawal amount: ");
      double amount = sc.nextDouble();
       
      if (amount <=0) {
          System.out.println("Invalid withdrawal amount");
       }  else if (amount % 100!=0) {
        System.out.println("Amount should be in multiples of 100");
       }  else if (amount > balance) {
        System.out.println("Insufficinet balance");
       }  else  { 
                balance = balance - amount;
         System.out.println("Withdrawal successful");
         System.out.println("Withdrawn Amount: ₹" + amount);
         System.out.println("Remaining Balance: ₹" + balance);
        }

        sc.close();
   }
}
 
