package 탐색_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1012_유기농배추 {
	static boolean[][] visited;
	static int M,N,K;
	static int[][] map;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			st=new StringTokenizer(br.readLine());
			M=Integer.parseInt(st.nextToken());
			N=Integer.parseInt(st.nextToken());
			K=Integer.parseInt(st.nextToken());
			map=new int[N][M];
			visited=new boolean[N][M];
			for(int j=0;j<K;j++) {//배추 위치
				st=new StringTokenizer(br.readLine());
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				map[y][x]=1;
			}
			int cnt=0;
			for(int j=0;j<N;j++) {//단지 개수 계산
				for(int k=0;k<M;k++) {
					if(!visited[j][k]&&map[j][k]==1) {
						cnt++;
						bfs(j,k);
					}
				}
			}
			System.out.println(cnt);
		}
	}
	static public void bfs(int x,int y) {
		Queue<int[]> q=new LinkedList<>();
		visited[x][y]=true;
		q.offer(new int[] {x,y});
		while(!q.isEmpty()) {
			int[] now=q.poll();
			int cx=now[0];
			int cy=now[1];
			for(int d=0;d<4;d++) {
				int nx=cx+dx[d];
				int ny=cy+dy[d];
				if(nx<0||ny<0||nx>=N||ny>=M) continue;
				if(map[nx][ny]==0) continue;
				if(visited[nx][ny]) continue;
				visited[nx][ny]=true;
				q.offer(new int[] {nx,ny});
			}
		}
		
	}
}
