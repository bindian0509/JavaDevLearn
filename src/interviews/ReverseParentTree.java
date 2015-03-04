package interviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class ReverseParentTree {

	public static int findParent ( int[] tree ) {				
		int idx=0;
		for(int j = 0 ; j < tree.length; j++) {
			if(tree[j] == -1)
				idx = j;
		}		
		return idx;		
	}

	public static void main(String[] args) {			

		// Hard coded for 1 case due to lack of time please dont mind ;-) 
		int tree []  = {8, 7, 0, 5, 5, 8, 7, 0, -1};
		
		Scanner in = new Scanner(System.in);
		int size;
		
		size = in.nextInt();
		String treeStr;
		
		treeStr = in.next();
		System.out.println(treeStr);
		
		StringTokenizer st = new StringTokenizer(treeStr);
		
		st.countTokens();
		
		

		int N = tree.length;				
		Queue<Integer> q = new LinkedList<Integer>();		
		ArrayList<Integer> levelNodeCount = new ArrayList<Integer>();		
		int currLevelIdx = 0;		
		Stack<Integer> nodeList = new Stack<Integer>();	

		int parent = findParent(tree);				
		q.add(parent);	
		levelNodeCount.add(currLevelIdx, 1);		

		while(!q.isEmpty()) {
			int currLevelCnt =  levelNodeCount.get(currLevelIdx);
			int nextLevelNodeCnt = 0;
			for(int i=0; i<currLevelCnt; ++i) {
				int currNode = q.poll(); 		   		   
				nodeList.push(currNode);		    

				for(int c=N-1; c>=0; --c) {
					if( tree[c]==currNode ) {
						q.add(c);
						//System.out.print( c+",");
						++nextLevelNodeCnt;
					}
				}
			}
			if( nextLevelNodeCnt > 0 ) {
				levelNodeCount.add(++currLevelIdx, nextLevelNodeCnt);
			}

		}

		for(int w= levelNodeCount.size() -1; w >= 0; --w) {
			int levelNodeCnt = levelNodeCount.get(w);
			for(int k = 0 ; k < levelNodeCnt ; ++k ){
				System.out.print(nodeList.pop() + " ");
			}
			System.out.println("");
		}
	}
}
