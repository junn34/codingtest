package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


//해결못함
public class P1158_요세푸스문제 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		StringBuilder sb=new StringBuilder();
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=1;i<=N;i++) {
			
			al.add(i);
		}
		int now=0;
		sb.append('<');
		while(!al.isEmpty()) {
			now=(now+K-1 )% al.size();
			sb.append(al.remove(now));
			if(!al.isEmpty()) sb.append(", ");
			
		}
		
		sb.append('>');
//		sb.deleteCharAt(sb.length()-1);
		
		System.out.println(sb);
	}

}
