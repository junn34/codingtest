package 구현;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class P1181_단어정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine(); 
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<N;i++) {
			set.add(sc.nextLine());
		}
		List<String> list=new ArrayList<>(set);
		Collections.sort(list,(a,b)->{
			if(a.length()==b.length()) return a.compareTo(b);
			return a.length()-b.length();
		});
		
		for(String s:list) {
			System.out.println(s);
		}
		
	}

}
