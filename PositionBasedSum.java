package Milestone2Practice;

public class PositionBasedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,89,567,8321};
		int[] arr1 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			String str = Integer.toString(arr[i]);
			arr1[i] = Integer.parseInt(str.charAt(str.length()-1-i) + "");
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			sum += arr1[i] * arr1[i];
		}

		System.out.println(sum);
	}

}
