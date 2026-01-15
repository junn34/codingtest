package 구현;

import java.io.*;
import java.util.*;
public class P1193_분수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int X=sc.nextInt();
		
		int cnt=1;
		
		for(int i=1; ;i++) {
			int j=1;
			if(i%2==0) {
				for(j=1;j<=i;j++) {
					if(cnt==X) {
						System.out.println(j+"/"+(i-j+1));
						break;
					}
					cnt++;
				}
			}
			else {
				for(int j=1;j<=i;j++) {
					if(cnt==X) {
						System.out.println((i-j+1)+"/"+j);
						break;
					}
					cnt++;
				}
			}
			if (j != i + 1) {
			    break;
			}

		}
		
	}
	
	

}
