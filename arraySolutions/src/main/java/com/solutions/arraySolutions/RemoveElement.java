/**
 Gvien an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

*/
package com.solutions.arraySolutions;
/**
 * @author Admin
 *
 */
public class RemoveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: nums = [3,2,2,3], val = 3
		//		Output: 2, nums = [2,2]
		// nums is passed in by reference. (i.e., without making a copy)
		int[] nums= {3,2,2,3};
		int val=3;
		int len = removeElement(nums, val);

		// any modification to nums in your function would be known by the caller.
		// using the length returned by your function, it prints the first len elements.
		for (int i = 0; i < len; i++) {
		    System.out.print(nums[i] +"  ,");
		}
	}
	/**
	 * parsing through whole array
	 * seeing if elements are same or not
	 *   if not same a[j]=n and j=j+1
	 *   if same we are ignoring the value
	 *   	so next time if not element is choosed we are overiding the element
	 * @param nums
	 * @param val
	 * @return new length
	 */
    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int n:nums) {
        	if(val!=n) { 
        		nums[j++]=n; 
        	}                					
        }
        return j;
    }
}
