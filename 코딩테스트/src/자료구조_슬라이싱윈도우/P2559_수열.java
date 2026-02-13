package 자료구조_슬라이싱윈도우;

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
		
		//슬라이싱 윈도우
		int sum=0;
		
		for(int i=0;i<K;i++) {
			sum+=arr[i];
		}
		int max=sum;
		for(int i=K;i<N;i++) {
			sum+=arr[i];
			sum-=arr[i-K];
			max=Math.max(max, sum);
		}
		System.out.println(max);
	}

}
