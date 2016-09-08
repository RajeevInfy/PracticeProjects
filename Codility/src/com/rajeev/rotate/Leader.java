package com.rajeev.rotate;

import java.util.HashMap;
import java.util.Map;

public class Leader {

	public static void main(String[] args) {
		int[] B ={1,2,1};
		System.out.println(solution(B));
	}

	static int solution(int A[]) {
		int leaderPos = -1;
		//ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(A));
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : A) {
			if (map.containsKey(i)) {
				int value = map.get(i);
				value = value + 1;
				map.put(i, value);
			} else {
				map.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			System.out.println("Key:"+entry.getKey()+",value:"+entry.getValue());
		}
		
		int largest = 0;
		int largestOccurence = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			//largest = entry.getKey();
			//largestOccurence = entry.getValue();
			if (largestOccurence < entry.getValue()) {
				largestOccurence = entry.getValue();
				largest = entry.getKey();
			}
		}
		System.out.println("Largest ocurrence of elemnt: "+largest+"at times :"+largestOccurence);

		int domin = (int) Math.ceil((double) A.length / 2);
		if (largestOccurence >= domin) {
			for (int j = 0; j < A.length - 1; j++) {
				if (A[j] == largest) {
					leaderPos= j;

				}
			}
		} 
		return leaderPos;

	}

}
