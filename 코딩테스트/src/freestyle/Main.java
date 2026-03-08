package freestyle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
	
		int K=sc.nextInt();
		int[][] map=new int[N][N];
		
		//아래 왼쪽 위 오른쪽
		int[] dx= {1,0,-1,0};
		int[] dy= {0,-1,0,1};
		
		int d=0,x=0,y=0;
		int val=N*N;
		map[0][0]=val;
		int findX=0;
		int findY=0;
		for(val=N*N-1;val>=1;val--) {
			int nx=x+dx[d];
			int ny=y+dy[d];
			if(nx<0||ny<0||nx>=N||ny>=N||map[nx][ny]!=0) {
				d=(d+1)%4;
				nx=x+dx[d];
				ny=y+dy[d];
			}
			x=nx;
			y=ny;
			map[x][y]=val;
			if(val==K) {
				findX=x;
				findY=y;
			}
			
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(map[i][j]).append(' ');
			}
			sb.append('\n');
		}
		sb.append(findX+1).append(' ').append(findY+1);
		System.out.println(sb);
		
	}

}
