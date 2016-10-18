//  Program that will find the area and perimeter of Circle, Rectangle and Triangle

	import java.lang.Math;

	abstract class J_S5A1
	{
	 abstract void findArea();
	 abstract void findPerimeter();
	 double area,perimeter;
	}

	class Triangle extends J_S5A1
	{ 
	 double b=50,h=10,s1=20,s2=15;
	 void findArea()
	 {
	  area = (b*h)/2;
	  System.out.println("Area of Triangle --> "+area);
	 }
	 void findPerimeter()
	 {
	  perimeter =  (b+s1+s2);
	  System.out.println("Perimeter of Triangle --> "+perimeter);
	 }
	}

	class Rectangle extends J_S5A1
	{
	 double l=50,b=20;
	 void findArea()
	 {
	  area = l*b;
	  System.out.println("Area of Rectangle --> "+area);
	 }
	 void findPerimeter()
	 {
		 perimeter =  (2*(l+b));
	  System.out.println("Perimeter of Rectangle --> "+perimeter);
	 }
	}

	class Circle extends J_S5A1
	{
	 double r=7;
	 void findArea()
	 {
	  area = Math.PI * r * r;
	  System.out.println("Area of Circle --> "+area);
	 }
	 void findPerimeter()
	 {
		 perimeter =  (2 * Math.PI * r);
	  System.out.println("Perimeter of Circle --> "+perimeter);
	 }
	}

	class Area
	{
	 public static void main(String[] args)
	 {
	  Triangle t= new Triangle();
	  Rectangle r =new Rectangle();
	  Circle c =new Circle();
	  
	  t.findArea();
	  t.findPerimeter();
	  System.out.println("=================================================");
	  r.findArea();
	  r.findPerimeter();
	  System.out.println("=================================================");
	  c.findArea();
	  c.findPerimeter();
	  System.out.println("=================================================");
	 }
	}

	//Thank You