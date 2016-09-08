package com.rajeev.rotate;

public class MaxProfitSharing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int A[]={23171,21011,21123,21366,21013,21367};
	System.out.println(solution(A,6));
	}
	
	static int solution(int A[], int N){
		int maxprofit=0;
		for(int i=0;i<=N-1;i++)
		{
			for(int j=i+1;j<=N-1;j++)
			{
				if(A[j]-A[i]>maxprofit)
				{
				maxprofit=A[j]-A[i];
				}
			}
		}
		
		if(maxprofit>0)		
			return maxprofit;
		else
			return -1;
	}

}
