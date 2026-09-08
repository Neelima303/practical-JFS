package practice;

import java.util.Scanner;

public class Largest_3_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(x>y && x>z)
		{
			System.out.println("Largest Number is: "+x);
		}
		else if(y>z&& y>x)
		{
			System.out.println("Largest Number is:" +y);
		}
		else 
		{
			System.out.println("Largest Number is: "+z);
		}
	}

}
