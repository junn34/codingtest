package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1946_신입사원 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine()); //테스트 케이스
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<T;i++) {
			int N=Integer.parseInt(br.readLine());
			int[][] arr=new int[N][2];
			for(int j=0;j<N;j++) {
				st=new StringTokenizer(br.readLine());
				arr[j][0]=Integer.parseInt(st.nextToken());//서류
				arr[j][1]=Integer.parseInt(st.nextToken());//면접
			}
			Arrays.sort(arr,(a,b)->{
				return a[0]-b[0];
			});
			int min=arr[0][1];
			int cnt=1;
			for(int j=1;j<N;j++) {
				if(min>arr[j][1]) {
					cnt++;
					min=arr[j][1];
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
	}

}
