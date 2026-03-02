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
	
		char[][] board=new char[R][C];
		int[][] bombtime=new int[R][C];
		for(int i=0;i<R;i++) {
			String s=br.readLine();
			for(int j=0;j<C;j++) {
				board[i][j]=s.charAt(j);
				if(board[i][j]=='O') bombtime[i][j]=3;
			}
		}
		int time=1;
		
		int[] dx= {-1,1,0,0};
		int[] dy= {0,0,-1,1};
		while(time++<N) {
			if(time%2==0) {
				for(int i=0;i<R;i++) {
					for(int j=0;j<C;j++) {
						if(board[i][j]=='.') {
							bombtime[i][j]=time+3;
							board[i][j]='O';
						}
					}
				}
			}
			else {
				for(int i=0;i<R;i++) {
					for(int j=0;j<C;j++) {
						if(bombtime[i][j]==time) {
							bombtime[i][j]=0;
							board[i][j]='.';
							for(int d=0;d<4;d++) {
								int nx=i+dx[d];
								int ny=j+dy[d];
								if(nx>=0&&ny>=0&&nx<R&&ny<C&&bombtime[nx][ny]!=time) {
									board[nx][ny]='.';
									bombtime[nx][ny]=0;
								}
								
							}
						}
					}
				}
			}
		}
		
		for(int i=0;i<R;i++) {
			System.out.println(board[i]);
		}
		
		
		
		
		
	}
	
}
