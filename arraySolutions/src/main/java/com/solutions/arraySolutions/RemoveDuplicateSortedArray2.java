/**
 * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

Clarification:

Confused why the returned value is an integer, but your answer is an array?

Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 */
package com.solutions.arraySolutions;

/**
 * @author Sahukari om sai chowdary
 *
 */
public class RemoveDuplicateSortedArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] intArray= { '1','2', '2', '3', '3','4', '4', '4','5', '5','6','y','y' };
	    int[] intArray= {0,0,0,0,1,1,1,1,2,3,4,5};
		int len=removeDuplicates1(intArray);
		//System.out.println(len);
		for(int i=0;i<len;i++) {
			System.out.print(intArray[i]+"   ,");
		}
	}
	/**O(n)-time complexity
	 * o(1)-space
	 * 
	 * j starts a the new array it sees if forward elements is same -
	 * 													see no of matching 
	 * 																<2  increase j and take that value increment count
	 * 																else -do nothing
	 *                                        not same increase j and take that value count =1
	 * @param nums --array
	 * @return -len of modified array
	 */
	static int removeDuplicates(int[] nums) {
		int j=0;int count =1;
		for(int i=1;i<nums.length;i++) {
			if(nums[j]==nums[i]) {
				if(count<2) {
					j+=1;
					nums[j]=nums[i];count+=1;
				}else {
					
				}
			}else {
				count=1;
				j+=1;
				nums[j]=nums[i];
			}
		}
		return j+1;	
	}
	/**
	 * A much compact solution copied from leetcode comments
	 * @param nums
	 * @return
	 */
	static int removeDuplicates1(int[] nums) {
	    int i = 0;
	    for (int n : nums) {
	    	System.out.println(n);
	        if (i < 2 || n > nums[i-2]) {
	            nums[i++] = n;
	        }
	    }
	    System.out.println("------------");
	    return i;	
	}

}
