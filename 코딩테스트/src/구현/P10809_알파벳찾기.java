package 구현;

import java.util.Scanner;

public class P10809_알파벳찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int[] alphabet=new int[26];
		
		for(int i=0;i<26;i++) {
			alphabet[i]=-1;
		}
		for(int i=0;i<str.length();i++) {
			if(alphabet[str.charAt(i)-'a']==-1) alphabet[str.charAt(i)-'a']=i;
			
			
		}
		for(int i=0;i<26;i++) {
			System.out.printf("%d ",alphabet[i]);
		}
	}

}
