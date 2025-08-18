package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1541_잃어버린괄호 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split("-");
		int sum=0;
		for(int i=0;i<s.length;i++) {
			int temp=0;
			String[] addition=s[i].split("\\+");
			for(int j=0;j<addition.length;j++) {
				temp+=Integer.parseInt(addition[j]);
			}
			if(i==0) sum=temp;
			else sum-=temp;
		}
		System.out.println(sum);
		
	}

}
