package school;
import java.util.Scanner;
public class employee extends person{
    String staffno;
    String department;

    void addEmployee()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("EMPLOYEE MANAGEMENT");
        System.out.println("Enter fullname:");
        fullname=input.nextLine();
        System.out.println("Enter gender:");
        gender=input.nextLine();
        System.out.println("Enter staff number:");
        staffno=input.nextLine();
        System.out.println("Enter department:");
        department=input.nextLine();

        //output variables
        System.out.println("Fullname: "+fullname);
        System.out.println("Gender: "+gender);
        System.out.println("Staff number: "+staffno);
        System.out.println("Department: "+department);
    }
}