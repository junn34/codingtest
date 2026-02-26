package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16918_봄버맨 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st=new StringTokenizer(br.readLine());
		int R=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		char[][] board=new char[R][C];//격자판
		int[][] time=new int[R][C]; //폭발 시간 저장용
		N--;//아무것도안함
		for(int i=0;i<R;i++) { //초기 상태 저장
			String str=br.readLine();
			char[] arr=str.toCharArray();
			for(int j=0;j<C;j++) {
				board[i][j]=arr[j];
				if(board[i][j]=='O') time[i][j]=2;
				
			}
		}
		while(N!=0) {
			for(int i=0;i<R;i++) { //설치 안된 모든칸 폭탄설치
				for(int j=0;j<C;j++) {
					if(board[i][j]=='.') {
						board[i][j]='O';
						time[i][j]=3;
					}
					else time[i][j]--;
				}
			}
			N--;
			for(int i=0;i<R;i++) { //폭발
				for(int j=0;j<C;j++) {
					if(board[i][j]=='O') {
						time[i][j]--;
						if(time[i][j]==0) {
							board[i+1][j]='.';
							time[i+1][j]=0;
							board[i-1][j]='.';
							time[i-1][j]=0;
							board[i][j+1]='.';
							time[i][j+1]=0;
							board[i][j-1]='.';
							time[i][j-1]=0;
						}
					}
					else time[i][j]--;
				}
				
			}
			N--;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(j==C-1) sb.append(board[i][j]).append("\n");
				else sb.append(board[i][j]);
				
			}
		}
		System.out.println(sb);

	}

}
