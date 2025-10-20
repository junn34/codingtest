package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P24511_queuestack {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine());
		int[] isQueue=new int[N];
		int[] input=new int[N];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			isQueue[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			input[i]=Integer.parseInt(st.nextToken());
		}
		
		int M=Integer.parseInt(br.readLine());
		int[] insert=new int[M];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			insert[i]=Integer.parseInt(st.nextToken());
		}
		
		Deque<Integer> deque=new ArrayDeque<>();
		
		for(int i=0;i<N;i++) {
			if(isQueue[i]==0) deque.addFirst(input[i]);
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<M;i++) {
			sb.append(deque.pollFirst()+" ");
			deque.addLast(insert[i]);
		}
		
		System.out.println(sb);
	}
}
