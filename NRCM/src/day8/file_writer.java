package day8;
import java.io.*;
public class file_writer {

	public static void main(String[] args) throws IOException{
		FileWriter f1=new FileWriter("c:\\Users\\patti harshini\\oneDrive\\Desktop\\sem1.txt");//if file not there it will create and write into it
		f1.write("file created successfully");
		f1.close();//file will wait for next statements to write if we not close
		System.out.println("sucess");
		}

	}


