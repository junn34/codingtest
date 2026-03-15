package 탐색_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178_미로탐색 {
	static boolean[][] visited;
	static int[][] map;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static int N,M;
	static int[][] dist;
	public static void main(String[] args) throws Exception{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		map=new int[N][M];
		visited=new boolean[N][M];
		dist=new int[N][M];
		for(int i=0;i<N;i++) {
			String s=br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j]=s.charAt(j)-'0';
			}
		}
		dist[0][0]=1;
		bfs(0,0);
		System.out.println(dist[N-1][M-1]);
		
	}
	static public void bfs(int x,int y) {
		Queue<int[]> q=new LinkedList<>();
		q.add(new int[] {x,y});
		visited[x][y]=true;
		while(!q.isEmpty()) {
			int now[]=q.poll();
			int cx=now[0];
			int cy=now[1];
			for(int d=0;d<4;d++) {
				int nx=cx+dx[d];
				int ny=cy+dy[d];
				if(nx<0||ny<0||nx>=N||ny>=M) continue;
				if(map[nx][ny]==0) continue;
				if(visited[nx][ny]) continue;
				dist[nx][ny]=dist[cx][cy]+1;
				visited[nx][ny]=true;
				q.add(new int[] {nx,ny});
			}
		}
	}
}