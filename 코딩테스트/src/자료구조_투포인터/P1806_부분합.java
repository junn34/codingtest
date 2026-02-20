package 자료구조_투포인터;

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
		int left=0;
		int minlen=Integer.MAX_VALUE;
		int sum=arr[0];
		int cnt=0;
		for(int right=1;right<N;right++) {
			sum+=arr[right];
			while(sum>=S) {
				cnt++;
				minlen=Math.min(minlen, right-left+1);
				sum-=arr[left++];
			}
		}
		if(cnt==0) System.out.println(0);
		else System.out.println(minlen==Integer.MAX_VALUE?0:minlen);
		
		
		
	}	

}
