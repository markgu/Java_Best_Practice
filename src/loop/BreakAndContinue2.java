package loop;

public class BreakAndContinue2 {
	
	public static void main(String[] args) {
		
			outer:
			for(int k = 1; k < 10; k++) {
		    	for(int i = 1 ; i < 10; i++) {
			   	      if(i == 5) break outer; // Out of for loop
			   	   if(i % 2 == 0) continue ; // Next iteration
			   	      System.out.println(k + " loop " + i);
			   	      
			   	      
			   	}

				
		}
	
		
		//System.out.println(" loop ended  ");
			
			
	   /* while(true) {
	    	for(int i = 0; i < 10; i++) {
	   	      if(i == 3) return; // Out of for loop
	   	      if(i % 2 == 0) continue; // Next iteration
	   	      System.out.println(i);
	   	    }
	    }*/
	    
	   
	 }
	
	
	

}
