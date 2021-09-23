package Array;

public class Kth_Max_Min_Element {

	public static void main(String[] args) {
		int[] a = { 5, 8, 2, 9, 12, 26, 0, 1 };
		int k = 4;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				/* Below logic is for sorting the array in decreasing order

				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				*/
				// Below logic is for sorting the array in Ascending order

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			/*
			 * For printing the Kth largest Element
			 * 
			 * if(i==k-1) { System.out.println(k+ " Largest element is " +a[i]); }
			 */

			if (i == k - 1) {
				System.out.println(k + " Smallest element is " + a[i]);
			}

		}

	}

}
