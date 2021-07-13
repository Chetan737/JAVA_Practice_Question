package Work;

public class Reverse_string {

	public static void main(String[] args) {
		int i,count=0;
		char ch;
		String str=new String("123456789");
		for(i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			System.out.print(ch);
			
		}
		

	}

}
