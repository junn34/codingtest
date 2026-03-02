package 그리디알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class P2847_게임을만든동준이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[N-1];
		int ans=0;
		for(int i=N-2;i>=0;i--) {
			if(arr[i] <min) min=arr[i];
			else if(arr[i]==min) {
				min-=1;
				ans++;
				
			}
			else {
				min-=1;
				ans+=arr[i]-min;
				
			}
			
		}
		System.out.println(ans);
	}

}
