package Array;
/*

public class SortZeroOneTwo_DutchNationalFlag {

	// Sorting an array using simple counting
	//count the number of zero and one present in an array.
	//Now we can easily find the count of two by subtracting the count of zero and one with an array length.

	public static void sort(int[] arr) {
		int zeroCount = 0;
		int oneCount = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0)
				zeroCount++;
			if (arr[i] == 1)
				oneCount++;
		}

		for (int i = 0; i < zeroCount; i++)
			arr[i] = 0;

		for (int i = zeroCount; i < (zeroCount + oneCount); i++)
			arr[i] = 1;

		for (int i = (zeroCount + oneCount); i < arr.length; i++)
			arr[i] = 2;

	}

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 2, 1, 0, 1, 0, 0, 1, 20, 2, 1 };

		sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}
}

*/

// Sort an Array of 0s, 1s, and 2s (In-place sorting)
// Dutch national flag algorithm or three-way partitioning.
// All the elements to the left of "low" pointer is "o" and elements to the right of "high" pointer is 2.

    public class SortZeroOneTwo_DutchNationalFlag {
	public static void main(String args[]) {
	
		int nums[] = {0,2,1,0,2,0,2,2,1,2,0,1,2,1,1};
		sortColors(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+ " ");
			
		}
		
				
	}
	
	
    public static void sortColors(int[] nums) {
        int lo = 0; 
        int hi = nums.length - 1; 
        int mid = 0; 
        int temp; 
        while (mid <= hi) { 
            switch (nums[mid]) { 
                case 0: { 
                    temp = nums[lo]; 
                    nums[lo] = nums[mid]; 
                    nums[mid] = temp; 
                    lo++; 
                    mid++; 
                    break; 
                } 
                case 1: 
                    mid++; 
                    break; 
                case 2: { 
                    temp = nums[mid]; 
                    nums[mid] = nums[hi]; 
                    nums[hi] = temp; 
                    hi--; 
                    break; 
                } 
            } 
        }
    }
}