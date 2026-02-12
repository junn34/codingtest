package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24313_점근적표기1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int a1=Integer.parseInt(st.nextToken());
		int a0=Integer.parseInt(st.nextToken());
		
		int c=Integer.parseInt(br.readLine());
		int n0=Integer.parseInt(br.readLine());
		
		int fn=a1*n0+a0;
		if( a1<=c&&a1*n0+a0<=c*n0) System.out.println(1);
		else System.out.println(0);
	}

}
