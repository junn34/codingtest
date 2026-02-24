package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1182_부분수열의합 {
	static int N,S;
	static int[] arr;
	static int cnt=0;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		
		arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int sum=0;
		dfs(0,0);
		if(S==0) cnt--;
		System.out.println(cnt);
	}
	public static void dfs(int depth,int sum) {
		if(depth==N) {
			if(sum==S) cnt++; 
			return;
		}
		dfs(depth+1,sum);
		dfs(depth+1,sum+arr[depth]);
		
		
	}

}
