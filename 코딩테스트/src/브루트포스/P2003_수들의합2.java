package 브루트포스;

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
		int start=0;
		int end=0;
		int cnt=0;
		int sum=arr[0];
		
		while(true) {
			
			
			if(sum<=M) {
				if(sum==M) cnt++;
				if(end==N-1) break;
				sum+=arr[++end];
			}
			else sum-=arr[start++];
		}
		System.out.println(cnt);
		
	}

}
