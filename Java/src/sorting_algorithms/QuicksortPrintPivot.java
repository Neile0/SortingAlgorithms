package sorting_algorithms;

import java.util.Arrays;

public class QuicksortPrintPivot {

	public static void sort(int[] A, int p, int r) {
		if (p < r) {
			int partitionIndex = partition(A, p, r);
			sort(A, p, partitionIndex - 1);
			sort(A, partitionIndex + 1, r);
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
		int pivot = A[r];
		int[] subarray = Arrays.copyOfRange(A, p, r+1);
		
		System.out.println("\n\nSubarray: " + Arrays.toString(subarray) + " \nPivot: " + pivot);
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
