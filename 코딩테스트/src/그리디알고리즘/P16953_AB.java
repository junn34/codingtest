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
		
		while(B!=A) {
			if(A>B) {
				cnt=-2;
				break;
			}
			
			if(B%2==0) {
				B/=2;
				cnt++;
			}
			else if(B%10==1) {
				String s=String.valueOf(B);
				s=s.substring(0,s.length()-1);
				B=Integer.parseInt(s);
				cnt++;
			}
			else {
				cnt=-2;
				break;
			}
			
		}
		
		System.out.println(cnt+1);
	}

}
