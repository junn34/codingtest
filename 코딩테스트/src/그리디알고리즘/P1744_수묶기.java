package 그리디알고리즘;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1744_수묶기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		List<Integer> plus=new ArrayList<>();
		List<Integer> minus=new ArrayList<>();
		int zero=0;
		int one=0;
		for(int i=0;i<N;i++) {
			int k=sc.nextInt();
			if(k>1) plus.add(k);
			else if(k==0) zero++;
			else if(k==1) one++;
			else minus.add(k);
 		}
		Collections.sort(minus);
		Collections.sort(plus,Collections.reverseOrder());
		for(int i=0;i<plus.size();i+=2) {
			if(i+1==plus.size()) sum+=plus.get(i);
			else sum+=plus.get(i)*plus.get(i+1);
		}
		for(int i=0;i<minus.size();i+=2) {
			if(i+1==minus.size()) {
				if(zero==0) sum+=minus.get(i);
			}
			else sum+=minus.get(i)*minus.get(i+1);
		}
		sum+=one;
		System.out.println(sum);
		
	}

}
