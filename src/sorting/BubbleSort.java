package sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static Integer[] bubbleSort(Integer[] arr){
		for(int i = 0 ; i < arr.length-1 ; i++){
			for(int j = 0; j < arr.length-1 ; j++){
				if( arr[j] > arr[j+1]){
					Integer temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args){
		
		Integer[] arr = {9,7,5,3,1, 10, 30, 2, 90, 8} ; 
		System.out.println( Arrays.toString(bubbleSort(arr)) );
		
		
	}
}
