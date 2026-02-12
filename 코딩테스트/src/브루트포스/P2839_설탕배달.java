package 브루트포스;

import java.util.Scanner;

public class P2839_설탕배달 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int cnt=0;
		if(N<=5) {
			if(N/3==0) cnt++;
			else if(N/5==0) cnt++;
			else System.out.println(-1);
		}
		else {
			
			int fiveCnt=N/5;
			if(fiveCnt%3==0) fiveCnt++;
			int threeCnt=N/3;
			cnt=Math.min(fiveCnt,threeCnt);
			
		}
		
		
		
		else System.out.println(-1);
		
		
	}

}
