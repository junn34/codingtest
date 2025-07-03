package 탐색_이진탐색;

import java.util.Scanner;

public class P2343_블루레이만들기 {
	static int N,M,start=0,end;
	static int[ ]A;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		A=new int[N];
		
		
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			if(start<A[i]) start=A[i];
			end+=A[i];
		}
		while(start<=end) {
			int mid=(start+end)/2;
			int sum=0;
			int count=0;
			for(int i=0;i<N;i++) {
				if(sum+A[i]>mid) {//현재 블루레이에 저장하기 어려워 새 블루레이로 교체
					count++;	//mid값으로 모든 레슨 저장가능한지 확인
					sum=0;
				}
				sum+=A[i];
			}
			if(sum!=0)//탐색 후 sum이 0이 아니면 블루레이 1개 더 필요하므로 count 증가
				count++;
			if(count>M)
				start=mid+1;
			else end =mid-1;
			
		}
		System.out.println(start);
	}

}
