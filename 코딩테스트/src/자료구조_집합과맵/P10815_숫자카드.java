package 자료구조_집합과맵;

import java.io.*;
import java.util.*;
public class P10815_숫자카드 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<N;i++) {
			int key=Integer.parseInt(st.nextToken());
			map.put(key,map.getOrDefault(key,0)+1);
			
		}
		
		int M=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int j=0;j<M;j++) {
			int key=Integer.parseInt(st.nextToken());
			if(map.containsKey(key)) {
				sb.append("1").append(" ");
			}
			else {
				sb.append("0").append(" ");
			}
		}
		System.out.println(sb);
	}

}
