class Shape
{
	int x,y;
	void Area(int a)
	{
		Double area = 3.14 * a * a;
		System.out.println("Area of a circle with radius "+a+" is "+area);
	}
	void Area(int a, int  b)
	{
		int area = a * b;
		System.out.println("Area of Rectangle with "+a+" and "+b+" is "+area);
	}
}
class FunOverLoad
{
	public static void main(String []args)
	{
		Shape s = new Shape();
		s.Area(5);

		Shape s2 = new Shape();
		s2.Area(5,4);
	}
}