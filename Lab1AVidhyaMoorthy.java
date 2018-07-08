import java.io.*;
import java.util.ArrayList;


public class Lab1AVidhyaMoorthy {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		 ArrayList<String> lines = new ArrayList<String>();
		 String fName = "lab1aVidhyaMoorthyData.txt";
		 FileReader fr = new FileReader(fName);
		 BufferedReader br = new BufferedReader(fr);
		PrintWriter pw = new PrintWriter("lab1aVidhyaMoorthyOutput.txt");
		 String line;
		 while((line = br.readLine()) != null)
		 {
			lines.add(line);
		 }
         
         pw.write("firstName\tlastName\tupdatedSalary");
         pw.write("\r\n"); 
         for(String str:lines)
         {
            String[] words = str.split(" ");
            String fname = words[1];
            String lname = words[0];
            double salary = Double.parseDouble(words[2]);
            double pIncrease = Double.parseDouble(words[3]);
            salary = salary+(salary*(pIncrease/100));
            pw.format("%s\t\t%s\t\t%.2f",fname,lname,salary);
            pw.write("\r\n");
         }

	/**	 for(int i=lines.size()-1;i>=0;i--)
		 {
			 fw.write(lines.get(i));
			 fw.write("\r\n"); 
         }
         */
		br.close();
		pw.close();
	

	}

}
