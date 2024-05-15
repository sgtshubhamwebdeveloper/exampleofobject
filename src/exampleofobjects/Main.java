package exampleofobjects;

public class Main {
	public static void main(String[] args)
	{
		int a=10;
		int b=10;
		int c=10;
		Addition obj = new Addition();
		c= obj.add(a,b);
		System.out.println("The sum is "+c);
		
	}
}
class Addition
{
	public int add (int a,int b)
	{
		return(a+b);
	}
}
