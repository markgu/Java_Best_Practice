package stackAndQueue;

import java.util.ArrayList;

public class StackImpl {
	ArrayList<Object> array = new ArrayList<Object>();
	
	public StackImpl(){
	}
	
	public void add(Object obj)	{
		array.add(obj);
	}
	
	public Object pop(){
		return array.remove(size()-1);		
	}
	
	public boolean contains(Object value){
		for(Object object : array){
			if(value.equals(object) ){
				return true;
			}			
		}
		return false;
	}
	
	public int size(){
		return array.size();
	}
	
	public boolean isEmpty(){
		if(size() == 0) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args){
		StackImpl stack = new StackImpl();
		stack.add("First");
		stack.add("second");
		stack.add("third");
		stack.add("Fourth");
		stack.add("Fifth");
				
		while(!stack.isEmpty()){
			System.out.println("pop one : " + stack.pop()) ;
		}
		
	}
	
		
	
	
	

}
