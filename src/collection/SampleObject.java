package collection;

public class SampleObject 
{
	public String Name = "";
	public int age = 0;
	public double avg = 0.0;
	
	public SampleObject()
	{
		this.Name = "";
		this.age = 0;
		this.avg = 0.0;
	}
	public SampleObject(String c_name, int c_age, double c_avg)
	{
		this.Name = c_name;
		this.age = c_age;
		this.avg = c_avg;
	}
	
	public static void printSampleObject (SampleObject p_so)
	{
		System.out.println(p_so.Name);
		System.out.println(p_so.age);
		System.out.println(p_so.avg);
	}

}
