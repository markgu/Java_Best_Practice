package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableTest {
	
	// Find duplicate in an object array and return a Hashtable according to result
	public static Hashtable<Object, Integer> FindDupInArray(Object[] arr){
		Hashtable<Object, Integer> ht = new Hashtable<Object, Integer>();
		for(Object obj : arr){
			if(ht.containsKey(obj)) {
				ht.put(obj, (Integer)ht.get(obj)+1);
			}else{
				ht.put(obj, 1);
			}
		}
		return ht;
	}
	
	// same implementation using HashMap instead
	public static HashMap<Object, Integer> FindDupInArrayUsingMap(Object[] arr){
		HashMap<Object, Integer> hm = new HashMap<Object, Integer>();
		for(Object obj : arr){
			if(hm.containsKey(obj)) {
				hm.put(obj, (Integer)hm.get(obj)+1);
			}else{
				hm.put(obj, 1);
			}
		}
		return hm;
	}
	
	// Finding keys by it's value
	public static Set findKeyByValue(Hashtable<Object,String> table, String value){
		Set<Object> set = new HashSet<Object>();
		for( Map.Entry entry: table.entrySet() ){
			if(value.equals( entry.getValue() )){
				set.add(entry.getKey());
			}
		}
		return set;		
	}
	
	public static void main(String[] args){
		
		Integer[] arr = { 1,2,3,4,3,4,5,6,7,5,6,8,9};		
		System.out.println(FindDupInArray(arr));
		System.out.println(FindDupInArrayUsingMap(arr));
		
		String[] strArr = {"one", "two", "three", "one", "Four", "five", "one", "two" };
		System.out.println(FindDupInArray(strArr));
		System.out.println(FindDupInArrayUsingMap(strArr));   
		
		Hashtable table = new Hashtable();
		table.put("Sony", "Vio");
		table.put("Samsung", "Galaxy");
		table.put("Nokia", "Lumia");
		table.put("LG", "Galaxy");
		System.out.println( new HashSet(findKeyByValue(table, "Galaxy"))  );
	}

}
