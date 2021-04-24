/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
package com.solutions.mathSolutions;

/**
 * 
 * @author Sahukari om sai chowdary
 *
 */
public class ReverseNumber {
	/**
	 * Please see the triky part they are asking with the limit int only the int
	 * highest value is 2147483647 when it is reveres they are asking to making it
	 * as zero when we will make it reverse it will not come as zero some other
	 * value will come so int sol=0;int rem=0; while(num!=0){ rem=num%10;
	 * sol=(sol*10)+(num%10); num=num/10; System.out.println(num+" ,"+rem); } return
	 * sol;
	 * 
	 * this might not work (actually it didnt work)(because that extream numbers
	 * 1534236469)
	 * 
	 * BASICALLY MEANS OVERFLOW HANDLED
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 23154361;
		System.out.println(reverse(i));
		int j = -1534244699;
		System.out.println(reverse(j));
		
		System.out.println(reverse1(j));
	}

	/**
	 * here you can think as we can write 
	 *(solution-remainder)!=(previous_num*10)
	 *but if we do this previos*10 might be overflowed (it can be edge of its limit )
	 *we cant compare two overflow at solution there might be chance of overfloe 
	 *to detect it 
	 *
	 *we just subtracted the remander and then divied by 10 if solution is not over flowed 
	 *then result will come as previous solution
	 * @param num
	 * @return -the reversed number
	 */
	static int reverse(int num) {
		int solution = 0;
		int remanider = 0;
		int previous_num = 0;
		while (num != 0) {
			remanider = num % 10;
			solution = (solution * 10) + remanider;
			if ((solution - remanider)/10 != (previous_num)) { //read above description for this
				System.out.println("OVERFLOW HANDLED");
				solution = 0;
				break;
			}
			previous_num = solution;
			num = num / 10;
			// System.out.println("pre "+pre+"sol ")
		}
		return solution;
	}

	static int reverse1(int num) {
		// Handling negative numbers
		boolean negativeFlag = false;
		if (num < 0) {
			negativeFlag = true;
			num = -num;
		}

		int prev_rev_num = 0, solution = 0;
		while (num != 0) {
			int remainder = num % 10;

			solution = (solution * 10) + remainder;

			// checking if the reverse overflowed or not.
			// The values of (rev_num - curr_digit)/10 and
			// prev_rev_num must be same if there was no
			// problem.
			if ((solution - remainder) / 10 != prev_rev_num) {
				System.out.println("WARNING OVERFLOWED!!!");
				return 0;
			}

			prev_rev_num = solution;
			num = num / 10;
		}

		return (negativeFlag == true) ? -solution : solution;
	}
}
