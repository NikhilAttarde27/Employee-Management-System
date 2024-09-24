
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeManager {
	public void addEmployee(Employee e){
		try {
			String file_name=e.getEmpId()+".txt";
			FileOutputStream fout = new FileOutputStream(file_name);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(e);
			System.out.println("Employee details saved successfully.!!!");
			oos.close();
			fout.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public void getEmployee(int empId){
		String file_name=empId+".txt";
		try {
			FileInputStream fin = new FileInputStream(file_name);
			ObjectInputStream ois = new ObjectInputStream(fin);
			Employee e = (Employee) ois.readObject();
			System.out.println("Employee Details are : ");
			System.out.println(e);
			
			ois.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Invaild Employee ID !!!");
			System.out.println("Enter valid employee Id");
		} catch (IOException |ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public void updateEmployee(int empId){
		String file_name = empId + ".txt";
	    try {
	        FileInputStream fin = new FileInputStream(file_name);
	        ObjectInputStream ois = new ObjectInputStream(fin);

	        Employee e = (Employee) ois.readObject();
	        System.out.println(e);
	        
	        ois.close();
	        fin.close();
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Updated Details of the employee : ");
	        
	        System.out.println("Enter updated first name : ");
	        String fname = sc.next();
	        e.setFname(fname);
	        
	        System.out.println("Enter updated last name : ");
	        String lname = sc.next();
	        e.setLname(lname);
	        
	        System.out.println("Enter updated mobile number : ");
	        String mobno = sc.next();
	        e.setMobno(mobno);
	        
	        System.out.println("Enter updated email ID : ");
	        String email = sc.next();
	        e.setFname(fname);
	        
	        System.out.println("Enter updated date of Birth : ");
	        int day = sc.nextInt();
	        int month = sc.nextInt();
	        int year = sc.nextInt();
	        MyDate dob = new MyDate(day, month, year);
	        e.setDob(dob);
	        
	        System.out.println("Enter updated designation : ");
	        String designation = sc.next();
	        e.setDesignation(designation);
	        
	        System.out.println("Enter updated salary : ");
	        double salary = sc.nextDouble();
	        e.setSalary(salary);
	        
	        FileOutputStream fout = new FileOutputStream(file_name);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			
			oos.writeObject(e);
			System.out.println("Employee details Updated Successfully");
			oos.close();
			fout.close();
	        
	    }catch(Exception e){
	    	e.printStackTrace();
	    }

	}
	public void deleteEmployee(int empId){
		String file_name = empId + ".txt";
	    File file = new File(file_name);
	    
	    if (file.exists()) {
	        if (file.delete()) {
	            System.out.println("Employee with ID " + empId + " deleted successfully.");
	        } else {
	            System.out.println("Failed to delete employee with ID " + empId + ".");
	        }
	    } else {
	        System.out.println("Employee with ID " + empId + " does not exist.");
	    }
	}
}
