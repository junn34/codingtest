package 정렬_버블정렬;

import java.util.Scanner;

public class P2750_수정렬하기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for (int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<N-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			
		}
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
	}

}
