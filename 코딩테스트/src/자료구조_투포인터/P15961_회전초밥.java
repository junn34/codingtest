package 자료구조_투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15961_회전초밥 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int[] cnt=new int[d+1];
		int distinct=0;//구별되는 접시 수
		//초기 윈도우 세팅
		for(int i=0;i<k;i++) {
			if(cnt[arr[i]]==0) distinct++;
			cnt[arr[i]]++;
		}
		int max=distinct+(cnt[c]==0?1:0);
		//윈도우 진행
		int left=0;
		
		
		for(int start=1;start<N;start++) {
			
			cnt[arr[left]]--;
			if(cnt[arr[left]]==0) distinct--;
			left++;
			
			if(cnt[arr[(start+k-1)%N]]==0) distinct++;
			cnt[arr[(start+k-1)%N]]++;
			
			int cur=distinct+(cnt[c]==0?1:0);
			if(max<cur) max=cur;
		}
		System.out.println(max);
		
		
	}

}
