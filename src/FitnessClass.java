// Creating a new Class called FitnessClass
public class FitnessClass {

	public static void main(String[] args) {

		// Creating an Object from PersonClass
		// FName: Tom,LNameInitial: H, Weight 152.5, Feet: 5, Inches: 6)
		PersonClass person1 = new PersonClass("Tom", 'H', 152.5, 5, 6);

		// FName: Leslie, LName:Knope, LNameInitial: K, Age: 32, Weight 122.9,
		// Feet: 4, Inches: 11)
		PersonClass leslie = new PersonClass("Leslie", "Knope", 'k', 32, 122.9,
				4, 11);

		// FName: Ron, LName:Swanson, Weight 222.2, Feet: 6, Inches: 0
		PersonClass man = new PersonClass("Swanson", "Knope", 222.2, 6, 0);

		// FName: April, LName:Ludgate, Weight 110.5, Feet: 5, Inches: 5
		PersonClass woman = new PersonClass("April", "Ludgate", 110.5, 5, 5);

		// Here we are printing out the Result
		System.out.println(person1.getFirstName() + ": "
				+ person1.calculateBMI());
		System.out
				.println(leslie.getFirstName() + ": " + leslie.calculateBMI());
		System.out.println(man.getFirstName() + ": " + man.calculateBMI());
		System.out.println(woman.getFirstName() + ": " + woman.calculateBMI());

	}
}
