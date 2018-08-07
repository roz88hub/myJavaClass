/*
 * Both of these methods are used for comparing two strings. The only difference between them is that the equals() methods considers the case while 
 * equalsIgnoreCase() methods ignores the case during comparison. 
 
	boolean equals(String str): Case sensitive comparison
	boolean equalsIgnoreCase(String str): Case in-sensitive comparison
*/
public class equalsIgnClass {
	   public static void main(String args[]){
		       String str1= new String("Apple");
		       String str2= new String("MANGO");
		       String str3= new String("APPLE");
		       System.out.println("str1 equals to str2: "+str1.equalsIgnoreCase(str2));
		       System.out.println("str1 equals to str3: "+str1.equalsIgnoreCase(str3));
		       System.out.println("str1 equals to Welcome: "+str1.equalsIgnoreCase("Welcome"));
		       System.out.println("str1 equals to Apple: "+str1.equalsIgnoreCase("Apple"));
		       System.out.println("str2 equals to mango: "+str2.equalsIgnoreCase("mango"));
		   }
}


