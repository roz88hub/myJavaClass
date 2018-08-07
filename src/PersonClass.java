//Creating Class name PersonClass
public class PersonClass {

	// Creating the attributes for Person
	private String lastName;
	private char lastNameInitial;
	private int age;
	private double weight; // Assume weight is in pounds
	private int feet;
	private int inches;

	// Setting Getters and Setters
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getLastNameInitial() {
		return lastNameInitial;
	}

	public void setLastNameInitial(char lastNameInitial) { 
		this.lastNameInitial = lastNameInitial;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	// Constructor for class name PersonClass

	// Constructor for all the attributes
	PersonClass(String firstName, String lastName, char lastNameInitial,
			int age, double weight, int feet, int inches) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastNameInitial = lastNameInitial;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}

	// Constructor for firstName, lastName,weight, feet, inches
	PersonClass(String firstName, String lastName, double weight, int feet,
			int inches) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}

	// Constructor for firstName, lastNameInitial, weight, feet, inches
	PersonClass(String firstName, char lastNameInitial, double weight,
			int feet, int inches) {
		this.firstName = firstName;
		this.lastNameInitial = lastNameInitial;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}

	// Creating String method Called calculateBMI
	String calculateBMI() {
		int heightInInches = (feet * 12 + inches);
		String statusBMI;
		double BMI = (weight * 703) / (heightInInches * heightInInches);
		// Starting of if statement where status of BMI is show according to
		// value of BMI
		if (BMI < 18.5) {
			statusBMI = "Underweight";
		} else if (BMI >= 18.5 && BMI <= 24.9) {
			statusBMI = "Normal";
		} else {
			statusBMI = "Obese";
		}
		return (BMI + ": " + statusBMI);
	}

}
