package File_IO.WriteTOFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteContentUsingFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("E:\\Eclipse_Work\\Temp_Work\\src\\File_IO\\a.txt",true);
		
		char[] array= {'H','I'};
		fw.write(array);
		System.out.println();
		
		fw.write("\nExtra String add");
		fw.write("this is appended text"); // For append data User use the true value while passing fileLocation ,True see line numner 9
		
		System.out.println("Data Append....");
		
		fw.close();

	}

}
