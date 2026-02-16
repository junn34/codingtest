package 자료구조_투포인터;

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
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int left=0;
		int right=N-1;
		int min=Integer.MAX_VALUE;
		
		int ans1=0;
		int ans2=0;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==0) {
				ans1=left;
				ans2=right;
				break;
			}
			if(min>Math.abs(sum)) {
				min=Math.abs(sum);
				ans1=left;
				ans2=right;
			}
			
			if(sum<0) left++;
			else right--;
		}
		System.out.println(arr[ans1]+" "+arr[ans2]);
	}

}
