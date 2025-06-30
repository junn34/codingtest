package 정렬_기수정렬;

import java.io.*;
import java.util.Queue;
import java.util.Scanner;

public class P10989_수정렬하기3 {
	public static int[] A;
	public static long result;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int N= Integer.parseInt(br.readLine());
		A=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=Integer.parseInt(br.readLine());
		}
		br.close();
		Radix_Sort(A,5);
		for(int i=0;i<N;i++) {
			bw.write(A[i]+"\n");
		}
		bw.flush();
		bw.close();

	}
	private static void Radix_Sort(int[] A, int max_size) {
		// TODO Auto-generated method stub
		int[] output=new int[A.length];
		int jarisu=1;
		int count=0;
		while(count != max_size)//최대자리숫만큼 반복
		{
			int[] bucket = new int[10];
			for(int i=0;i<A.length;i++) {
				bucket[(A[i]/jarisu)%10]++;//일의 자리부터
			}
			for(int i=1;i<10;i++) { //합배열
				bucket[i]+=bucket[i-1];
			}
			for(int i=A.length-1;i>=0;i--) {
				output[bucket[(A[i]/jarisu%10)]-1]=A[i];
				bucket[(A[i]/jarisu)%10]--; //다음 자릿수 이동하기 위해 현재 자릿수 기준 정렬 데이터 저장
			}
			for(int i=0;i<A.length;i++) {
				A[i]=output[i];
			}
			jarisu=jarisu*10;//자릿수 증가
			count++;
		}
	}

}
