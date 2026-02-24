package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14501_퇴사 {
	static int N;
	static int[] T;
	static int[] P;
	static int max=0;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		StringTokenizer st;
		T=new int[N];
		P=new int[N];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			T[i]=Integer.parseInt(st.nextToken());
			P[i]=Integer.parseInt(st.nextToken());
		}
		dfs(0,0);
		System.out.println(max);
	}
	public static void dfs(int day,int sum) {
		
		
		if(day>=N) {
			max=Math.max(max, sum);
			return;
		}
		if(day+T[day]<=N) 
			dfs(day+T[day],sum+P[day]);
		dfs(day+1,sum);
		
		
	}

}
