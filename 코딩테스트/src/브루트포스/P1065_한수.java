package 브루트포스;

import java.util.Scanner;

public class P1065_한수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
	
		
		int cnt=99;
		if(N<100) System.out.println(N);
		else {
			
			
			for(int i=101;i<=N;i++) {
				int a=i/100;
				int b=(i/10)%10;
				int c=i%10;	
				
				int same1=a-b;
				int same2=b-c;
				
				if(same1==same2) cnt++;
				
			}
			System.out.println(cnt);
		}
		
	}

}
