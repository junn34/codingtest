package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1946_신입사원 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<T;i++) {
			
			int N=Integer.parseInt(br.readLine());
			int[][] test=new int[N][2];
			
			for(int j=0;j<N;j++) {
			
				st=new StringTokenizer(br.readLine());
				int paper=Integer.parseInt(st.nextToken());
				int interview=Integer.parseInt(st.nextToken());
				test[j][0]=paper;
				test[j][1]=interview;
				
			}
			if(N==1) {
				sb.append(1).append("\n");
				continue;
			}
			Arrays.sort(test,(a,b)->{
				return a[1]-b[1];
			});
			int cnt=1;
			int min=test[0][0];
			for(int j=1;j<N;j++) {
				if(test[j][0]<min) {
					min=test[j][0];
					cnt++; 	
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
		
	}

}
