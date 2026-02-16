package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16953_AB {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int cnt=0;
		while(B>A) {
			String str=String.valueOf(B);
			if(str.charAt(str.length()-1)=='1') {
				str=str.substring(0,str.length()-1);
				B=Integer.parseInt(str);
				
			}
			else B/=2;
			
			cnt++;
		}
		if(B==A) System.out.println(cnt+1);
		else System.out.println(-1);
		
	}

}
