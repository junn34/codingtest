package 그리디알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class P2217_로프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		int[] arr=new int[N];
		Arrays.sort(arr);

		int max = 0;

		for(int i = 0; i < N; i++) {
		    int weight = arr[i] * (N - i);
		    max = Math.max(max, weight);
		}

		System.out.println(max);

	}

}
