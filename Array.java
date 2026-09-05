package practice;

import java.util.Scanner;

// Initializes  outside the loop and modify changes inside print Statement outside 
public class Array {

	public static void main(String[] args) {
////// for loop to calculate the sum of numbers from 0 to 5. 
////// After adding each number, display the current value of the sum.
		
//		int a=0;
//		
//		for (int i=0;i<=5;i++) {
//			a=a+i;
//			System.out.println("A= "+a);
//		}	
//	}
//}

/////// calculate the power of a given number using a for loop
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Base value: ");
		int Base = sc.nextInt();
		System.out.print("Enter the Power value: ");
		int Power = sc.nextInt();

		int result=1;
		for(int i=1; i<=Power; i++) {
			result=result*Base;
		}
		System.out.println("Total= "+result);
sc.close();
	}
 }	
	
				
//////for loop to print numbers from 1 to 20, where the loop variable is multiplied by 2 after 
//////		each iteration. Display the value of i in each iteration.
		
//		for (int i=1; i<=20; i++) {
//            System.out.println(i);
//            i*= 2;
//        }
//    }
//}


//// why the for loop does not execute.
//		 int i =1; 
//		for (    ; i>10;    ) 
//	     break;
//		 System.out.println(i);
//       i++;
//	}
//}
		
	
