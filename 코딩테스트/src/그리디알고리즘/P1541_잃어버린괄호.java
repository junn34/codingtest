package 그리디알고리즘;

import java.util.Scanner;

public class P1541_잃어버린괄호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split("-");
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			String[] add=arr[i].split("\\+");
			
			for(int j=0;j<add.length;j++) {
				temp+=Integer.parseInt(add[j]);
			}
			if(i==0) {
				sum+=temp;
			}else sum-=temp;
		}
		System.out.println(temp);
	}

}
