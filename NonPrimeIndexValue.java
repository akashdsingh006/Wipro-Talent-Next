package Milestone2Practice;

public class NonPrimeIndexValue {
	
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
		
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		
		int sum = 0;
		sum += arr[0] + arr[1];
		for(int i = 2; i < arr.length; i++) {
			if(!isPrime(i)) {
				sum += arr[i];
			}
		}
		
		System.out.println(sum);

	}

}
