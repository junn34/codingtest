package 브루트포스;

import java.util.Arrays;
import java.util.Scanner;

public class P2309_일곱난쟁이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int[] arr=new int[9];
		for(int i=0;i<9;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		int ans1=0;
		int ans2=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				int cur=arr[i]+arr[j];
				if(sum-cur==100) {
					ans1=i;
					ans2=j;
					break;
				}
			}
			if(sum==100) break;
		}
		for(int i=0;i<9;i++) {
			if(i==ans1||i==ans2) continue;
			System.out.println(arr[i]);
		}
		
		
	}

}
