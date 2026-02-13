package 자료구조_투포인터;

import java.util.Arrays;
import java.util.Scanner;

public class P1337_올바른배열 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
			
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int left=0;
		int max=0;
		for(int right=0;right<N;right++) {
			while(arr[right]-arr[left]>4) {
				left++;
			}
			max=Math.max(max, right-left+1);
		}
		System.out.println(5-max);
	}

}
