package 정렬_선택정렬;

import java.io.*;
import java.util.Scanner;

public class P1427_내림차순정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int[] A=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			A[i]=Integer.parseInt(s.substring(i,i+1));
		}
		
		for(int i=0;i<s.length();i++) {
			int max=i;
			for(int j=i+1;j<s.length();j++) {
				if(A[j]>A[max])
					max=j;
			}
			if(A[i]<A[max]) {
				int temp=A[i];
				A[i]=A[max];
				A[max]=temp;
			}
		}
		for(int i=0;i<s.length();i++) {
			System.out.print(A[i]);
		}
		sc.close();
	}

}
