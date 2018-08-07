import java.util.Scanner;
public class HRTeam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// both of them have all other attributes
		//joey
		//Rachel
		
		Employee someEmployee = new Employee("Tom Hartford",100, 44.90, "HOURLY", "09-01-2010" , "Part-Time", 28);
		//This is where getters and setters would come into play
		
		System.out.println(someEmployee.getSsn());
		if (someEmployee.getSsn() == null){
			Scanner inputSSN = new Scanner(System.in);
			System.out.println("What is " + someEmployee.getName() + "'s SSN");
			someEmployee.setSsn(inputSSN.nextLine());
		}
		System.out.println(someEmployee.getSsn());
	}

}
