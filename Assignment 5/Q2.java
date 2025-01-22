/*
Create class called Rectangle with two data members length and breadth and two
member function inputData(), to initialize the data and area() to compute the area of
a rectangle. Create a subclass called Square with one data member called length and
overrides both the methods of the Rectangle class. Create object of both the class and
display their areas.
*/

import java.util.Scanner;

class Rectangle{
	public int length;
	public int breadth;
	
	public void inputData(int length, int breadth){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		this.length = length;
		System.out.println("Enter Breadth: ");
		this.breadth = breadth;
	}
	
	public void area(){
		System.out.println("Area Of Rectangle: "+(length * breadth));
	}
	
}

class Square extends Rectangle{
	public int length;
	
	public void inputData(int length){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		this.length = length;
	}
}

class RectangleSquare{
	public static void main(String [] args){
		
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		
		
	}
}