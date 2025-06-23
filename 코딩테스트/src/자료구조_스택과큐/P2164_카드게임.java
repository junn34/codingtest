package 자료구조_스택과큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Queue<Integer> myQueue=new LinkedList<>();
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) {
			myQueue.add(i);
		}
		while(myQueue.size()>1) {
			myQueue.poll();
			myQueue.add(myQueue.poll());
			
		}
		System.out.println(myQueue.poll());
		sc.close();
	}
	

}
