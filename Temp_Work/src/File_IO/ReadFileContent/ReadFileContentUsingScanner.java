package File_IO.ReadFileContent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileContentUsingScanner {
public static void main(String[] args) {
	try  
	{  
	//the file to be opened for reading  
	FileInputStream fis=new FileInputStream("E:\\Eclipse_Work\\Temp_Work\\src\\File_IO\\a.txt");       
	Scanner sc=new Scanner(fis);    //file to be scanned  
	//returns true if there is another line to read  
	while(sc.hasNextLine())  
	{  
	System.out.println(sc.nextLine());      //returns the line that was skipped  
	}  
	sc.close();     //closes the scanner  
	}  
	catch(IOException e)  
	{  
	e.printStackTrace();  
	}  
}
}
