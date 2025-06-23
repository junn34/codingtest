package 자료구조_구간합;

import java.util.Scanner;
import java.io.*;
public class 나머지합 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		long[] S=new long[N];
		long[] C=new long[M];
		long answer=0;
		S[0]=sc.nextInt();
		for(int i=1;i<N;i++) {
			S[i]=S[i-1]+sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			int remainder=(int)(S[i]%M);//합 배열의 모든 값에 %연산 수행
			if(remainder==0) answer++;//0~i까지 구간합 자체가 0일때 정답에 덧셈
			C[remainder]++;//나머지와 같은 인덱스 개수 카운팅
		}
		for(int i=0;i<M;i++) {
			if(C[i]>1) {
				answer=answer+(C[i]*(C[i]-1)/2);
			}
		}
		System.out.println(answer);

	}

}
