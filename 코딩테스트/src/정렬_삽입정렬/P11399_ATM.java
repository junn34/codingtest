package 정렬_삽입정렬;

import java.util.Scanner;

public class P11399_ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		int[] S=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		
		for(int i=1;i<N;i++) {//삽입정렬
			int insert_point=i;
			int insert_value=A[i];
			for(int j=i-1;j>=0;j--) {
				if(A[i]<A[j]) {
					insert_point=j+1;
					break;
				}
				if(j==0) insert_point=0;
			}
			for(int j=i;j>insert_point;j--) {
				A[j]=A[j-1];
			}
			A[insert_point]=insert_value;
		 
		}
		S[0]=A[0];
		for(int i=1;i<N;i++) {
			S[i]=S[i-1]+A[i];  //합 배열 구현
		}
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=S[i];
		}
		System.out.println(sum);
	}

}
