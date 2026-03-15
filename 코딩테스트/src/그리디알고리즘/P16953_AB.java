package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16953_AB {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		long A=Long.parseLong(st.nextToken());
		long B=Long.parseLong(st.nextToken());		
		
		
		int ans=1;
		while(B!=A) {
			String s=String.valueOf(B);
			//B가 2로 나누어지지 않거나 끝이 1이 아니면 -1출력
			if(B%2!=0 && s.charAt(s.length()-1)!='1'){
				ans=-1;
				break;
			}
			if(B%2==0) {
				B/=2;
			}else {
				s=s.substring(0,s.length()-1);
				B=Long.parseLong(s);
			}
			ans++;
		}
		System.out.println(ans);
		
	}

}
