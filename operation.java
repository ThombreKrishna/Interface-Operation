/*Que. Define an interface “Operation” which has methods area(),volume().Define a constant PI having a value 3.142.
 * Create a class cylinder which implements this interface (members – radius, height),Create one object and calculate the area and volume. 
 * 		Name:- Krishna Vijay Thombre
 * 		Roll No.:- 141*/
import java.util.Scanner;
public interface operation 
{
	final double pi=3.14;
	abstract void area();
	abstract void volume();
}
class cylinder implements operation
{
	double radius;
	double height;
	
cylinder (double r, double h)
{
	radius=r;
	height=h;
}
public void area()
{
	double ar=(2*(pi)*(radius)*(height)+2*(pi)*((radius)*(radius)));
	System.out.println("Area is :- "+ar);
}
public void volume()
{
	double vl=(pi*(radius*radius)*(height));
	System.out.println("Volume is :- "+vl);
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius and height");
		double rad=sc.nextFloat();
		double hei=sc.nextFloat();
		
		cylinder obj=new cylinder(rad,hei);
		obj.area();
		obj.volume();
	}
}
