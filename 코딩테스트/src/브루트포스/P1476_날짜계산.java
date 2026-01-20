package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1476_날짜계산 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int E=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
	
		int cnt=1;
		int startE=1;
		int startS=1;
		int startM=1;
		while(startE!=E||startS!=S||startM!=M) {
			cnt++;
			startE++;
			startS++;
			startM++;
			if(startE==16) startE=1;
			if(startS==29) startS=1;
			if(startM==20) startM=1;
		}
		System.out.println(cnt);
	}
	
}
