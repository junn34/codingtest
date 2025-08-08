package 탐색_BFS;

import java.util.*;
import java.io.*;
public class P1260_DFS와BFS {
	static boolean[] visited;
	  static ArrayList<Integer>[] al;
	public static void main(String[] args)  throws IOException{
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  StringTokenizer st=new StringTokenizer(br.readLine());
		  int N=Integer.parseInt(st.nextToken());
		  int M=Integer.parseInt(st.nextToken());
		  int V=Integer.parseInt(st.nextToken());
		  visited=new boolean[N+1];
		  al=new ArrayList[N+1];
		  for(int i=1;i<N+1;i++){
		    al[i]=new ArrayList<>();
		  }
		  for(int i=0;i<M;i++){
		    st=new StringTokenizer(br.readLine());
		    int s=Integer.parseInt(st.nextToken());
		    int e=Integer.parseInt(st.nextToken());
		    al[s].add(e);
		    al[e].add(s);
		  }
		   for (int i = 1; i <= N; i++) {
		      Collections.sort(al[i]);
		    }
		  DFS(V);
		  System.out.println();
		  visited=new boolean[N+1];
		  BFS(V);

		  }
		  public static void DFS(int t){

		    System.out.print(t+" ");
		    visited[t]=true;
		    for(int i:al[t]){
		      if(!visited[i])
		        DFS(i);
		    }
		  }
		  public static void BFS(int t){
		    Queue<Integer> queue=new LinkedList<Integer>();
		    visited[t]=true;
		    queue.add(t);
		    while(!queue.isEmpty()){
		      int n=queue.poll();
		      System.out.print(n+" ");
		      for(int i:al[n]){
		        if(!visited[i]){
		          visited[i]=true;
		          queue.add(i);
		        }
		        
		      }
		    }
		  }
	

}
