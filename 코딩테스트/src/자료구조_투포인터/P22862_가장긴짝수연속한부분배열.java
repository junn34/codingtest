package 자료구조_투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P22862_가장긴짝수연속한부분배열 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int[] arr=new int[n];
		st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int left=0;
		int oddCnt=0;
		int max=0;
		for(int right=0;right<n;right++) {
			if(arr[right]%2!=0) oddCnt++;
			while(oddCnt>k) {
				if(arr[left]%2!=0) oddCnt--;
				left++;
			}
			
			max=Math.max(max, right-left+1-oddCnt);
		}
		System.out.println(max);
	}

}
