package 정렬_퀵정렬;

import java.io.*;
import java.util.StringTokenizer;

public class P11004_K번째수구하기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		int[] A=new int[N];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<A.length;i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		quickSort(A,0,N-1,K-1);
		System.out.println(A[K-1]);
		
	}
	public static void quickSort(int[] A,int S,int E,int K) {
		if(S<E) {
			int pivot=partition(A,S,E);
			if(pivot==K) //k번째 수가 pivot이면 바로 return
				return;
			else if(K<pivot) //k가 pivot보다 작으면 왼쪽그룹 정렬수행
				quickSort(A,S,pivot-1,K);
			else //k가 pivot보다 크면 오른쪽그룹 정렬수행
				quickSort(A,pivot+1,E,K);
		}
	}
	public static int partition(int[] A,int S, int E) {
		if(S+1==E) {
			if(A[S]>A[E]) swap(A,S,E);
			return E;
		}
		int M=(S+E)/2;
		swap(A,S,M);//중앙값을 1번째 요소로 이동
		int pivot=A[S];
		int i=S+1,j=E;
		while(i<=j) {
			while(pivot<A[j]&&j>0) {//피벗보다 작은수 나올때까지 j--
				j--;
			}
			while(pivot>A[i]&&i<A.length-1) {//피벗보다 큰수 나올때까지 i++
				i++;
			}
			if(i<=j) {
				swap(A,i++,j--);
			}
		}
		//i==j 피벗의 값을 양쪽으로 분리한 가운데에 오게 설정
		A[S]=A[j];
		A[j]=pivot;
		return j;
	}
	public static void swap(int[] A,int i,int j) {
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}

}
