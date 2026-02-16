package school;
import java.util.Scanner;
public class dashboard {
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        int menuItem;
        System.out.println("SCHOOL MANAGEMENT SYSTEM");
        System.out.println("1. Student Management");
        System.out.println("2. Employee Management");
        System.out.println("Enter menu value to select");
        menuItem=input.nextInt();

        if (menuItem==1) {
            student aStudent=new student();
            aStudent.addStudent();
        }
        else if (menuItem==2) {
            employee anEmployee=new employee();
            anEmployee.addEmployee();
        }
        else {
            System.out.println("Invalid menu item");
        }

        student aStudent=new student();
        aStudent.addStudent();
    }

}