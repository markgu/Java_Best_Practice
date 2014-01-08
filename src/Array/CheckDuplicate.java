package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicate {
	
	/* 
	 * detect duplicate in Array by comparing size of List and Set
	 * since Set doesn't contain duplicate, size must be less than an array which contains duplicates
	 */
	public static boolean checkDupUsingSet(Integer[] arr){
		List<Integer> inputList = Arrays.asList(arr);
		Set<Integer> inputSet = new HashSet(inputList);
		System.out.println(inputSet.toString());
		if(inputSet.size() < inputList.size()){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Integer[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("should return false => " + checkDupUsingSet(arr) );
		Integer[] arr2 = {1,2,3,4,5,6,7,8,4};
		System.out.println("should return true => " + checkDupUsingSet(arr2) );
	}

}
