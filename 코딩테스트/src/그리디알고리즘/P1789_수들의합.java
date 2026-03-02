package 그리디알고리즘;

import java.util.Scanner;

public class P1789_수들의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		long S=sc.nextLong();
		long sum=0;
		long cnt=0;
		long i=1;
		while(sum<=S) {
			sum+=i;
			cnt++;
			i++;
		}
		cnt--;
		System.out.println(cnt);
	}

}
