package 탐색_DFS;
import java.util.*;
import java.io.*;
public class P13023_친구관계파악하기 {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static boolean arrive;
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		arrive=false;
		A=new ArrayList[N];
		visited=new boolean[N];
		for(int i=0;i<N;i++) {
			A[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<M;i++) {
			
			int s=sc.nextInt();
			int e=sc.nextInt();
			A[s].add(e);
			A[e].add(s);
		}
		for(int i=0;i<N;i++) {
			if(!visited[i]) DFS(i,1);
			if(arrive) break;
		}
		if(arrive) System.out.println(1);
		else System.out.println(0);
		
	}
	private static void DFS(int now,int depth) {
		// TODO Auto-generated method stub
		if(arrive||depth==5) {//depth 5되면 종료
			arrive=true;
			return;
		}
		visited[now]=true;
		for(int i:A[now]) {
			if(!visited[i]) DFS(i,depth+1);
		}
		visited[now]=false;//경로 탐색후 다시 노드 미방분 상태로 되돌림.
	}
	

}
