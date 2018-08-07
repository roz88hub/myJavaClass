public class PayRoll {
	
	public static double calculatePay(Employee employee){
		/* 1.Pay cycle is bi-weekly. This function will be calculating an employee's paycheck for that cycle based on
		 * salary and payRate
		 * 
		 * 2. If the empployee has a yearly salary
		 *  this is a test change in the eclipse
		 */
		double salaryCal;
		//if the empployee has a yearly salary
		if (employee.getPayRate() == "YEARLY"){
			salaryCal = (employee.getSalary()/52) * 2;
			
		}
		else if(employee.getPayRate() == "HOURLY"){
			salaryCal =(employee.getSalary() * employee.getHours() *3);
		}
		else {
			salaryCal = 0.00;
		}
		return salaryCal;
	
	}
		public static void main(String[] args){
		//Employee(String name , int employeeID, double salary,String PayRate, String joinDate, String typeOfEmployee,int hours )
		Employee tom = new Employee("Tom Hartford",100, 44.90, "HOURLY", "09-01-2010" , "Part-Time", 28);
		
		//Employee(String name , double salary,String PayRate, String joinDate, String typeOfEmployee )
		Employee ron = new Employee("Ron Johnson", 33200.00 , "YEARLY" , " 10-10-2010", "FUll Time");
		
		//calculatePay(tom);
		
		ron.compareSalary(tom);
		
		/*System.out.println(calculatePay(tom));
		System.out.println(calculatePay(ron));*/
	}

}
