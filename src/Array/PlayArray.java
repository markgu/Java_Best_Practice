package Array;

public class PlayArray {
	
	public static void main(String args[]){
		
		Integer[] ia = new Integer[10];
		for(Integer i : ia){
			System.out.println(i); 	// all should be null
		}
		
		Integer[] ia1 = {1,2,3,4,5};
		for(Integer i : ia1){
			System.out.println(i);
		}
		
		int[] inta = new int[5];
		for(int i : inta){
			System.out.println(i);   // all should be 0
		}

	}
}
