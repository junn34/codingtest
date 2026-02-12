package 자료구조_집합과맵;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P14425_문자열집합 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		HashSet<String> set=new HashSet<>();
		
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			set.add(str);
		}
		int cnt=0;
		for(int i=0;i<M;i++) {
			String str=br.readLine();
			if(set.contains(str)) cnt++;
		}
		System.out.println(cnt);
	}

}
