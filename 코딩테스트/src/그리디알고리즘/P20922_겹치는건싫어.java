package 그리디알고리즘;

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
		int[] arr=new int[N];
		int max=0;
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(max<arr[i]) max=arr[i];
		}
		int[] cnt=new int[max+1];
		int maxlen=0;
		int left=0;
		for(int right=0;right<N;right++) {
			cnt[arr[right]]++;
			while(cnt[arr[right]]>K) {
				cnt[arr[left]]--;
				left++;
				
			}
			maxlen=Math.max(maxlen, right-left+1);
		}
		System.out.println(maxlen);
		
	}

}
