package imported;

interface Area
{
	float compute(float x, float y);
}

class Rectangle implements Area
{
	public float compute(float x, float y)
	{
		return(x * y);
	}
}

class Triangle implements Area
{
	public float compute(float x,float y)
	{
		return(x * y/2);
	}
}

class InterfaceArea
{
	public static void main(String args[])
	{
		
		Rectangle rect = new Rectangle();				  // Object of Rectangle
		Triangle tri = new Triangle();					 // Object of triangle
		Area area;										// object of interface
	
		
		area = rect;
		System.out.println("Area Of Rectangle = "+ area.compute(100,25));

		area = tri;
		System.out.println("Area Of Triangle = "+ area.compute(74,85));
	}
}