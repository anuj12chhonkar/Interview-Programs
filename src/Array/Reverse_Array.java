package Array;

public class Reverse_Array {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7};
		int temp;
		int start=0;
		int end=a.length-1;
		
		while(start< end) {
			temp=a[end];
			a[end]= a[start];
			a[start] = temp;
			start++;
			end--;
		}
		
		
		for(int i=0; i<a.length;i++) {
			System.out.print(" " +a[i]);
			
		}
		
		
	}

}

/*
 * 
 * Reverse using recursion
 * import java.util.Scanner;

public class ReverseArrayRecursion {

  public static void reverse(int arr[], int start, int end) {

      int temp;

      //If start index is greater than end index
      if(start >= end)
        return;

      //Logic to swap values
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      //Recursively call
      reverse(arr, start+1, end-1);
   }


  public static void main(String[] args) {

       Scanner in = new Scanner(System.in);

       System.out.println("Enter the size of an array");
       int n = in.nextInt();

       //Declare an array
       int arr[] =  new int[n];

       System.out.println("Enter an array values");
        
       //Input array values
       for(int i = 0; i < n; i++) {
          arr[i] = in.nextInt();
       }

       reverse(arr, 0, n-1);
       
       System.out.println("Reverse of an array is ");

       for(int i = 0; i < n; i++) {
          System.out.println(arr[i]);
       }
  }

}
*/
