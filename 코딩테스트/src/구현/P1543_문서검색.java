package 구현;

import java.util.Scanner;

public class P1543_문서검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String doc=sc.nextLine();
		sc.nextLine();
		String word=sc.nextLine();
		
		int idx=0;
		int cnt=0;
		while(true) {
			idx=doc.indexOf(word,idx);
			if(idx==-1) break;
			cnt++;
			idx+=word.length();
		}
	}

}
