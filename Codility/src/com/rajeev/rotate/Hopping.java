package com.rajeev.rotate;

public class Hopping {

	public static void main(String[] args) 
	{
		System.out.println("Test Case:"+solution(3, 999111321, 7));
		
	}
	
	/**This method calculate the remainder 
	 * If Remainder is non zero then the no of hops will be the 
	 * @param start starting position
	 * @param end ending position
	 * @param hop_interval
	 * @return no_of_hops
	 */
	static int solution(int start,int end,int hop_interval)
	{
		double totalhops=0;
		int remainder=(end-start)%hop_interval;
		totalhops=(((double)end-(double)start)/(double)hop_interval);
		System.out.println(totalhops);
		if(remainder!=0)
		{
			totalhops=Math.ceil(totalhops);;
		}
		System.out.println(totalhops);
		return (int)totalhops;
	}
}
