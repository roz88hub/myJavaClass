// creating the class name IceCube
public class IceCube {
  // setting the Attribute for class
	String shape;
	String color;
	String flavor;
	String fillType;

// going to have default values
IceCube (){
	this.shape="cube";
	this.color="white";
	this.flavor="plain";
	this.fillType="water";
}
// Construct with all the attribute
IceCube (String shape, String color, String flavor, String fillType){
	this.shape = shape;
	this.color = color;
	this.flavor = flavor;
	this.fillType = fillType;
}
// construct with a shape attribute
IceCube (String shape){
	this.shape = shape;
}
IceCube (String color, String flavor, String fillType){
	this.color = color;
	this.flavor = flavor;
	this.fillType = fillType;
}

public String toString(){
	return("Shape:" + this.shape +  "\n" + "Color:" + this.color +  "\n" + "Flavor:" + this.flavor +  "\n" + "Fill Type:" + this.fillType);
	
}

public static void main(String[] args){
	IceCube Object = new IceCube();
	IceCube firstObject = new IceCube("cube", "white" , "plain" , "water");
	IceCube secondObject = new IceCube("star", "red", "sweet", "Strawberry");
	IceCube thirdObject = new IceCube("diamond");
	IceCube	fourthObject = new IceCube("black", "cola", "cola");
	System.out.println(thirdObject.color);// print out the firstObject shape
	System.out.println(firstObject.toString());
	System.out.println(thirdObject.toString());
	System.out.println(firstObject.color);
	
}




}