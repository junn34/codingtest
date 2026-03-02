package 그리디알고리즘;

import java.util.Scanner;

public class P1343_폴리오미노 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		s=s.replace("XXXX", "AAAA");
		s=s.replace("XX", "BB");
		boolean isX=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='X') {
				isX=true;
				break;
			}
		}
		if(isX) System.out.println(-1);
		else System.out.println(s);
	}

}
