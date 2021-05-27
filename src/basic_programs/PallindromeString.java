package basic_programs;

public class PallindromeString {
	
	public static boolean canPalindrome(String s) {
		int[] count=new int[128];
		
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)]++;
		}
		
		int num=0;
		
		for(int i=0;i<128;i++) {
			num+=count[i]%2;
			
		}
		return num<=1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		canPalindrome("racecar");

	}

}
