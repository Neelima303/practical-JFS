import java.util.Scanner;
public class TicketPricing {
public static void main(String[] args) 
 {
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter the age: ");
    int age = sc.nextInt();
   
    if (age < 0) {
       System.out.println("Invaild age: ");
     }
     else if (age < 5) {
     System.out.println("Ticket Price:  Free");
     } 
     else if (age <= 12) {
     System.out.println("Ticket Price: 50 Rupees");
     }
     else if (age < 60) {
     System.out.println("Ticket Price: 100 Rupees");
     }
     else {
      System.out.println("Ticket Price: 70 Rupees");
     }
   sc.close();
  }
}

    