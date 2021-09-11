package Recursion;

public class Power_Calculation {

	public static void main(String[] args) {
		
		System.out.println(pow(2,3));
		System.out.println(fastPow(2,4));
		

	}
	
	static int pow(int a,int b) {
		if(b==0)
			return 1;
		
		return a*pow(a,b-1);
	}
	
	static int fastPow(int a, int b) {
		if(b==0)
			return 1;
		
		if(b%2==0)
			return fastPow(a*a,b/2);
		return a*fastPow(a,b-1);
		
					
	}

}
