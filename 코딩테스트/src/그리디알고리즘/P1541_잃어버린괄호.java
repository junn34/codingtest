package 그리디알고리즘;

import java.util.Scanner;

public class P1541_잃어버린괄호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String[] str=str1.split("-");
		int sum=0;
		for(int i=0;i<str.length;i++) {
			int temp=0;
			if(str[i].contains("+")) {
				String[] str2=str[i].split("\\+");
				for(String s:str2) temp+=Integer.parseInt(s);
			}
			else temp+=Integer.parseInt(str[i]); 
				
			if(i==0) sum+=temp;
			else sum-=temp;
			
			
		}
		System.out.println(sum);
		
		
	}

}
