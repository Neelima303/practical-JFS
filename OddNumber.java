package practice;

public class OddNumber {

	public static void main(String[] args) {
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		int count = 0;
		
		for ( int num=0;num<10;num++) 
		{ 
		  if (num % 2 != 0) 
		  {
			   System.out.println(number);
			   count++;
		  }
		}
	}

}
