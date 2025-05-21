package day8;
import java.io.*;
import java.util.Scanner;
public class readfile1 {

	public static void main(String[] args){
		try {
		File obj=new File("c:\\Users\\patti harshini\\oneDrive\\Desktop\\sem.txt");
		Scanner r=new Scanner(obj);
		while(r.hasNextLine()) {
			String data=r.nextLine();
			System.out.println(data);
		}
		r.close();
	}catch(FileNotFoundException e) {
		System.out.println("an error has occured");
		e.printStackTrace();
	}

}
}
