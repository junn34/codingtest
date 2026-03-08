package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11328_strfry {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			int[] alpha=new int[26];
			st=new StringTokenizer(br.readLine());
			String first=String.valueOf(st.nextToken());
			String second=String.valueOf(st.nextToken());
			for(int j=0;j<first.length();j++) {
				alpha[first.charAt(j)-'a']++;
			}
			for(int j=0;j<second.length();j++) {
				alpha[second.charAt(j)-'a']--; 
			}
			
			String answer="Possible";
			for(int k=0;k<alpha.length;k++) {
				if(alpha[k]!=0) {
					answer="Impossible";
					break;
				}
			}
			
			sb.append(answer).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
