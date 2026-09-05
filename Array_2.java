package practice;
import java.util.*;
public class Array_2 {

	public static void main(String[] args) {
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
