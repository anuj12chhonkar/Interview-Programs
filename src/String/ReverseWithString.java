package String;

public class ReverseWithString {

	public static void main(String[] args) {
		String str = "anuj";
		ReverseWithString obj = new ReverseWithString();
		obj.reverseString(str);

	}

	public void reverseString(String s) {
		
		char[] characters =s.toCharArray();
		/*
		 * int i =0; int j=s.length() - 1;
		 * 
		 * while(i<j) { char temp =characters[i]; characters[i++] =characters[j];
		 * characters[j--] = temp; } System.out.println(characters.toString());
		 
		return new String(characters.toString());
		*/
		for(int i=characters.length -1; i>=0;i--) {
			System.out.print(characters[i]);
		}
		
		
	}
}
