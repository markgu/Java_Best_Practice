package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackAndQueue {
	Deque<String> stack ;
	
	public void init(){
		this.stack = new ArrayDeque<String>();	
	}
	
	public void prepare(){
		System.out.println("\n ADD five elements") ;
		stack.clear();
		stack.add("First");
		stack.add("second");
		stack.add("third");
		stack.add("Fourth");
		stack.add("Fifth");
	}
	
	public void prepareByPush(){
		System.out.println("\n PUSH six elements") ;
		stack.clear();
		stack.push("First");
		stack.push("second");
		stack.push("third");
		stack.push("Fourth");
		stack.push("Fifth");
		stack.push("Sixth");
	}
	
	public static void main(String[] args){
		
		StackAndQueue saq = new StackAndQueue();
		saq.init();
		saq.prepare();
		
		// FIFO - Add then pop
		while(!saq.stack.isEmpty()){
			System.out.println("pop one : " + saq.stack.pop()) ;
		}
				
		// FIFO - Add then poll
		saq.prepare();		
		while(!saq.stack.isEmpty()){
			System.out.println("poll one : " + saq.stack.poll()) ;
		}
		
		// just retrieve not remove of head element
		saq.prepare();
		System.out.println("poll one : " + saq.stack.peek()) ;
		
		// LIFO - push then pop
		saq.prepareByPush();
		while(!saq.stack.isEmpty()){
			System.out.println("pop one : " + saq.stack.pop()) ;
		}
		
	}
	
	

}
