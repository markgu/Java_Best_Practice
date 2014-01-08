package string;

import java.util.Arrays;
import java.util.List;

public class StringPlay {
	
	public static String reverse(String string){
		char[] ca = string.toCharArray();
		
		String reverse = "";
		for(int i = ca.length -1 ; i >= 0 ; i--) {
			reverse += ca[i];
		}
		return reverse;
	}

	// GREAT recursion example!
	public static String reverseUsingRecursion(String given){
		if(given.length() < 2) {
			return given;
		}
		return reverseUsingRecursion(given.substring(1)) + given.charAt(0) ;
	}

	public static void main(String[] args){
		
		System.out.println("should return dcba => " + reverse("abcd") );
		System.out.println("should return suseJ => " + reverse("Jesus") );
		
		System.out.println("should return dcba => " + reverseUsingRecursion("abcd") );
		System.out.println("should return suseJ => " + reverseUsingRecursion("Jesus") );
	}
	
}
