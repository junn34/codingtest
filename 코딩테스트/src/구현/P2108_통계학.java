package 구현;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class P2108_통계학 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		int[] arr=new int[N];
		int sum=0;
		for(int i=0;i<N;i++) {
			int num=sc.nextInt();
			sum+=num;
			arr[i]=num;
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		
		//산술평균
		double result=(double) sum/N;
		System.out.println(Math.round(result));
		//중앙값
		Arrays.sort(arr);
		System.out.println(arr[N/2]);
		int max=0;
		//최빈값 (여러개있으면 최빈값중 두번째로 작은 값)
		for(int key:map.keySet()) {
			int now=map.get(key);
			if(max<now) max=now;
		}
		List<Integer> list=new ArrayList<>();
		for(int key:map.keySet()) {
			int now=map.get(key);
			if(max==now)  list.add(key);
		}
		Collections.sort(list);
		if(list.size()==1) System.out.println(list.get(0));
		else System.out.println(list.get(1));
		//범위
		if(N==1) System.out.println(0);
		
		else System.out.println(arr[N-1]-arr[0]);
		
	}

}
