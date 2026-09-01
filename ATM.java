package OOP;

public class ATM {

		 private int pin = 1234;

		    public void setPin(int p)
		    {
		        pin = p;
		    }

		    public int getPin()
		    {
		        return pin;
		    }

		    public static void main(String args[])
		    {
		        ATM a = new ATM();

		        a.setPin(5678);

		        System.out.println(a.getPin());
		    }

	}

