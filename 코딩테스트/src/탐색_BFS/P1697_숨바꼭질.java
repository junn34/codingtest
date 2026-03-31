package 탐색_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1697_숨바꼭질 {
	static int N,K;
	static int answer=N;
	static int cnt=0;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		bfs(N);
		System.out.println(cnt);
	}

	static void bfs(int n) {
		cnt++;
		if(n==K) return;
		
		bfs(n-1);
		bfs(n+1);
		bfs(2*n);
	}
}
