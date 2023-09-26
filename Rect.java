class Rectangle
{
	int L,B;
	Rectangle()
	{
		System.out.println("Dafault Constructor:");
		L=0;
		B=0;
		System.out.println("Length is :"+L);
		System.out.println("Breath is :"+B);
	}
	Rectangle(int l, int b)
	{	
		
		System.out.println("Length is :"+l);
		System.out.println("Breath is :"+b);
		this.L=l;
		this.B=b;
	}
	void Area()
	{
		int area = L*B;
		System.out.println("Area of Rectangle is : "+area);
	}
}
class Rect
{
	public static void main(String []args)
	{
		Rectangle r = new Rectangle();
		r.Area();

		Rectangle r2 = new Rectangle(6,3);
		r2.Area();
	}
}