package Milestone3Practice;

public class TransformCodes {
	
	public static int findLength(int n) {
		int count = 0;
		while(n > 0) {
//			int rem = n%10;
			count++;
			n = n/10;
		}
		return count;
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static String singleDigitSum(int n) {
		int sum = 0;
		while(n > 0) {
			int rem = n%10;
			sum += rem;
			n /= 10;
		}
		int ans = sum;
		if(ans > 9) {
			while(ans > 9) {
				ans = 0;
				while(sum > 0) {
					int rem = sum%10;
					ans += rem;
					sum = sum/10;
				}
				sum = ans;
			}
		}
//		while(ans > 9) {
//			ans = 0;
//			while(sum > 0) {
//				int rem = sum%10;
//				ans += rem;
//				sum = sum/10;
//			}
//			sum = ans;
//		}
		return Integer.toString(ans);
	}
	
	public static String[] helper(int[] arr) {
//		String ans = "";
		String[] str = new String[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			String ans = "";
			if(findLength(arr[i]) == 6) {
				ans += 'C';
			}else {
				ans += 'W';
			}
			
			if(arr[i] == 0) {
				ans += 'Z';
			}else if(arr[i] == 1){
				ans += 'O';
			}
			
			if(isPrime(arr[i])) {
				ans += 'P';
			}else {
				ans += 'N';
			}
			
			ans += singleDigitSum(arr[i]);
			
			if(arr[i]%2 == 0) {
				ans += Integer.toString(arr[i]/2);
			}else {
				ans += Integer.toString((arr[i]-1)/2);
			}
			
			str[i] = ans;
			
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {123456, 1234567};
		String[] str = helper(arr);
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

	}

}
