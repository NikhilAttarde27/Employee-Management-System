import java.io.Serializable;

//Employee POJO Class
public class Employee implements Serializable {
	// Data Members
	private int empId;
	private String fname;
	private String lname;
	private String mobno;
	private String email;
	private MyDate dob;
	private String designation;
	private double salary;
	
	// Default Constructor
	public Employee(){
		super();
	}
	
	// Parameterized Constructor
	public Employee(int empId,String fname,String lname, String mobno,String email, MyDate dob, String designation, double salary){
		this.empId = empId;
		this.fname = fname;
		this.mobno = mobno;
		this.lname = lname;
		this.email = email;
		this.dob = dob;
		this.designation = designation;
		this.salary = salary;
	}

	// Getters an Setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// To String Method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fname=" + fname + ", lname=" + lname + ", mobno=" + mobno + ", email="
				+ email + ", dob=" + dob + ", designation=" + designation + ", salary=" + salary + "]";
	}	
}
