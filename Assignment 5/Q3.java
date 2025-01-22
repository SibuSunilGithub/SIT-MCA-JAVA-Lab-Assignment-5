/*
Create a class Point2D with the data member and
methods shown in the class diagram. Note that
the items with a minus sign (-) indicate private
members and items with a plus sign (+) indicate
public members. Create a subclass called Point3D
which is derived from the superclass Point2D. Test
the methods of both the classes by creating
objects in the main method of another class
*/

class Point2D{
	
	private int x;
	private int y;
	
	public Point2D(){
		Scanner sc = new Scanner(System.in);
		this.x = sc.nextInt();
		this.y = sc.nextInt();
	}
	
	public Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2D{
	private int z;
	
	public Point3D(int x, int y, int z){
		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
}
