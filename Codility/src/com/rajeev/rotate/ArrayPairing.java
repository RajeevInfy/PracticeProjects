package com.rajeev.rotate;

public class ArrayPairing {
	public static void main(String[] args) {
		int[] intarray = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(solution(intarray));
	}

	public static int solution(int[] A) {
		int umathednumber = 0;
		int arrayLenght = A.length;
		for (int i = 0; i <= arrayLenght - 1; i++) {
			for (int j = i + 1; j <= arrayLenght - 1; j++) {
				if (A[i] != 0 && A[j] != 0 && A[i] == A[j]) {
					A[i] = 0;
					A[j] = 0;
				}
			}
		}

		// iterating to check the integer which is not set to 0

		for (int k = 0; k <= arrayLenght - 1; k++) {
			if (A[k] != 0) {
				umathednumber = A[k];
			}
		}

		return umathednumber;

	}
}
