
//Scope of variables
class PostIt{
// these attribute of this Class "PostIt" is only can be access by this class
		private	String color;
		private	String message;
		private int someNum;
		//Non static function
		void stickIt(){
			System.out.println("I am sticking " + color);
	
	}
		//Creating a constructor, Constructor just create an Object and new creates the object
		PostIt(String color, int s){
			// this is a current object 
			this.color = color;
			this.someNum = s;
			
		

		}
	
		public static void main (String[] args){
		 PostIt p1 = new PostIt(); // p1 is object name //new keywords creates in memory
		// System.out.println(p1.color); // Dot operator is address
		 p1.color = "Yellow";
		 System.out.println(p1.color);
		 
		 PostIt p2 = new PostIt(); //Creating new Object name p2
		 System.out.println(p2.someNum); 
		 System.out.println(p2.color);
		 p2.stickIt(); //this line will print null color
		 p1.stickIt(); // this line will print yellow color
		 
		 
		 PostIt(String color, int i)	 {
		
		 
		 PostIt p3 = new PostIt("green", 99);
		 PostIt p9 = new PostIt("orange" , 100);
	}
	
}
		
}
	
	

