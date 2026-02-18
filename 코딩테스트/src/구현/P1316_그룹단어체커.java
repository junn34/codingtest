package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1316_그룹단어체커 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			int[] alphabet=new int[26];
			boolean isSeq=true;
			String str=br.readLine();
			alphabet[str.charAt(0)-'a']=1;
			for(int j=1;j<str.length();j++) {
				char prev=str.charAt(j-1);
				char cur=str.charAt(j);
				
				if(prev==cur) continue;
				
				if(alphabet[cur-'a']>0) {
					isSeq=false;
					break;
				}
				alphabet[cur-'a']=1;
			}
			if(isSeq) cnt++;

		}
		System.out.println(cnt);
	}

}
