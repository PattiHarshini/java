package day8;
import java.io.*;
public class file_creation {

	public static void main(String[] args) throws IOException{
		File f1=new File("c:\\Users\\patti harshini\\oneDrive\\Desktop\\sem.txt");
		if(f1.createNewFile()) {
			System.out.println("file created successfully");
		}
		else {
			System.out.println("not created");
		}

	}

}
