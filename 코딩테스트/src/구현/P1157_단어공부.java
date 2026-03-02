package 구현;

import java.util.Scanner;

public class P1157_단어공부 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int[] alphabet=new int[26];
		int max=0;
		int idx=0;
		boolean dup=false;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			c=Character.toLowerCase(c);
			alphabet[c-'a']++;
			
		}
		for(int i=0;i<alphabet.length;i++) {
			if(max<alphabet[i]) {
				max=alphabet[i];
				idx=i;
			}
			else if(max==alphabet[i]) {
				System.out.println("?");
				return;
			}
		}
		System.out.println((char)(idx+'a'));
	}

}
