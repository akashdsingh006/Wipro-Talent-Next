package Milestone2Practice;

import java.util.Arrays;

public class PrimeSumExceptLargestPrime {
	
	static boolean isPrime(int n) {
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {10,41,18,50,43,31,29,25,59,96,67};
		int[] arr = {10,20,30,40};
		
		int sum = 0;
//		int count = 0;
		boolean flag = false;
		int primeMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(isPrime(arr[i])) {
//				count++;
				flag = true;
				if(arr[i] > primeMax) {
					primeMax = arr[i];
				}
				sum += arr[i];
			}
		}
		
		sum = sum - primeMax;
		
		if(flag == false) {
			sum = 0;
			Arrays.sort(arr);
			for(int i = 0; i < arr.length-1; i++) {
				sum += arr[i];
			}
			
		}
		
		System.out.println(sum);

	}

}
