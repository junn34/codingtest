package 자료구조_슬라이싱윈도우;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2473_세용액 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int ans1=0;
		int ans2=0;
		int ans3=0;
		long min=Long.MAX_VALUE;
		for(int now=0;now<N-2;now++) {
			
			int left=now+1;
			int right=N-1;
			while(left<right) {
				long cur= (long) arr[now]+arr[left]+arr[right];
				long sum=Math.abs(cur);
				if(sum==0) {
					ans1=arr[now];
					ans2=arr[left];
					ans3=arr[right];
					System.out.println(ans1+" "+ans2+" "+ans3);
					return;
				}
				if(min>sum) {
					min=sum;
					ans1=arr[now];
					ans2=arr[left];
					ans3=arr[right];
				}
				if(cur<0) left++;
				else if(cur>0) right--;
				
				
			}
			
		}
		System.out.println(ans1+" "+ans2+" "+ans3);
	}

}
