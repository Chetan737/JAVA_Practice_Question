package Question_77;

public class que_11 {

	interface readable
	{
		public void readbook();
		public void setbook();
	}
	abstract class Book implements readable
	{
		public void readbook()
		{
			
		}
	}
	abstract class Ebook extends Book
	{
		public void readbook() {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
