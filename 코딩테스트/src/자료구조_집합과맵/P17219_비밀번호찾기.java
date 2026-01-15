package 자료구조_집합과맵;

import java.io.*;
import java.util.*;
public class P17219_비밀번호찾기 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		HashMap<String,String> map=new HashMap<String,String>();
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<M;i++) {
			String key=br.readLine();
			sb.append(map.get(key)).append("\n");
		}
		System.out.println(sb);
	}

}
