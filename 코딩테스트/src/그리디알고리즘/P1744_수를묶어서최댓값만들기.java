package 그리디알고리즘;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1744_수를묶어서최댓값만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		PriorityQueue<Integer> plusPQ=new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minusPQ=new PriorityQueue<>();
		int oneCnt=0;
		int zeroCnt=0;
		for(int i=0;i<N;i++) {
			int data=sc.nextInt();
			if(data>1) plusPQ.add(data);
			else if(data == 1) oneCnt++;
			else if(data==0) zeroCnt++;
			else minusPQ.add(data);
		}
		int sum=0;
		while(plusPQ.size()>1) {
			int first=plusPQ.remove();
			int second=plusPQ.remove();
			sum=sum+first*second;
		}
		if(!plusPQ.isEmpty()) {
			sum=sum+plusPQ.remove();
		}
		
		while(minusPQ.size()>1) {
			int first=minusPQ.remove();
			int second=minusPQ.remove();
			sum=sum+first*second; 
		}
		if(!minusPQ.isEmpty()) {
			if(zeroCnt==0) {
				sum=sum+minusPQ.remove();
			}
			
		}
		sum=sum+oneCnt;
		System.out.println(sum);
		
		
		
	}

}
