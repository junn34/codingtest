package 자료구조_투포인터;

import java.io.BufferedReader;
import java.util.*;
import java.io.*;

public class P1940_주몽 {

	public static void main(String[] args) throws IOException {
		//2개의 고유 번호 합쳐 m이되면 갑옷 만들어짐. n개 재료와 M이 주어질때 몇개 갑옷이 만들어지나? 2개의 재료써서 1개 갑옷만듦.
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		int[] A=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int count =0;
		int i=0;
		int j=N-1;
		while(i<j) { //투 포인터 이동 원칙에 따라 포인터 이동 처리
			if(A[i]+A[j]<M) {
				i++;//작은 번호 재료를 한칸위로 변경
			}
			else if(A[i]+A[j]>M) {//큰 번호 재료를 한칸 아래로 변경
				j--;
			}else {//경우의 수 증가, 양쪽 idx 변경
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
		br.close();
	}

}
