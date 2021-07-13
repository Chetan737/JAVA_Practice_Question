package Work;

public class Recursion_Demo {
	void print(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
			n++;
			print(n);
		}
	}
	public static void main(String[] args) {
		Recursion_Demo r=new Recursion_Demo();
		r.print(1);
	}

}
