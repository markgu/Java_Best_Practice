package recursion;

public class Fibonacci {

	public static int fibonacci(int number){
		if(number < 1){
			throw new IllegalArgumentException("Invalid argument for Fibonacci series :" + number);
			
		}
		
		if(number ==1 || number == 2){
			return 1;
		}
		
		return fibonacci(number - 2) + fibonacci(number -1 );
		
		
	}
	
	public static void main(String args[]) {
	      System.out.println("fibonacci series for length 1 is " + fibonacci(6));
	}
	  

	
	
}
