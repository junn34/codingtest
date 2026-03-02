package 구현;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P2161_카드1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		Deque<Integer> deque=new ArrayDeque<>();
		for(int i=1;i<=N;i++) {
			deque.offerLast(i);
		}
		StringBuilder sb=new StringBuilder();
		while(!deque.isEmpty()) {
			int p=deque.pollFirst();
			sb.append(String.valueOf(p)).append(" ");
			if(deque.isEmpty()) break;
			int f=deque.pollFirst();
			deque.offerLast(f);
		}
		System.out.println(sb);
	}

}
