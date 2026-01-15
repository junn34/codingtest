package 자료구조_집합과맵;

import java.util.*;
import java.io.*;
public class P1302_베스트셀러 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		int max=0;
		String answer ="";
		for(int i=0;i<N;i++) {
			String st=br.readLine();
			
			map.put(st, map.getOrDefault(st, 0)+1);
			max=Math.max(max, map.get(st));
		}
		for(String key:map.keySet()) {
			if(map.get(key)==max) {
				if(answer.equals("")||key.compareTo(answer)<0) {
					answer=key;
				}
			}
		}
		System.out.println(answer);
	}
	
}
