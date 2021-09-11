package String;

public class ReverseWithSB {
	
	public static void main (String rgs[]) {
		String str = "welcome";
		System.out.println(reverseSB(str));
	}
	static String reverseSB(String str){
		return new StringBuilder(str).reverse().toString();
	}
}