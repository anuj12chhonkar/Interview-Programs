package basic_programs;

public class Palindrome {

	public static void main(String[] args) {
		//121, 12321
		pallindrome(121);

	}
	
	static void pallindrome(int n) {
		int rev,sum=0,temp;
		temp=n;
		while(n>0) {
		
		
		rev =n%10;
		sum=sum*10+rev;
		n=n/10;
		}
		if(temp==sum)
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
		
		}
		
		
	}
	


