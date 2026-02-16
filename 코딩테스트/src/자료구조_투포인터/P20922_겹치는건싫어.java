package 자료구조_투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20922_겹치는건싫어 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		
		int max=0;
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(max<arr[i]) max=arr[i];
		}
		int[] cnt=new int[max+1];
		int maxlen=Integer.MIN_VALUE;
		int left=0;
		int len=0;
		for(int right=0;right<N;right++) {
			cnt[arr[right]]++;
			len=right-left+1;
			while(cnt[arr[right]]>K) {
				
				cnt[arr[left]]--;
				left++;
				
			}
			maxlen=Math.max(maxlen, right-left+1);		}
		System.out.println(maxlen);
		
		
		
	}

}
