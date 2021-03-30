package sorting_algorithms;

public class QuicksortThreeWay {

	public static void sort(int[] A, int p, int r) {
		if (p < r) {
			int[] ij = partition(A, p, r);
			sort(A, p, ij[0]);
			sort(A, ij[1] + 1, r);
		}
	}

	private static int[] partition(int[] A, int p, int r) {
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
		int pivot = A[r];
		int c = p;
		int i = p;
		int j = r;
		while (c <= j) {
			if (A[c] < pivot) {
				swap(A, c, i);
				c = c + 1;
				i = i + 1;
			} else if (A[c] == pivot) {
				c = c + 1;
			} else {
				swap(A, c, j);
				j = j - 1;
			}

		}
		int[] ij = { i, j };
		return ij;
	}

	private static void swap(int[] A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}

}
