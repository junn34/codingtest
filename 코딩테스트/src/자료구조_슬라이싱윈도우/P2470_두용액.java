package 자료구조_슬라이싱윈도우;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2470_두용액 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int[] arr=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int left=0;
		int right=N-1;
		
		int min=Integer.MAX_VALUE;
		int ans1=0;
		int ans2=0;
		
		while(left<right) {
			int sum=arr[left]+arr[right];
			int cur=Math.abs(sum);
			if(cur<min) {
				min=cur;
				ans1=arr[left];
				ans2=arr[right];
				if(min==0) break;
			}
			
			if(sum<0) left++;
			else right--;
			
		}
		System.out.println(ans1+" "+ans2);
	}

}
