package sorting_algorithms;

public class InsertionSort {

	public static void sort(int[] A) {
		int key, i;
		for (int j = 1; j < A.length; j++) {
			key = A[j];
			i = j - 1;
			while (i >= 0 && A[i] > key) {
				A[i + 1] = A[i];
				i = i - 1;

			}
			A[i + 1] = key;
		}
	}
}