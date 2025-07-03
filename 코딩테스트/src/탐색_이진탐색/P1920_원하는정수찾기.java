package 탐색_이진탐색;

import java.util.Arrays;
import java.util.Scanner;

public class P1920_원하는정수찾기 {
	static int[] A;
	
	static int N,M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		A=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		M=sc.nextInt();

		for(int i=0;i<M;i++) {
			boolean find=false;
			int target=sc.nextInt();
			int start=0;
			int end=A.length-1;
			
			while(start<=end) {
				int mid=(start+end)/2;
				int midV=A[mid];
				if(midV>target) {
					end=mid-1;
				}
				else if(midV<target) {
					start=mid+1;
				}else {
					find=true;
					break;
				}
			}
			if(find) System.out.println(1);
			else System.out.println(0);
		}
		

		
	}
	

}
