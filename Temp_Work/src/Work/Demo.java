package Work;

public class Demo {

	public static void main(String args[])
	{
		int e=3;
		//Abc a=new Abc();
		Abc b=new Abc(e);
		
	}
}
class Abc
{
	Abc()
	{
		int a=10,b=20;
		
		System.out.println("hello"+a);
		System.out.println("hello"+a+" "+b);
		System.out.println("hello"+(a+b));
		System.out.println(a+b+"hello");
		System.out.println("hello"+a);
		
		byte c;
		c=(byte)(a+b);
		System.out.print(c);
	}
	
	Abc(int x)
	{
		int y;
		y=++x + x++ + ++x;
		System.out.println(x);
		System.out.println(y);
	}
	
}
