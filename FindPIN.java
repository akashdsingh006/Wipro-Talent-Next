package Milestone2Practice;

import java.util.Scanner;

public class FindPIN {
	
	public static int findMax(int input1) {
//		int max = Integer.MIN_VALUE;
		int max = 0;
		while(input1 > 0) {
			int rem = input1%10;
//			if(rem > max) {
//				max = rem;
//			}
			max = Math.max(max, rem);
			input1/=10;
 		}
		
		return max;
	}
	
	public static int findMin(int input1) {
//		int min = Integer.MAX_VALUE;
		int min = 9;
		while(input1 > 0) {
			int rem = input1%10;
//			if(rem < min) {
//				min = rem;
//			}
			min = Math.min(min, rem);
			input1/=10;
 		}
		
		return min;
	}
	
	
	public static int findPIN(int input1, int input2, int input3, int input4) {
		int max1 = findMax(input1);
		int max2 = findMax(input2);
		int max3 = findMax(input3);
		
		int min1 = findMin(input1);
		int min2 = findMin(input2);
		int min3 = findMin(input3);
		
		int sum = ((max1*min1) + (max2*min2) + (max3*min3)) - input4;
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int input1 = s.nextInt();
		int input2 = s.nextInt();
		int input3 = s.nextInt();
		int input4 = s.nextInt();
		
		System.out.println(findPIN(input1,input2,input3,input4));

	}

}
