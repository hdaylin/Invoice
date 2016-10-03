package hw;

import java.util.Scanner;
public class myPrices {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
        double price;
		int i= 0;   
		double myPrices[] = new double[100]; 
		double tax_amt = 0; 
		double grand_total =0; 
		double tax = 0;
		
		
		System.out.println("What is the Tax amount?"); 
		tax_amt = keyboard.nextDouble();  
		        
		System.out.println("Price?"); 
		price = keyboard.nextDouble();
		        
		
		while(price != 0.0){ 
		    myPrices[i] = price; 
			System.out.println("Give me a price");
			price = keyboard.nextDouble();  
			i++; 
			
		
} 

        double total =0; 
        

		for(int counter=0; counter<i; counter++){
		System.out.printf("Price "+ counter + ": %.02f\n", myPrices[counter]);  
		        
		total += myPrices[counter];
        tax = total * tax_amt;  
        grand_total = total + tax; 
       

} 
        
        System.out.println("----------------------------");   
        System.out.println("Reciept"); 
        System.out.println("Your total is " + total); 
        System.out.println("Tax : " + tax);
        System.out.println("Total:  " + grand_total); 
        
keyboard.close();

} 
}
