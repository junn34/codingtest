package 탐색_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class P2667_단지번호붙이기 {
	static int N;
	static boolean[][] visited;
	static int map[][];
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		map=new int[N][N];
		visited=new boolean[N][N];
		for(int i=0;i<N;i++) {
			String s=br.readLine();
			for(int j=0;j<N;j++) {
				map[i][j]=s.charAt(j)-'0';
			}
		}
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]==1&&!visited[i][j]) al.add(bfs(i,j));
			}
		}
		System.out.println(al.size());
		Collections.sort(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
	private static int bfs(int i,int j) {
		int cnt=1;
		Queue<int[]> q=new LinkedList<>();
		q.add(new int[] {i,j});
		visited[i][j]=true;
		while(!q.isEmpty()) {
			
			int now[]=q.poll();
			int cx=now[0];
			int cy=now[1];
			for(int d=0;d<4;d++) {
				int nx=cx+dx[d];
				int ny=cy+dy[d];
				if(nx<0||ny<0||nx>=N||ny>=N) continue;
				if(visited[nx][ny]) continue;
				if(map[nx][ny]==0) continue;
				q.add(new int[] {nx,ny});
				visited[nx][ny]=true;
				cnt++;
			}
		}
		return cnt;
	}

}
