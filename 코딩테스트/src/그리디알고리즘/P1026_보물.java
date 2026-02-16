package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1026_보물 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		int N=Integer.parseInt(br.readLine());
		
		Integer[] A=new Integer[N];
		Integer[] B=new Integer[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			B[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A,(a,b)->{
			return b-a;
		});
		int sum=0;
		Arrays.sort(B,(a,b)->{
			return a-b;
		});
		for(int i=0;i<N;i++) {
			sum+=A[i]*B[i];
		}
		System.out.println(sum);
	}

}
