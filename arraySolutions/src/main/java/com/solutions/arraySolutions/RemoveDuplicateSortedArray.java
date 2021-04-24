/**
 * 
 */
package com.solutions.arraySolutions;

/**
 * @author Admin
 *
 */
public class RemoveDuplicateSortedArray {

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
