package exampleofobjects;

public class Example {
	
	static int mymethod(int x)
	{
		return 5 + x;
	}
		
		public static void main(String[] args)
		{
			 
			Example t = new Example();
			t.mymethod(10);
			System.out.println(mymethod(3));
			
		}
}
