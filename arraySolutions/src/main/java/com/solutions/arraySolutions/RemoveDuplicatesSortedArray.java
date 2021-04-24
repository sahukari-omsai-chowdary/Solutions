/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 *
 *Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 *
 *Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
    for (int i = 0; i < len; i++) {
    print(nums[i]);
 *}
 */
package com.solutions.arraySolutions;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author sahukari omsai chowdary
 *
 */
public class RemoveDuplicatesSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//char[] intArray= { '1','2', '2', '3', '3','4', '4', '4','5', '5','6','y','y' };
	    int[] intArray= {0};
		int len=removeDuplicates(intArray);
		//System.out.println(len);
		for(int i=0;i<len;i++) {
			System.out.print(intArray[i]+"   ,");
		}
	}
	/**O(n)-time complexity
	 * o(1)-space
	 * 
	 * j starts a the new array it sees if forward elements is same -do nothing
	 *                                        not same increase j and take that value
	 * @param nums --array
	 * @return -len of modified array
	 */
	static int removeDuplicates(int[] nums) {
		int j=0;
		for(int i=1;i<nums.length;i++) {
			if(nums[j]==nums[i]) {
				//System.out.println("I went here");
			}else {
				j+=1;
				nums[j]=nums[i];
			}
		}
		return j+1;	
	}
	static int removeDuplicates(char[] nums) {
		int j=0;
		if(nums.length==1) {
			return 1;
		}
		for(int i=1;i<nums.length;i++) {
			if(nums[j]==nums[i]) {
				//System.out.println("I went here");
			}else {
				j+=1;
				nums[j]=nums[i];
			}
		}
		return j+1;	
	}

}
