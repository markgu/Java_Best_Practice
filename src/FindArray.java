import java.util.List;
import java.util.Arrays;
import java.util.*;

public class FindArray  {
	
		  /*[4,9,3,7,8] and [3,7] should return 2.
			[1,3,5] and [1] should return 0.
			[7,8,9] and [8,9,10] should return -1.*/
	
    public int findArray(int[] array, int[] subArray) {
        // get first num of second array and find index of first array
    	// if found get next array of second array and compare with next index of first array and contine until all of the second array
    	// if success return the index
    	// if fail return -1
    	
    	for(int i=0 ; i < array.length; i++){
    		if(array[i] == subArray[0] && subArray.length < array.length - i ){
    			int j = 1;
    			int internal_i = i+1	;
    			while( j < subArray.length){
    				if(array[internal_i] == subArray[j]) {
    					
        				if(internal_i-i == subArray.length -1 ) return i;
        				else {
        					internal_i++;
            				j++;
        					continue;
        				}
    				}
    				else break;
    			}
    		}
    	}
   	
    	return -1;
    }
    
    public int findArray2(int[] array, int[] subArray) {
    	Integer arr[] = new Integer[array.length];
    	Integer subArr[] = new Integer[subArray.length];
    	for(int i = 0; i < array.length; i++ ){
    		arr[i] = Integer.valueOf(array[i]);
    	}
    	
    	for(int j = 0; j < subArray.length; j++ ){
    		subArr[j] = Integer.valueOf(subArray[j]);
    	}
    	
        return Collections.indexOfSubList(Arrays.asList(arr), Arrays.asList(subArr));
    }
    	
    	
    	public static void main(String args[])
        {
            FindArray fa = new FindArray();
            /*int[] ar1 =  {4,9,4,4,4,34,4,3,7,8} ;
            int[] ar2 =  {3,7} ;
            System.out.println("answer should be 7 " + fa.findArray( ar1, ar2 ) );
            int[] ar3 =  {1,3,6,4,5,3,1,2,1,3,5} ;
            int[] ar4 =  {1,3,5} ;
            System.out.println("answer should be 8 " + fa.findArray( ar3, ar4 ) );
            int[] ar5 =  {7,8,9,4,5,6,7,3,4,3,4,8,9,10} ;
            int[] ar6 =  {8,9,10} ;
            System.out.println("answer should be 11 " + fa.findArray( ar5, ar6 ) );
            int[] ar7 =  {7,8,9,4,5,6,7,3,4,3,4,8,9,10} ;
            int[] ar8 =  {8,9,10,11} ;
            System.out.println("answer should be -1 " + fa.findArray( ar7, ar8 ) );*/
            
            int[] ar1 =  {4,9,4,4,4,34,4,3,7,8} ;
            int[] ar2 =  {3,7} ;
            System.out.println("answer should be 7 " + fa.findArray2( ar1, ar2 ) );
            int[] ar3 =  {1,3,6,4,5,3,1,2,1,3,5} ;
            int[] ar4 =  {1,3,5} ;
            System.out.println("answer should be 8 " + fa.findArray2( ar3, ar4 ) );
            int[] ar5 =  {7,8,9,4,5,6,7,3,4,3,4,8,9,10} ;
            int[] ar6 =  {8,9,10} ;
            System.out.println("answer should be 11 " + fa.findArray2( ar5, ar6 ) );
            int[] ar7 =  {7,8,9,4,5,6,7,3,4,3,4,8,9,10} ;
            int[] ar8 =  {8,9,10,11} ;
            System.out.println("answer should be -1 " + fa.findArray2( ar7, ar8 ) );
        }
   
    
    
}