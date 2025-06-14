package 슬라이싱윈도우;

import java.io.*;
import java.util.*;
public class P11003_최솟값찾기 {//플래티넘 문제라 그런가 알고리즘 이해가 부족...

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int L=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		int[] winArr=new int[L];
		int[] result=new int[N];
		for(int i=0;i<N;i++) {
			for(int j=i-L+1;j<=i;j++) {
				for(int k=0;k<L;k++) {
					winArr[k]=j;
				}
				
				result[i]=findMin(winArr);
			}
		}
		System.out.println(result);
	}

	
	private static int findMin(int[] a) {
		Arrays.sort(a);
		int min=a[0];
		return min;
	}
}
