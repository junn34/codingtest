package 탐색_DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1182_부분수열의합 {
	static int N,S;
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken());
		arr=new int[N+1];
		visited=new boolean[N+1];
		st= new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
	}
	private static void dfs(int[] arr) {
		
		
	}

}
