package 브루트포스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1251_단어나누기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String first;
		String second;
		String third;
		StringBuilder sb=new StringBuilder();
		
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<str.length()-2;i++) {
			for(int j=i+1;j<str.length()-1;j++) {
				for(int k=j+1;k<str.length();k++) {
					first=str.substring(i,j);
					second=str.substring(j,k);
					third=str.substring(k,str.length());
					changeStr(first);
					changeStr(second);
					changeStr(third);
					sb.append(first).append(second).append(third);
					list.add(String.valueOf(sb));
				
					
				}
			}
		}
		for(int i=0;i<list.size();i++) {
			Collections.sort(list,Collections.reverseOrder());
		}
		System.out.println(list.get(0));
		
	}
	private static void changeStr(String str) {
		char temp;
		for(int i=0;i<str.length()-1;i++) {
			char a=str.charAt(i);
			char b=str.charAt(i);
			temp=a;
			a=b;
			b=temp;
		}
	}

}
