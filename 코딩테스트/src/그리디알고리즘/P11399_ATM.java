package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399_ATM {

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
		int[] sum=new int[N];
		
		sum[0]=arr[0];
		int realSum=sum[0];
		for(int i=1;i<N;i++) {
			sum[i]=sum[i-1]+arr[i];
			realSum+=sum[i];
		}
		System.out.println(realSum);
		
	}

}
