//importing the necessary classes for this class

import java.util.Scanner;
import java.util.UUID;

//creating the Employees class and inherits the showroom class and implements the utility interface
public class Employees extends Showroom implements utility{
    //data members of the employee class
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;


    @Override
    //getting the details of the employee class
    public void get_details() {
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Department: "+emp_department);
        System.out.println("Showroom Name: "+showroom_name);

    }
    @Override
    //set the details of the employee class
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        emp_name = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        emp_department = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();


    }
}
