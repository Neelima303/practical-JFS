package OOP;

public class Student {

		    int id;
		    String name;

		    void insert(int i, String n)
		    {
		        id = i;
		        name = n;
		    }

		    void display()
		    {
		        System.out.println(id + " " + name);
		    }

		    public static void main(String args[])
		    {
		        Student s1 = new Student();

		        s1.insert(101,"Ravi");

		        s1.display();
		    }

	}

