package com.rajeev.rotate;

import java.util.Arrays;

public class ListLength 
{
public static void main(String[] args) {
	int A[]={1,4,-1,3,2};
	System.out.println(lenght(A));
}

public static int lenght(int A[] )
{
	Arrays.sort(A);
	int i=0;
	while(A[i]!=-1)
	{
		i=i+1;		
	}	
	return i;
}
}
