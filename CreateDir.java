//here we creating the package to place the my java file in the particular directory
//we are creating the package for the uniqueness in the program
package create.dir.example;//package as create.dir.example

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//here we are creating a class
public class CreateDir {//class name as CreateDir
//here we are creating the main method
	public static void main(String[] args) {
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		
			
			 //here we are Applying the try and catch for handling the excption
				    try
				    {  
				    	/*
				    	 * here we are creating the source file and destination file
				    	 * by using the file reader and file writer
				    	 * we are using the file reader to read the file and 
				    	 * using file writer to write the file
				    	 * 
				         */ 
				      FileReader fr = new FileReader("E:/File/New/abc.txt");
				      FileWriter fw = new FileWriter("E:/File/New/New2/bcd.txt");
				     //here we are taking the int variable 
				      int k;
				      //here we are applying the .read method to read the file whole file
				      while( ( k = fr.read() ) != -1 )
				      {
				    	  //here we are applying the write method to write in the another file
				        fw.write(k);   		
				        System.out.print((char) k);  //system is used to return code
				        //out is a static member
				      	//Println is used to print text  and gives output
				      }
				      //here we are closing the read and write
				      fw.close();
				      fr.close();
				    }
				    catch(FileNotFoundException e)//filenotfoundexception
				    {
				      System.out.println("File does not exist. " + e);//system is used to return code
				        //out is a static member
				    	//Println is used to print text  and gives output
				    }
				    catch(IOException e)
				    {
				      System.out.println("Some I/O problem. " + e);//system is used to return code
				        //out is a static member
				    	//Println is used to print text  and gives output
				    }
				  }
				}
	
    