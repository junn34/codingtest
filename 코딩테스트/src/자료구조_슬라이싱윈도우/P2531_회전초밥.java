package 자료구조_슬라이싱윈도우;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2531_회전초밥 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int[] cnt=new int[d+1];
		
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			int num=Integer.parseInt(br.readLine());
			arr[i]=num;
		}
		int distinct = 0;
		for(int i=0;i<k;i++) {
			if(cnt[arr[i]]==0) distinct++;
			cnt[arr[i]]++;
			
		}
		int max=distinct+(cnt[c]==0?1:0);
		
		for(int start=1;start<N;start++) {
			cnt[arr[start-1]]--;
			if(cnt[arr[start-1]]==0) distinct--;
			
			
			if(cnt[arr[(start+k-1)%N]]==0) distinct++;
			cnt[arr[(start+k-1)%N]]++;
			int cur=distinct+(cnt[c]==0?1:0);
			if(cur>max)max=cur;
		}
		System.out.println(max);

		
		
		
		
		
	}

}
