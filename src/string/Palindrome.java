package string;

import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrome {
	
	public static boolean isPalindromeNumber(Integer num){
		String given = "" + num;
		char[] ca = given.toCharArray();
		Deque dq = new ArrayDeque();
		for(char ch : ca){
			dq.push(ch);
		}
		
		String reverseNum = "";
		while(!dq.isEmpty()){
			reverseNum += dq.pop();
		}
		
		System.out.println("given num => " + given + " reverseNum is => " + reverseNum );
		if(reverseNum.equals(given) ){
			return true;
		}
		return false;		
	}
	
	public static boolean isPalindromeNumber2(Integer num){
		if(num.equals(reverse(num))){
			return true;
		}
		return false;
	}
	
	// What a nice algorithm !!!! 
	/*division operator can be used to get rid of last digit 
	e.g. 1234/10 will give you 123
    modulus operator can give you last digit 
    e.g. 1234%10 will return 4.*/
	public static Integer reverse(Integer number){
		Integer reverse = 0;
		
		while(number != 0){
			reverse = reverse*10 + number%10;
			number = number/10;
		}
		return reverse;
	}
	
	public static void main(String[] args){
		System.out.println(" should be true => " + isPalindromeNumber(1221));
		System.out.println(" should be true => " + isPalindromeNumber(22));
		System.out.println(" should be false => " + isPalindromeNumber(2322));
		
		System.out.println(" should be true => " + isPalindromeNumber2(1221));
		System.out.println(" should be true => " + isPalindromeNumber2(22));
		System.out.println(" should be false => " + isPalindromeNumber2(2322));
		
	}


}
