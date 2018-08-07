

public class point {

//Declaring attributes
	private int x;
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	private int y;

//Constructor
point ( int x, int y){
this.x = x;
this.y = y; 
}

//Instance Methods

public String Quadrant() {
String quad;
if (x > 0 && y >  0) {
quad = "is in quadrant 1";
}
else if (x < 0 && y >  0){
quad = "is in quadrant 2";
}
else if (x < 0 && y <  0) {
quad = "is in quadrant 3";
}
else if (x > 0 && y <  0) {
quad = "is in quadrant 4";
}
else {
quad = "This is the origin.";
}
return "(" + (x) +"," + (y) + ")" + " : " + quad;

}

public double Distance(point another) {
	double dist;
	dist = Math.sqrt(Math.pow((this.x - another.x), (this.y - another.y)));
	return dist;
}

public void Shift() {
	this.x = this.x + 1;
	this.y = this.y + 1;
	System.out.print("x:"+(this.x)+ "," + "y:" +(this.y));
	
	

}

}