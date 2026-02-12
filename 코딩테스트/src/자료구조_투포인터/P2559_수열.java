package 자료구조_투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2559_수열 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int[] arr=new int[N];
		
		st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int start=0;
		int end=0;
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<=N-K;i++) {
			start=i;
			end=i+K-1;
			int sum=0;
			for(int j=start;j<=end;j++) {
				sum+=arr[j];
				
			}
			max=Math.max(max, sum);
		}
		System.out.println(max);
	}

}
