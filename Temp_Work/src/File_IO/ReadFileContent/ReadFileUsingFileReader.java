package File_IO.ReadFileContent;

import java.io.FileReader;

public class ReadFileUsingFileReader {

	public static void main(String[] args) throws Exception {
		//Open a file
		FileReader reader=new FileReader("E:\\Eclipse_Work\\Temp_Work\\src\\File_IO\\a.txt");
		
		//Read a character as ASCII or Unicode
		int ch=reader.read();
		char chr;
		
		//ch is -1 if no more char is left in the file
		while(ch!=-1)
		{
			chr=(char)ch;
			System.out.print(chr);
			ch=reader.read();
		}
		reader.close();

	}

}
