package Milestone3Practice;

import java.util.Scanner;

public class StringDecoder {
	
	public static int getNumberOfOnes(String ch) {
		int count = 0;
		for(int i = 0; i < ch.length(); i++) {
			if(ch.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String ans = "";
		
		int i = 0;
		for(int j = 0; j < str.length(); j++) {
			if(str.charAt(j) == '0') {
				String ch = str.substring(i, j);
				i = j+1;
				int count = getNumberOfOnes(ch);
				char alpha = (char)(64+count);
				ans = ans + alpha;
			}
		}
		
		System.out.println(ans);
		
		

	}

}
