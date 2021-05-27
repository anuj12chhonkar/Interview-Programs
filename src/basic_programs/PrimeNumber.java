package basic_programs;

public class PrimeNumber {
	static void prime(int num) {
		int flag=0;
		
		for(int i=2; i<num;i++) {
		
		if(num%i==0 || num==0) {
			System.out.println("Not Prime");
			flag=1;
			break;
		}
		
		}
		if(flag==0) {
			System.out.println("Prime");
		}
		 
		
	}
	
	public static void main(String[] args) {
		prime(19);
	}

}
