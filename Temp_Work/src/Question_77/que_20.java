package Question_77;

public class que_20 {

	public static void main(String[] args) {
		int x=5;
		while (method(x)) {
			System.out.println(x);
			
			//x--; this is the solution to print 5,4,3,2,1 in the console 
			
		}

	}
	public static boolean method(int x)
	{
		return x-->0 ? true: false;
	}

}
