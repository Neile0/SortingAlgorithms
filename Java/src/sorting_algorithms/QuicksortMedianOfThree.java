package sorting_algorithms;

public class QuicksortMedianOfThree {

	public static void sort(int[] A, int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			sort(A, p, q - 1);
			sort(A, q + 1, r);
		}
	}

	private static int partition(int A[], int p, int r) {
		int q = (p + r) / 2;
		if (A[q] < A[p]) {
			swap(A, p, q);
		}
		if (A[r] < A[p]) {
			swap(A, p, r);
		}
		if (A[q] < A[r]) {
			swap(A, q, r);
		}
		int x = A[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
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
