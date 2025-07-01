package 탐색_BFS;

import java.util.*;
import java.io.*;
public class P1260_DFS와BFS {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int V=Integer.parseInt(st.nextToken());
		A=new ArrayList[N+1];
		visited=new boolean[N+1];
		for(int i=1;i<N+1;i++) {
			A[i]=new ArrayList<Integer>();
		}
		for(int i=1;i<M+1;i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}

		for(int i=1;i<=N;i++) {
			Collections.sort(A[i]);
		}
		DFS(V);
		System.out.println();
		visited=new boolean[N+1];
		BFS(V);
		System.out.println();
	}
	
	
	private static void BFS(int Node) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(Node);
		visited[Node]=true;
		
		while(!queue.isEmpty()) {
			int now_Node = queue.poll();
			System.out.print(now_Node+" ");
			for(int i:A[now_Node]) {
				visited[i]=true;
				queue.add(i);
			}
		}
	}


	private static void DFS(int Node) {
		System.out.print(Node+" ");
		visited[Node]=true;
		for(int i:A[Node]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
		
	}
	

}
