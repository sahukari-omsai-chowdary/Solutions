/**
Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
 and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 */
package com.solutions.arraySolutions;

import java.util.HashMap;

/**
 * @author Sahukari om sai chowdary
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,7,11,15};
		int target=9;
		int[] sol=twoSum1(nums,target);
		
		System.out.println(target==(sol[0]+sol[1]));
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		System.out.println(map.get(4));
		

	}
	/**
	 * Brute force
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
    public static int[] twoSum(int[] nums, int target) {
    	for(int i=0;i<nums.length-1;i++) {
    		for(int j=0;j<nums.length;j++) {
    			if(nums[i]+nums[j]==target) {
    				int[] sol={nums[i],nums[j]};
    				return sol ;
    			}
    		}
    	}
    	
		return nums;
        
    }
    
    public static int[] twoSum1(int[] nums,int target) {
    	int[] sol= {-1,-1};
    	HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
    	for(int n:nums) {
    		map.put(n, target-n);
    		if(map.get(target-n)!=null) {
    			sol[0]=n;
    			sol[1]=target-n;
    		}
    	}
    	
    	return sol;
    }
}
