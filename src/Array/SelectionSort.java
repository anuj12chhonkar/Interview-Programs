package Array;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = { 3, 1, -2, 7, 4, 0 };
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			int minInd = i;

			// Finding minimum element always from unsorted part and put into the Beginning
			for (int j = i; j < n; j++) {

				// Updating minInd after finding it
				if (a[j] < a[minInd]) {
					minInd = j;
				}
			}

			// In each iteration we swap only once
			int temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;

		}

		for (int item : a) {
			System.out.print(item + " ");
		}
	}

}
