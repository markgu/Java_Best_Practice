package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SafeCounter implements Runnable {

		private int count = 0;
		private int action = 0;
		private Lock lock = new ReentrantLock();
		
		private void increment(){
			this.count++;
		}
		
		private int getCount()	{
			return this.count;
		}
		
		public final void check(){
			
			if(lock.tryLock()){
				try{
					int before = count;
					increment();
					if( before != getCount() -1) {
						System.out.println("Concurrency violated!!");
						System.out.println("count : " + this.count	);
						System.out.println("action : " + this.action	);
						System.exit(0);
					}
					action++;
				}finally{
					lock.unlock();
				}			
			}		
		}
		
		public void run(){
			while(true){
				check();
			}
		}

	
	
	
	public static void main(String[] args){
		SafeCounter counter = new SafeCounter();
		new Thread(counter).start(); 
		new Thread(counter).start(); 
		new Thread(counter).start(); 

	}

}
