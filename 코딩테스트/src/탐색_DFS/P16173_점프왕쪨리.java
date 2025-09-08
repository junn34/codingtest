package 탐색_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16173_점프왕쪨리 {
	
	static int[][] arr;
	static boolean[][] visited;
	static int N;
	static int[] dx= {0,1};
	static int[] dy= {1,0};
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		arr=new int[N][N];
		visited=new boolean[N][N];
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		 if (DFS(0,0)) {
	            System.out.println("HaruHaru");
	        } else {
	            System.out.println("Hing");
	        }
		
		
	}
	public static boolean DFS(int i,int j) {
		if(arr[i][j]==-1) {
			return true;
		}
		
		
		
		for(int k=0;k<2;k++) {
			int x=i+dx[k]*arr[i][j];
			int y=j+dy[k]*arr[i][j];
			
			if(x>N-1||y>N-1||visited[x][y]) continue;
			visited[x][y]=true;
			if(DFS(x,y)) {
				return true;
			}
		}
		return false;
		
		
	
	}

}
