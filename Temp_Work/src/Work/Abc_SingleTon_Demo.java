package Work;

class SingleTon
{
	public String s; //Variable
	
	private static SingleTon st=null; //static variable instance return type class 
	
	private SingleTon() //
	{
		s="Chetan";
	}
	
	public static SingleTon getInstance()
	{
		st=new SingleTon();
		return st;
	}
}



public class Abc_SingleTon_Demo {

	public static void main(String[] args) {
		SingleTon a=SingleTon.getInstance();
		a.s=(a.s).toUpperCase();
		System.out.println(a.s);
		
		
		

	}

}
