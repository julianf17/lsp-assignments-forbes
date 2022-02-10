package org.howard.edu.lsp.assignment2;
import java.util.Scanner;


public class TextProcessor {
	
	public static void main(String[ ] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers would you like to enter?");
        
		int tokens = input.nextInt();	
        int array[]= new int[tokens];
        
        System.out.print("Please type in your numbers: ");
        														//Intakes tokens user inputs 
        int prod = 1;
        int sum = 0;

        for (int i = 0 ; i < array.length; i++ ) {	
        	array[i] = input.nextInt();				
            prod = prod * array[i];	
            sum += array[i];	
        }
          
        System.out.println("Tokens:");	//Displays tokens entered
        printArray(array);
       
        System.out.println("The product of your numbers is:" +"\n" + prod);	//Displays product
        System.out.println("The sum of your numbers is:" + "\n"+ sum);			//Displays sum
        input.close();

 
        String obj = "Goodbye";
        if (input.equals(obj)) {		//System exits when user is enters the keyword "Goodbye"
        	System.exit(0);				
        }
}


    public static void printArray(int arr[ ]){
    	int n = arr.length;
    	for (int i = 0; i < n; i++) {
    		System.out.print(arr[i] + "\n");	//Allows for each  statement to be displayed on separate lines

    	}
    }


}
//Uses techniques from StackOverflow in order to take in input from the user
//Used research from Scientech.com in order to work with comparing strings/tokens
//Used research and techniques from https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html in order to make the scanner work (Ex.importing java.util.scanner) 
