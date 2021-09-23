package Array;

public class Max_Min_Element {
	
	public static void main(String[] args)  {
		int a[]= {12,30,10,2,89,10, -1};
		
		int max=a[0];
		int min=a[0];
		
		 for(int i=1; i<a.length;i++){
	            if(a[i] >max){
	                max=a[i];
	            }
	            
	            if(a[i]<min){
	                min = a[i];
	            }
	            
	        }
		System.out.println("Maximum elemnt is : " +max);
		System.out.println("Minimum element is : " +min);
		
	}
	
	
	

}
