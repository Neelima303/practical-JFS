package Pattern;

public class Double_Alphabet {

	public static void main(String[] args) {
		int rows=5;
		char c = 'A';
		for (int i=0;i<rows;i++) {
			for (int j=0;j<=i;j++)
			{
				System.out.print(c);			
			}
			c++;
			System.out.println();
		}
	}

}
