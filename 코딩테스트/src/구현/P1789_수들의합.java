package 구현;

import java.util.Scanner;

public class P1789_수들의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		long N=sc.nextLong();
		sc.nextLine();
		int sum=0;
		int cnt=0;
		while(sum<=N) {
			cnt++;
			sum+=cnt;
		}
		System.out.println(cnt-1); 
	}

}
