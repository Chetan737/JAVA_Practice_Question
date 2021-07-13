package Question_77;

import java.io.IOException;

class X
{
	public void printfile() throws IOException
	{
		
		throw new IOException();
	}
}
public class que_8 {

	public static void main(String[] args) throws Exception {
		X obj=new X();
		obj.printfile();
	}

}
