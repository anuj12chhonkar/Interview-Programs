package String;

public class ReverseMnually {

	public static void main(String[] args) {
		String str ="welcomeBack";
		System.out.println(reverseManually(str));

	}
	
	static String reverseManually(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1; i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}
