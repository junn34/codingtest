package 자료구조_스택과큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int num=N;
	    Queue<Integer> queue=new LinkedList<>();
	    for(int i=1;i<=N;i++){
	      queue.add(i);
	    }
	    while(queue.size()!=1){
	      queue.poll();
	      int n=queue.poll();
	      queue.add(n);
	    }
	    System.out.println(queue.poll());
	}
	

}
