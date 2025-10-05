package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class P2346_풍선터뜨리기 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());

		StringBuilder sb=new StringBuilder();
		
		Deque<Balloon> deque=new ArrayDeque<>();
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			deque.addLast(new Balloon(i,Integer.parseInt(st.nextToken())));
			
		}
		while(!deque.isEmpty()) {
			Balloon getout=deque.removeFirst();
			sb.append(getout.idx+" ");
			if(deque.isEmpty()) break;
			if(getout.val>0) {
				for(int i=0;i<getout.val-1;i++) {
					Balloon removedFirst=deque.removeFirst();
					deque.addLast(removedFirst);
				}
			}
			else{
				for(int i=0;i<Math.abs(getout.val);i++) {
					Balloon removedLast=deque.removeLast();
					deque.addFirst(removedLast);
				}
				
			}
		}
		System.out.println(sb);
	}

}
class Balloon {
	int idx, val;
	public Balloon(int idx, int val) {
		this.idx=idx;
		this.val=val;
	}
}