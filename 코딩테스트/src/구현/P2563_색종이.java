package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2563_색종이 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st;
		int cnt=0;
		boolean[][] board=new boolean[101][101];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			for(int j=x;j<=x+9;j++) {
				for(int k=y;k<=y+9;k++) {
					if(!board[j][k]) {
						board[j][k]=true;
						cnt++; 
					}
					
				}
			}
		}
		System.out.println(cnt);
		
		
	}

}
