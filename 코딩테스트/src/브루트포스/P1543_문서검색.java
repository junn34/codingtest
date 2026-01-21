package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1543_문서검색 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String document=br.readLine();
		String word=br.readLine();
		int idx=0;
		int cnt=0;
		
		while(true) {
			int pos=document.indexOf(word,idx);
			
			if(pos==-1) break;
			cnt++;
			idx=pos+word.length();
		}
		System.out.println(cnt);
	}

}
