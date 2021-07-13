package Question_77;

public class que_19 {

	void readCard(int cardNo) throws Exception
	{
		System.out.println("Reading Card ");
	}
	
	void checkCard(int cardNo) throws RuntimeException
	{
		System.out.println("Checking Card ");
	}
	
	
	public static void main(String[] args){
		que_19 obj=new que_19();
		
		int cardNo=12344;
		obj.checkCard(cardNo);
		
		//Exception because we cant handel them type Exception to solve this we have to
		//add Throws Exception while writing main method
		
		//obj.readCard(cardNo); 
		

	}

}
