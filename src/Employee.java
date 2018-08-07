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
	private	int employeeID;
	private	double salary;
	private	String payRate;
	private	String joinDate;
	private	String typeOfEmployee;
	private	int hours;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getPayRate() {
		return payRate;
	}


	public void setPayRate(String payRate) {
		this.payRate = payRate;
	}


	public String getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}


	public String getTypeOfEmployee() {
		return typeOfEmployee;
	}


	public void setTypeOfEmployee(String typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	private String ssn;
	
	
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
	
	// Creating toString() Method
	// Methods: compared the salary of current object with that of the object send to it
	
	void compareSalary(Employee another){
		
		if(this.salary > another.salary){
			System.out.println(this.name + " has high salary than " + another.name);
		}
	}
	
	public String toString(){
		return("Name:" + this.name +  "\n" + "Salary:" + this.salary +  "\n" + "Payrate:" + this.payRate +  "\n" + "Fill Type:" + this.joinDate  + "Type Of Employee:" + this.typeOfEmployee);
}
	
}
