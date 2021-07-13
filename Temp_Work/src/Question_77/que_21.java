package Question_77;

public class que_21 {
	// Which modification enable a program to compile And Print "TrueDone"
	
	public static void main(String[] args) {
		// boolean opt=true;
		String opt="true";
		switch (opt) {
		// Boolean is not Exceptable argument in switch case So , to make Complie and Print TrueDone Change the Argument type as String  
		case "true":
			System.out.println("True");
			break;

		default:
			System.out.println("***");
			break;
			
		}
		System.out.println("Done ");

	}

}
