/**
 * Given a string s, determine 
 * if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 */
package com.solutions.stringSolutions;

/**
 * @author sahukari om sai chowdary
 *
 */
public class ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(("QWER    q:w'er"));
		System.out.println(isPalindrome("QWER    q:w'er"));
		

	}
	/**
	 * Runtime: 3 ms, faster than 61.39% of Java online submissions for Valid Palindrome.
Memory Usage: 38.8 MB, less than 79.69% of Java online submissions for Valid Palindrome.
	 * @param s -the string to verify
	 * @return -{@code true} if string is palidrome;
     *          {@code false} otherwise.
	 */
	public static boolean isPalindrome(String s) {
		boolean sol=true;
	    if(s==null){
	        return false;
	    }
	 
	    s = s.toLowerCase();
	 
	    int left=0;
	    int right=s.length()-1;
	 
	    while(left<right){
	        while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
	            left++;
	        }
	 
	        while(left<right &&  !Character.isLetterOrDigit(s.charAt(right))){
	            right--;
	        }
	 
	        if(s.charAt(left) != s.charAt(right)){
	            sol=false;
	            break;
	        }
	 
	        left++;
	        right--;
	    }
	 
	    return sol;
	}
	/**
	 * Runtime: 25 ms, faster than 20.75% of Java online submissions for Valid Palindrome.
Memory Usage: 39.9 MB, less than 23.62% of Java online submissions for Valid
	 * @param s
	 * @return
	 */
	 public static  boolean isPalindrome1(String s) {
		    if(s==null){
		        return false;
		    }
		 s = s.replaceAll("[^a-zA-Z]","");
		    s = s.toLowerCase();
		 
		    int left=0;
		    int right=s.length()-1;
		 
		    while(left<right){
		 
		        if(s.charAt(left) != s.charAt(right)){
		            return false;
		        }
		 
		        left++;
		        right--;
		    }
		 
		    return true;
		
	        
	    }
}
