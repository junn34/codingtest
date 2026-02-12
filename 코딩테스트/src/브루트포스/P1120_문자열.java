package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1120_문자열 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		String a=st.nextToken();
		String b=st.nextToken();
		int result=Integer.MAX_VALUE;
		
		
		for(int i=0;i<b.length()-a.length();i++) {
			int cnt=0;
			{
				for(int j=0;j<a.length();j++) {
					if(a.charAt(j)!=b.charAt(j)) {
						cnt++;
					}
				}
			}
			result=Math.min(cnt, result);
		}
		System.out.println(result);
		
		
	}
	

}
