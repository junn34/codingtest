package 브루트포스;

import java.util.Scanner;

public class P1436_영화감독숍 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int devilNum=666;
		int cnt=1;
		while(cnt!=N) {
			devilNum++;
			if(String.valueOf(devilNum).contains("666")) cnt++;
		}
		System.out.println(devilNum);
	}

}
