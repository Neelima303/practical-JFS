package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int Original = num;
		int reverse = 0;
		
		while (num>0)
		{
			int digit = num % 10;
			reverse = reverse * 10 +digit;
			num = num / 10;
		}
		if(Original == reverse)
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
	}
}


////check wherther the given String is Palindrorme or not! 

//String str = "Hello";
//String rev =" ";
//
// for (int i=str.length()-1;i>=0;i--)
// {
//	 rev = rev+str.charAt(i);
// }
//if (str.equals(rev))
//{
//	System.out.print("Palindrome");
//}
//else 
//{
//	System.out.println("Not Palindrome");
//}
//}
//}