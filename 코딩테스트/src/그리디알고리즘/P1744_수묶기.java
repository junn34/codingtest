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
		sc.nextLine();
		List<Integer> plus=new ArrayList<>();
		List<Integer> minus=new ArrayList<>();
		int zecoCnt=0;
		int oneCnt=0;
		for(int i=0;i<N;i++) {
			int k=sc.nextInt();
			if(k<0) minus.add(k);
			else if(k==0) zecoCnt++;
			else if(k==1) oneCnt++;
			else plus.add(k);
		}
		Collections.sort(plus,Collections.reverseOrder());
		Collections.sort(minus);
		int sum=0;
		//plus
		for(int i=0;i<plus.size();i+=2) {
			if(i+1<plus.size()) sum+=plus.get(i)*plus.get(i+1);
			else sum+=plus.get(i);
		}
		//minus
		for(int i=0;i<minus.size();i+=2) {
			if(i+1<minus.size()) sum+=minus.get(i)*minus.get(i+1);
			else {
				if(zecoCnt==0) {
					sum+=minus.get(i);
				}
			}
		}
		sum+=oneCnt;
		System.out.println(sum);
	}

}
