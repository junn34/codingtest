package 자료구조_구간합;
import java.io.*;
import java.util.*;
public class 구간합구하기2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int A[][]=new int[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(br.readLine());
			for (int j=1;j<=N;j++) {
				A[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int D[][]=new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			
			for (int j=1;j<=N;j++) {
				D[i][j]=D[i][j-1]+D[i-1][j]-D[i-1][j-1]+A[i][j];
			}
		}
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			int result=D[x2][y2]-D[x1-1][y2]-D[x2][y1-1]+D[x1-1][y1-1];
			System.out.println(result);
		}
		
	}

}
