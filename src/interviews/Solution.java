package interviews;
import java.util.*;


public class Solution {

	
	public int solution(int[] A) {
        // write your code in Java SE 8
		
		// results[x][0] will be the number, results[x][1] will be repitition count
		int results[][];
		int currPos = -1;
		
		HashMap hm = new HashMap();
		
		for(int i=0; i<A.length; ++i) {
			int resIdx;
			if( hm.containsKey(A[i]) ) {
				resIdx = (Integer) hm.get(A[i]);
			} else {
				resIdx = ++currPos;
			}
			
			
		}
		
		
		return 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Solution s1 = new Solution();
		int [] arr1 = {1, 4, 3, 3, 1, 2}; 
		System.out.println(s1.solution(arr1));

	}

}
