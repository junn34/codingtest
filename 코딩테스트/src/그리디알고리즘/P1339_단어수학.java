package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1339_단어수학 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		String[] s=new String[N]; 
		int max=0;
		int maxIdx=0;
		for(int i=0;i<N;i++) {
			s[i]=String.valueOf(br.readLine());
			if(max<s[i].length()) {
				max=s[i].length();
				maxIdx=i;
			}
		}
		Arrays.sort(s,(a,b)->{
			return b.length()-a.length();
		});
		int[] alphabet=new int[26];
		int now=9;
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length();j++) {
				//알파벳에 숫자 배정
				int idx=s[i].charAt(j)-'A';
				//알파벳 사용 배열 상태 저장
				//이미 사용중이라면 continue;
				if(alphabet[idx]!=0) continue;
				alphabet[idx]=now;
				now--;
			}
		}
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length();j++) {
				s[i]=s[i].replace(String.valueOf(s[i].charAt(j)),Integer.toString(alphabet[s[i].charAt(j)-'A']));
			}
		}
		
		int sum=0;
		for(int i=0;i<s.length;i++) {
			sum+=Integer.parseInt(s[i]);
		}
		System.out.println(sum);
		
		
		
	}

}
