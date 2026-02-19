package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2212_센서 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int K=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int max=0;
		int idx=0;
		
		for(int i=0;i<N-1;i++) {
			int gap=arr[i+1]-arr[i];
			if(max<gap) {
				max=gap;
				idx=i;
			}
		}
		sum=(arr[idx]-arr[idx-1])
		System.out.println(N-max);
		
		
	}

}
