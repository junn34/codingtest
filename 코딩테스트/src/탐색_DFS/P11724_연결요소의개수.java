package 탐색_DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724_연결요소의개수 {
	static ArrayList<Integer>[] A;
	static boolean visited[];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		A=new ArrayList[n+1];//1부터 시작함
		visited=new boolean[n+1];
		for(int i=1;i<n+1;i++) {//인접 리스트 초기화하기
			A[i]=new ArrayList<Integer>();//각 요소 빈 리스트([]) 로 초기화됨
		}
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int s= Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			A[s].add(e);//양방향 에지이므로 양쪽에 에지 더하기
			A[e].add(s);
		}
		int count=0;
		for(int i=1;i<n+1;i++) {
			if(!visited[i]) {//방문 안한 노드가 없을때까지 반복
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	private static void DFS(int v) {
		// TODO Auto-generated method stub
		if(visited[v]) return;//상위호출로 복귀
		visited[v]=true;
		for(int i:A[v]) {
			if(visited[i]==false) {//연결 노드중 방문 안핞 노드만 탐색
				DFS(i);
			}
		}
	}

}
