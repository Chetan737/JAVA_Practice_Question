package File_IO;

import java.io.File;
import java.util.Date;


public class Examine_FileORDict {

	public static void main(String[] args) {
		//Create Object of a file name Filename.txt 
		File f=new File("E:\\Eclipse_Work\\Temp_Work\\src\\File_IO\\a.txt");
		
		//Check if file Exists or not
		if(f.exists())
		{
			//Name of the file
			
			System.out.println("Name : "+f.getName()); 
			
			//Path of the file
			
			System.out.println("Path : "+f.getAbsolutePath());
			
			//Check Access Permission of file
			
			System.out.println("Access Permission");
			System.out.println("Writable : "+f.canWrite());
			System.out.println("Readable : "+f.canRead());
			
			//Check if it is a directory or not
			
			System.out.println("Is File : "+f.isFile());
			System.out.println("Is Directory : "+f.isDirectory());
			
			//Last modified Date of file or directory
			
			java.util.Date d=new Date(f.lastModified()); 
			System.out.println("Date Modified : "+d);
			
			//Length Of file
			
			long length=f.length();
			System.out.println("Length : "+length);	
			
			//Create A Sub Directory
			
			//File dict=new File("Location where you create a directory : URL ");
			//File subDir=new File(dict,"directoryu_Name");
			//subDir.mkdir();
			
			//get the list of files and directory
			
			//String []files=dict.list();
			//for(String fdict:files)
				//System.out.println("Files are : \n"+fdict);
			
			
			//Delete or Rename a file or directory
			
			//File file=new File("a.txt");
			//file.renameTo(new File("new file name.extension"));
			//file.delete(); //Delete file
			//file.deleteOnExit(); //Delete when exists
	
		}else
		{
			System.out.println("File does not exists");
		}

	}

}
