package 그리디알고리즘;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1715_카드정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		PriorityQueue<Integer> pq=new PriorityQueue<>();//우선순위큐 기본 조건은 작은 숫자가 먼저 remove(추출)됨
		for(int i=0;i<N;i++) {
			int data=sc.nextInt();
			pq.add(data);
		}
		int data1=0;
		int data2=0;
		int sum=0;
		while(pq.size()!=1){
			data1=pq.remove();
			data2=pq.remove();
			sum+=data1+data2;
			pq.add(data1+data2);
		}
		System.out.println(sum);
	}

}
