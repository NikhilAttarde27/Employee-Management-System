import java.util.Scanner;

public class EMS_Main {
	public static void main(String[] args) {
		EmployeeManager eManager = new EmployeeManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n***** Welcome to Employee Management System *****");
		boolean exit = false;
        while (!exit) {
            // Menu options
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee details by ID");
            System.out.println("3. Update Employee details");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Reading the option selected by the user
            int empId;
            switch (choice) {
                case 1:
                    // Add Employee
                	System.out.println("Enter Employee details : ");
                	System.out.println("Enter employee ID : ");
        	        empId = sc.nextInt();
        	        
        	        System.out.println("Enter first name : ");
        	        String fname = sc.next();
        	        
        	        System.out.println("Enter last name : ");
        	        String lname = sc.next();
        	        
        	        System.out.println("Enter mobile number : ");
        	        String mobno = sc.next();
        	        
        	        System.out.println("Enter email ID : ");
        	        String email = sc.next();
        	        
        	        System.out.println("Enter date of Birth : ");
        	        System.out.println("Enter Day :");
        	        int day = sc.nextInt();
        	        System.out.println("Enter Month :");
        	        int month = sc.nextInt();
        	        System.out.println("Enter Year :");
        	        int year = sc.nextInt();
        	        MyDate dob = new MyDate(day, month, year);
        	        
        	        System.out.println("Enter updated designation : ");
        	        String designation = sc.next();
        	        
        	        System.out.println("Enter updated salary : ");
        	        double salary = sc.nextDouble();
        	        
        	        Employee e = new Employee(empId, fname, lname, mobno, email, dob, designation, salary);
        	        eManager.addEmployee(e);
        	        break;
                case 2:
                    // View Employee details by ID
                	System.out.println("Enter Employee ID of employee whose details you want to fetch : ");
                	empId = sc.nextInt();
                	eManager.getEmployee(empId);
                    break;
                case 3:
                    // Update Employee Details
                	System.out.println("Enter Employee ID of employee whose details you want to update : ");
                	empId = sc.nextInt();
                	eManager.updateEmployee(empId);
                	break;
                case 4:
                    // Delete Employee 
                	System.out.println("Enter Employee ID of employee whose details you want to delete : ");
                	empId = sc.nextInt();
                	eManager.deleteEmployee(empId);
                    break;
                case 5:
                	// Exit the program
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        sc.close();
	}
}
