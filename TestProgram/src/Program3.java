import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Generate 500 random numbers and create a method to print the nth smallest number in
//a programming language of your choice.


public class Program3 {
	
	private static int[] anArray;

	public static int[] list() {
	    anArray = new int[500];
	    for(int i=0;i<anArray.length;i++)
	    {
	        anArray[i] = randomFill();
	    }
	    return anArray;
	}

    public static void print(){
        for(int n: anArray){
        System.out.println(n+" ");
        }
    }
    
    public static int randomFill(){

        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    }
    
    public static int smallestNumberIn(int a) {
    	
    	Arrays.sort(anArray); 
        
    	return  anArray[a];  
    }
	    
    
	
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		list();
		randomFill();
		
		System.out.println(smallestNumberIn(n));
		
		
	}

}
