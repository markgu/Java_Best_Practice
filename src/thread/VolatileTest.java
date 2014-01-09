package thread;

public class VolatileTest implements Runnable {
	
	// volatile doesn't really prevent from violating Atomic operation 
	// but synchronized clearly help in this case.
	//volatile long i = 0;
	long i = 0;
	
	public void increment(){		
		i++;
	}
	
	
	public void run(){
		long save ;
		while(true){			
			synchronized(this) {
				save = i;
				increment();		
				if(i != save + 1) {
					System.out.println("Atomic operation is violated !!!! The value of i => " + i);
					System.exit(0);
				}
			}		
			
		}
	}
	
	public static void main(String[] args){
		VolatileTest vt = new VolatileTest();
		for(int i = 0; i < 10 ; i++){
			// Sharing one instance for all Threads - for proper multi-threading test
			new Thread(vt).start();   
			
			// Creating each instance for each thread won't violate Atomic operation
			//new Thread(new VolatileTest()).start();
		}
		
		
		
	}
	

}
