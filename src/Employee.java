/*
 *  1. Create a class Employee
 *  2. Employees are going to have a String name, int employeeID, double salary, String PayRate, STring joinDate
 *   String typeOfEmployee and int hours
 *  
 *  3. All the attributes are private
 *  
 *  4. When initially hired, some employees may not have an employeedID or hours. Some employees may have values for all the 
 *  attributes. Create constructors accordingly.
 *  
 *  4.The above mentioned constructor are  the only 2 that are allowed. So, while creating an object class Employee,
 *  you will be using one of the 2 constructors that you created. (Hint: Do not write the default Constructor)
 *  
 *  6. Write the toString Method
 *  
 *  7. Create another class called Payroll in the same project *  
 *  
 */



public class Employee {
	
// Creating the attributes for Employee
	private	String name;
	public	int employeeID;
	public	double salary;
	public	String payRate;
	private	String joinDate;
	private	String typeOfEmployee;
	public	int hours;
	
	
	Employee(String name , int employeeID, double salary,String PayRate, String joinDate, String typeOfEmployee,int hours ){
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
		this.payRate = PayRate;
		this.joinDate = joinDate;
		this.typeOfEmployee = typeOfEmployee;
		this.hours = hours;
	}
	 
	
	Employee(String name , double salary,String PayRate, String joinDate, String typeOfEmployee ){
		this.name = name;		
		this.salary = salary;
		this.payRate = PayRate;
		this.joinDate = joinDate;
		this.typeOfEmployee = typeOfEmployee;
		
	}
	
	public String toString(){
		return("Name:" + this.name +  "\n" + "Salary:" + this.salary +  "\n" + "Payrate:" + this.payRate +  "\n" + "Fill Type:" + this.joinDate  + "Type Of Employee:" + this.typeOfEmployee);
}
	
}
