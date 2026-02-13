package 자료구조_투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1806_부분합 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
	
		int N=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		int[] arr=new int[N];
		int[] ps=new int[N+1];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int start=0;
		int end=0;
		int min=Integer.MAX_VALUE;
		int sum=0;
		int left=0;
		for(int right=0;right<N;right++) {
			sum+=arr[right];
			while(sum>=S) {
				min=Math.min(min,right-left+1);
				sum-=arr[left++];
			}
			
		}
		
		System.out.println(min);
		
	}

}
