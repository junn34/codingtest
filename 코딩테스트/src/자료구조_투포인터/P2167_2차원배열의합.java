package 자료구조_투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2167_2차원배열의합 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[][] arr=new int[N][M];
		int[][] sum=new int[N][M];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int K=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				sum[i][j+1]+=sum[i][j];
			}
		}
		
		for(int i=0;i<K;i++) {
			st=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			for(int i=0;)
		}
		
	}

}
