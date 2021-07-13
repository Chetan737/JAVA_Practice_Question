package Exception_Demo;

public class Demo_1 {

	public static void mymethod() throws ArithmeticException
	{
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=0,c;
		try
		{
			Demo_1.mymethod();
			c=a/b;
			System.out.println(c);
		}
		
		catch (Exception e) {
			System.out.println("Exception called.....");
		}
//		catch(ArithmeticException ed)
//		{
//			System.out.println("Airthmetic called.....");
//			//ed.printStackTrace();
//		}
		
		
		
		
		
		

	}

}
