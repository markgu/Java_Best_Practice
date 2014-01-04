package generics;

import java.util.ArrayList;
import java.util.Collection;

public class PlayGenerics {
	
	public static <T> void fromArrayToCollection(T[] arr, Collection<T> col){
		for(T obj : arr ){
			col.add(obj);
		}
	}
	
	public void doThis(){
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<String>();
		
		fromArrayToCollection(sa, cs);
	}
	
	// T should implement Comparable in order to call this method 
	public static <T extends Comparable> T max(T obj1, T obj2){
		if(obj1.compareTo(obj2) > 0) {
			return obj1;
		}
		return obj2;
	}
	
	

}
