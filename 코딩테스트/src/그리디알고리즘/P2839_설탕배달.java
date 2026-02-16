package 그리디알고리즘;

import java.util.Scanner;

public class P2839_설탕배달 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		
		int five = N / 5;

		while (five >= 0) {
		    int rest = N - five * 5;

		    if (rest % 3 == 0) {
		        int three = rest / 3;
		        System.out.println(five + three);
		        return;
		    }

		    five--;
		}

		System.out.println(-1);

	}

}
