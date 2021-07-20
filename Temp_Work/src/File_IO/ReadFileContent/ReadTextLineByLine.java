package File_IO.ReadFileContent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextLineByLine {
	

	// Using BufferReader
	public static void main(String[] args) throws Exception {
		
		try  
		{  
		File file=new File("E:\\Eclipse_Work\\Temp_Work\\src\\File_IO\\a.txt");    //creates a new file instance  
		FileReader fr=new FileReader(file);   //reads the file  
		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
		StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
		String line;  
		while((line=br.readLine())!=null)  
		{  
		sb.append(line);      //appends line to string buffer  
		sb.append("\n");     //line feed   
		}  
		fr.close();    //closes the stream and release the resources  
		System.out.println("Contents of File: ");  
		System.out.println(sb.toString());   //returns a string that textually represents the object  
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  
		}  
	}

