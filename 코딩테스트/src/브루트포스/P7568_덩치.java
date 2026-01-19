package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P7568_덩치 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int[][] arr=new int[N][2];
		int[] order=new int[N];
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
			order[i]=1;
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) order[i]++;
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(order[i]).append(" ");
		}
		System.out.println(sb);
	}

}
