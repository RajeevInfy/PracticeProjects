package com.rajeev.rotate;

public class Equilibrium {

	public static void main(String[] args) {
		int[] A = { -1, 0, 1 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int eqilibriumpos = -1;
		for (int i = 1; i <= A.length - 1; i++) {
			double prev_sum = 0;
			double after_sum = 0;
			for (int k = i - 1; k >= 0; k--) {
				prev_sum = prev_sum + A[k];
			}
			for (int j = i + 1; j <= A.length - 1; j++) {
				after_sum = after_sum + A[j];
			}
			if (prev_sum == after_sum) {
				eqilibriumpos = i;
			}
		}
		return eqilibriumpos;
	}
}
