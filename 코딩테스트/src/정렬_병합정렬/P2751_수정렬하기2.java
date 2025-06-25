package 정렬_병합정렬;

import java.io.*;

public class P2751_수정렬하기2 {
	public static int[] A,tmp;
	public static long result;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		A=new int[N+1];
		tmp=new int[N+1];
		for(int i=1;i<=N;i++) {
			A[i]=Integer.parseInt(br.readLine());
		}
		merge_sort(1,N);
		for(int i=1;i<=N;i++) {
			bw.write(A[i]+"\n");
		}
		bw.flush();
		bw.close();

	}
	private static void merge_sort(int s, int e) {
		if(e-s<1) return;
		int m=s+(e-s)/2;//오버플로우 방지 위해서 (s+e)/2를 쓰지않고 이방식으로 씀 외워둬야함.(중간 인덱스 구하기)
		
		merge_sort(s,m);
		merge_sort(m+1,e);
		for(int i=s;i<=e;i++) {
			tmp[i]=A[i];
		}
		int k=s;
		int idx1=s;
		int idx2=m+1;
		while(idx1<=m&&idx2<=e) { //두 그룸 병합하는 로직
			//양쪽 그룹 index가 가리키는 값을 비교해 더 작은 수를 선택해 배열에 저장하고, 선택된 데이터의 index 값을 오른쪽으로 한칸 이동
			//k++ 은 a 배열에 작은값부터 순서대로 넣기 위한것.
			if(tmp[idx1]>tmp[idx2]) {
				A[k]=tmp[idx2];
				k++;
				idx2++;
			}
			else {
				A[k]=tmp[idx1];
				k++;
				idx1++;
			}
		}
		while(idx1<=m){//한쪽 그룹이 모두 선택된 후 남은 값 정리
			A[k]=tmp[idx1];
			k++;
			idx1++;
		}
		while(idx2<=e){
			A[k]=tmp[idx2];
			k++;
			idx2++;
		}
	}

}
