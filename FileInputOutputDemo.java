import java.io.*;
import java.util.*;

public class FileInputOutputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//variables File, Scanner, PrintWriter
		File file= new File("data.txt");
		Scanner in = new Scanner(file); // System.in
		PrintWriter out= new PrintWriter("output.txt");
		
		// read data
		String str1=in.nextLine();
		str1= in.nextLine()+"\n "+str1; //2 
		str1= in.nextLine()+"\n "+str1; //2
		str1= in.nextLine()+"\n "+str1; //2
		// write data
		out.println(str1);
		System.out.println(str1);
		in.close();
		out.close();
		
	}

}
