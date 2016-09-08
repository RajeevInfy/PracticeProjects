package com.rajeev.rotate;

import java.util.Arrays;

public class PermMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] N={4,1,2};
		System.out.println(solution(N,6));
	}
	static int  solution(int A[], int N)
	{
		int missingelement=0;
		if(A.length==1)
		{
			missingelement=A[0];	
		}
		else
		{
		Arrays.sort(A);
		 for(int i=0;i<A.length-1;i++)
		 {
			if(A[i+1]!=A[i]+1)
			{
				missingelement=A[i]+1;
			}
		 }
		}
		 return missingelement;
	}

}
