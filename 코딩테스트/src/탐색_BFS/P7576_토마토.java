package 탐색_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7576_토마토 {
	static int N,M;
	static int[][] map;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static Queue<int[]> q=new LinkedList<>();
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
	
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		int oneCnt=0;
		map=new int[N][M];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				if(map[i][j]==1) {
					oneCnt++;
					q.offer(new int[] {i,j});
				}
			}
		}
		if(oneCnt==M*N) {
			System.out.println(0);
			return;
		}
		bfs(q);
		
		int max=Integer.MIN_VALUE;
	
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]==0) {
					System.out.println(-1);
					return;
				}
				if(max<map[i][j]) max=map[i][j];
			}
		}
		System.out.println(max-1);
	}
	static void bfs(Queue<int[]> q) {
		while(!q.isEmpty()) {
			int[] now=q.poll();
			int cx=now[0];
			int cy=now[1];
			for(int d=0;d<4;d++) {
				int nx=cx+dx[d];
				int ny=cy+dy[d];
				if(nx<0||ny<0||nx>=N||ny>=M) continue;
				if(map[nx][ny]!=0) continue;
				map[nx][ny]=map[cx][cy]+1;
				q.offer(new int[] {nx,ny});
			}
		}
	}
}
