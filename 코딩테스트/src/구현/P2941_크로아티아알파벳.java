package 구현;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2941_크로아티아알파벳 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0;i<arr.length;i++) {
			s=s.replace(arr[i], "A");
		}
		System.out.println(s.length());
	}
}
