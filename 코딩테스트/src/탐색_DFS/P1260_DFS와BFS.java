package 탐색_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1260_DFS와BFS {
	static ArrayList<Integer>[] al;
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int V=Integer.parseInt(st.nextToken());
		al=new ArrayList[N+1];
		visited=new boolean[N+1];
		for(int i=1;i<=N;i++) {
			al[i]=new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			al[s].add(e);
			al[e].add(s);
		}
		
		dfs(V);
	}
	
	private static void dfs(int v) {
		if(visited[v]==true) return;
		System.out.print(v+" ");
		visited[v]=true;
		
		for(int i:al[v]) {
			if(visited[i]==false) {
				dfs(i);
			}
				
			
		}
		
	}

}
