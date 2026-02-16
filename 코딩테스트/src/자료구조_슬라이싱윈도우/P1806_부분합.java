package 자료구조_슬라이싱윈도우;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1806_부분합 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
	
		int[] arr=new int[N];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int sum=0;
		int left=0;
		int minlen=Integer.MAX_VALUE;
		for(int right=0;right<N;right++) {
			sum+=arr[right];
			while(sum>=S) {
				int len=right-left+1;
				if(len<minlen) minlen=len;
				sum-=arr[left++];
			}
		}
		
		
		System.out.println(minlen!=Integer.MAX_VALUE?minlen:0);
		
		
	}

}
