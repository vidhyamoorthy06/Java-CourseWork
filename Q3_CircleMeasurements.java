import java.util.*;

public class Q3_CircleMeasurements
{
	public static double pi=3.1416;
	
	static double distance(double x1,double y1,double x2,double y2)
	{
		return (Math.sqrt(   ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1))   )        );
	}

	static double radius(double x1,double y1,double x2,double y2)
	{
		return (  Math.sqrt(   ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1))   )        );	
	}

	static double circumference(double r)
	{	
		return (2 * pi * r);    
	}
	
	static double area(double r)
	{
		return (pi * r * r);
	}

	public static void main(String args[])
	{
		double x1,x2,y1,y2;
		double d,r,c,a;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first point (x1,y1) ");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.println("Enter the second points (x2,y2) ");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		d=distance(x1,y1,x2,y2);
		System.out.printf("Distance between two given points is %.3f \n",d);
		r=radius(x1,y1,x2,y2);
		System.out.printf("Radius of the circle is %.3f \n",r);
		System.out.printf("Diameter of the circle is %.3f \n",2*r);
		c=circumference(r);
		System.out.printf("Circumference of the circle is %.3f \n", c );
		a=area(r);
		System.out.printf("Area of circle is %.3f square units\n", a);
	}
}
