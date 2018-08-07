
public class graph {
	private int x;
	private int y;
	
	public static void main(String[] args){
	
		point point1 = new point(2, 3);
		point point2 = new point(-3, 2);
		point point3 = new point(-2, -3);
		point point4 = new point(2, -3);

		System.out.println(point3.Quadrant());
		System.out.println(point3.Distance(point4));
		point2.Shift();
		
		
}

}