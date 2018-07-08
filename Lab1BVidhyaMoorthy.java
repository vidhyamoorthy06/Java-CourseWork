import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab1BVidhyaMoorthy  {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		 ArrayList<String> lines = new ArrayList<String>();
		 String fName = "lab1bVidhyaMoorthyData.txt";
		 FileReader fr = new FileReader(fName);
		 BufferedReader br = new BufferedReader(fr);
		 FileWriter fw = new FileWriter("lab1bVidhyaMoorthyOutput.txt");
		 String line;
		 while((line = br.readLine()) != null)
		 {
			lines.add(line);
		 }
		 
		 for(int i=lines.size()-1;i>=0;i--)
		 {
			 fw.write(lines.get(i));
			 fw.write("\r\n"); 
		 }
		br.close();
		fw.close();
	

	}

}
