package 자료구조_투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2003_수들의합2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int[] arr=new int[N];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int left=0;
		int sum=0;
		int cnt=0;
		for(int right=0;right<N;right++) {
			
			sum+=arr[right];
			while(sum>M) {
				sum-=arr[left++];
				
			}
			if(sum==M) cnt++; 
		}
		System.out.println(cnt);
		
	}

}
