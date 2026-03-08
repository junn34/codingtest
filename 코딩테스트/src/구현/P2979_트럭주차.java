package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2979_트럭주차 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());
		int[] time=new int[101];
		for(int i=0;i<3;i++) {
			st=new StringTokenizer(br.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			for(int j=start;j<end;j++) {
				time[j]++;
			}
		}
		for(int i=0;i<time.length;i++) {
			if(time[i]==)
		}
	}	

}
