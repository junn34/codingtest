package 그리디알고리즘;

import java.util.Scanner;

public class P11047_동전개수최솟값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] A=new int[N];
		
		int count=0;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		for(int i=N-1;i>0;i--) {
			if(A[i]>K) continue;
			if(K<=0) break;
			count+=K/A[i];
			K%=A[i];
		}
		System.out.println(count);
	}

}
