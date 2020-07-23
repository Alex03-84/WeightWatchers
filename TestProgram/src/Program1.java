import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

/*There is a file containing a word and its possible meanings (like a Dictionary). 
 * The contents of the file look like this:

Apple – a fruit, a tech firm
Table – an object, contains rows and columns when used in context of computers
Orange – a fruit

Given a path to the file, do the following:

a)    Create a method called doesFileExist(String path) which takes the path of the
 	  file and tells the user if the file exists at that path or not. Assume all paths
 	  are relative to your project structure. If the file does not exist, catch 
 	  the requisite exception.
b)    Read each word and its possible meanings and print them out. 
	  Your output should look like this:

Word1
Meaning 1
Meaning 2
Word2
Meaning1
Meaning2

Use appropriate data structures wherever necessary.
*/
public class Program1 {
	
	
	public static void doesFileExist(String path) {
		Scanner sc = null;
		try {
	         File file = new File(path);
	         if(file.exists()) {
	        	 sc = new Scanner(file); 
	        	 	
	        	    while (sc.hasNextLine()) { 
	        	    	String str = sc.nextLine();
	    	        	// parse each line using delimiter
	    	        	parseData(str);
	        	    }
	        	   
	         }
	         
	      } catch(Exception e) {
	         e.printStackTrace();
	      }finally{
	          if(sc != null)
	              sc.close();
	          }	  		
		
	}
	
	 
	
	private static void parseData(String str){	
	    String word, meaning1, meaning2;
	    Scanner lineScanner = new Scanner(str);
	    Scanner lineScanner1 = new Scanner(str);

	    lineScanner.useDelimiter("–");
	    lineScanner1.useDelimiter(",");
	    while(lineScanner.hasNext()){
	    	 while(lineScanner1.hasNext()){
	    		 word = lineScanner.next();
	    		 meaning1 = lineScanner1.next();
	    		 meaning2 = lineScanner1.next();
	      System.out.println(word);  
	      System.out.println(meaning1);  
	      System.out.println(meaning2);  
	    	 }
	    } 
	    lineScanner.close();
	    lineScanner1.close();
	  }
	
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the path");
		doesFileExist(sc.nextLine());
	}

}
