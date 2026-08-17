import java.util.Scanner;
public class GradeMarks {
  public static void main(String[] args)
{
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the marks: ");
    int marks = sc.nextInt();
    
    if (marks<=0 || marks >100){
        System.out.println("Invalid Marks");
    }
     else if (marks>=90){
      System.out.println("Grade: A");
    }
    else if (marks>=75) {
     System.out.println("Grade: B");
    }
    else if (marks>=60) {
    System.out.println("Grade: C");
    }
    else if (marks >50) {
    System.out.println("Grade: D");
    }
    else {
        System.out.println("Grage: F");
     }
  sc.close();
  }
}




    


      
