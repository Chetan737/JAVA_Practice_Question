package Debugging_Example;

public class Exceptional_breakpoint_debug {
	public static void main(String[] args) {
		int a=10;
		int b=0,c;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		
		catch (Exception e) {
			System.out.println("Exception called.....");
		}
}
}