package 탐색_BFS;

import java.util.*;

public class P1167_트리지름구하기 {
	
	static boolean[] visited;
	static int[] distance;
	static ArrayList<Edge>[] A;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		A=new ArrayList[N+1];
		for(int i=1;i<=N;i++) {
			A[i]=new ArrayList<Edge>();
		}
		for(int i=0;i<N;i++) {
			int S=sc.nextInt();
			while(true){
				int E=sc.nextInt();
				if(E==-1) break;
				int V=sc.nextInt();
				A[S].add(new Edge(E,V));
			}
		}
		distance=new int[N+1];
		visited=new boolean[N+1];
		BFS(1);
		int Max =1;
		for(int i=2;i<=N;i++) {
			if(distance[Max]<distance[i])
				Max=i;
		}
	}
	private static void BFS(ArrayList<Integer>[] a2) {
		// TODO Auto-generated method stub
		
	}

}
