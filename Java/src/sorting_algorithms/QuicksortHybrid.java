package sorting_algorithms;

public class QuicksortHybrid {

	public static void sort(int[] A, int p, int r, int k) {
		if (r - p < k) {
			return;
		} else {
			if (p < r) {
				int partitionIndex = partition(A, p, r);
				sort(A, p, partitionIndex - 1, k);
				sort(A, partitionIndex + 1, r, k);
			}
		}
		if (r - p == A.length - 1) {
			InsertionSort.sort(A);
		}
	}

	private static int partition(int A[], int p, int r) {
		int pivot = A[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (A[j] <= pivot) {
				i = i + 1;
				swap(A, i, j);
			}
		}
		swap(A, i + 1, r);
		return i + 1;
	}

	private static void swap(int[] A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}

}
