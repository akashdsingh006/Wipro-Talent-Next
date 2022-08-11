import java.util.Scanner;

public class UserIDGeneration {
	
	public static String userid(String fname, String lname, int pin, int num) {
		String smallName = "";
		String largeName = "";
		if(fname.length() < lname.length()) {
			smallName = fname;
			largeName = lname;
		}else if(lname.length() < fname.length()) {
			smallName = lname;
			largeName = fname;
		}else {
			if(fname.charAt(0) < lname.charAt(0)) {
				smallName = fname;
				largeName = lname;
			}else {
				smallName = lname;
				largeName = fname;
			}
		}
		
		StringBuilder str = new StringBuilder();
		
		str.append(smallName.charAt(0) + largeName);
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				str.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}else {
				str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
		}
		
		char lr = String.valueOf(pin).charAt(num-1);
		char rl = String.valueOf(pin).charAt(String.valueOf(pin).length()-num);
		
		str.append(lr);
		str.append(rl);
		
		return str.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String fname = s.next();
		String lname = s.next();
		int pin = s.nextInt();
		int num = s.nextInt();
		
		System.out.println(userid(fname, lname, pin, num));
		

	}

}
