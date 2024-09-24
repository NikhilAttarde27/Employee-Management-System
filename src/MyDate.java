import java.io.Serializable;

public class MyDate implements Serializable{
	
	int day,month,year;
	//Constructor 
	public MyDate() {
		day = 30;
		month = 07;
		year = 2024;
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void initDate(){
		System.out.println("Date is : "+day+"/"+month+"/"+year);
	}
	
}
