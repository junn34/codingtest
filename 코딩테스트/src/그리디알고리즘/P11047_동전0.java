package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P11047_동전0 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());// 가치의 합
		
		int[] arr=new int[N]; //동전 가치 배열
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int cnt=0;
	
		for(int i=N-1;i>=0;i--) {
			cnt+=K/arr[i];
			K%=arr[i];
		}
		System.out.println(cnt);
		
		
	}

}
