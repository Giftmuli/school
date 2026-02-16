package school;
import java.util.Scanner;
public class student {
    String fullname;
    String gender;
    int idno;
    double balance;

    void addStudent()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("STUDENT MANAGEMENT");
        System.out.println("Enter Fullname:");
        fullname=input.nextLine();
        System.out.println("Enter Gender:");
        gender=input.nextLine();
        System.out.println("Enter ID Number:");
        idno=input.nextInt();
        System.out.println("Enter Balance:");
        balance=input.nextDouble();
        //output variables 
       System.out.println("Fullname: "+fullname);
         System.out.println("Gender: "+gender);
          System.out.println("National ID: "+idno);
           System.out.println("Balance (Ksh): "+balance);
    }
}
