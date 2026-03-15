package 탐색_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1260_BFSDFS {
	static boolean[] visited;
	static ArrayList<Integer>[] graph;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int V=Integer.parseInt(st.nextToken());
		
		visited=new boolean[N+1];
		graph=new ArrayList[N+1];
		for(int i=1;i<=N;i++) {
			graph[i]=new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int first=Integer.parseInt(st.nextToken());
			int second=Integer.parseInt(st.nextToken());
			
			graph[first].add(second);
			graph[second].add(first);
		}
		for(int i=1;i<=N;i++) {
			Collections.sort(graph[i]);
		}
		
		dfs(V);
		System.out.printf("\n");
		visited=new boolean[N+1];
		bfs(V);
	}
	public static void dfs(int v) {
		visited[v]=true;
		System.out.print(v+" ");
		for(int next:graph[v]) {
			if(!visited[next]) dfs(next);
		}
	}
	public static void bfs(int v) {
		Queue<Integer> q=new LinkedList<>();
		visited[v]=true;
		q.add(v);
		while(!q.isEmpty()) {
			int node=q.poll();
			System.out.print(node+" ");
			for(int next:graph[node]) {
				if(!visited[next]) {
					visited[next]=true;
					q.add(next);
				}
			}
		}
		
	}
}
