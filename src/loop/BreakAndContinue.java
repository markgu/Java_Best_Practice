package loop;

public class BreakAndContinue {
	
	public static void main(String[] args) {
		
	    /*for(int i = 0; i < 100; i++) {
	      if(i == 31) break; // Out of for loop
	      if(i % 10 == 0) continue; // Next iteration
	      System.out.println(i);
	    }*/

		for(int i = 0; i < 10; i++) {
	   	      if(i == 9) break; // Out of for loop
	   	      if(i % 2 == 0) continue; // Next iteration
	   	      System.out.println(i);
	   	}
	   
	    int count = 0;
	    while( count < 10) {
	    	for(int i = 0; i < 10; i++) {
	   	      if(i == 9) break; // Out of for loop
	   	      if(i % 2 == 0) continue; // Next iteration
	   	      System.out.println(i);
	   	    }
	    	count ++;
	    }
	    
	    for(int k = 0; k < 10; k++) {
	    	for(int i = 0; i < 10; i++) {
		   	      if(i == 3) break; // Out of for loop
		   	      if(i % 2 == 0) continue; // Next iteration
		   	      System.out.println(k + " loop " + i);
		   	    }
	    }
	    
	    while(true) {
	    	for(int i = 0; i < 10; i++) {
	   	      if(i == 3) return; // Out of for loop
	   	      if(i % 2 == 0) continue; // Next iteration
	   	      System.out.println(i);
	   	    }
	    }
	    
	   
	 }
	
	
	

}
