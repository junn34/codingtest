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
		
		int[] arr=new int[N];
		
		int[] cnt=new int[d+1];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		//초기 윈도우 생성
		int distinct=0; // 윈도우 내 숫자 개수
		for(int start=0;start<k;start++) {
			if(cnt[arr[start]]==0) distinct++; 
			cnt[arr[start]]++;
		}
		int max=distinct+(cnt[c]==0?1:0);//
		
		for(int start=1;start<N;start++) {
			cnt[arr[start-1]]--;
			if(cnt[arr[start-1]]==0) distinct--;
			
			if(cnt[arr[(start+k-1)%N]]==0) distinct++;
			cnt[arr[(start+k-1)%N]]++;
			
			int cur=distinct+(cnt[c]==0?1:0);
			if(max<cur) max=cur;
		}
		System.out.println(max);
		
		
		
		
		
		
	}

}
