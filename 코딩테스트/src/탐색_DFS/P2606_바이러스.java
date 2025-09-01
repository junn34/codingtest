package 탐색_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2606_바이러스 {
	static boolean[] visited;
	static ArrayList<Integer>[] al;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine());
		int pair=Integer.parseInt(br.readLine());
		al=new ArrayList[N+1];
		visited=new boolean[N+1];
		for(int i=1;i<=N;i++) {
			al[i]=new ArrayList<>();
		}
		
		for(int i=0;i<pair;i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			
			al[s].add(e);
			al[e].add(s);
		}
		DFS(1);
		int cnt=0;
		for(int i=0;i<visited.length;i++) {
			if(visited[i]) cnt++;
		}

		System.out.println(cnt-1);
		
	}
	public static void DFS(int v) {
		if(visited[v]) return;
		visited[v]=true;
		
		for(int i:al[v]) {
			if(visited[i]==false) {
				DFS(i);
			}
		}
		
	}

}
