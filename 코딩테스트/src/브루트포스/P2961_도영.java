package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P2961_도영 {
	static int N,answer=Integer.MAX_VALUE;
	static int[][] ingredient;
	static boolean[] selected;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		ingredient=new int[N][2];
		selected=new boolean[N];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			ingredient[i][0]=Integer.parseInt(st.nextToken());
			ingredient[i][1]=Integer.parseInt(st.nextToken());
		}
		
	}
	static void solve(int depth, int sour, int bitter,int selectedCount) {
		if(depth==N) {
			if(selectedCount !=0) {
				if(Math.abs(sour-bitter)<answer) {
					answer=Math.abs(sour-bitter);
				}
			}
			return;
		}
		solve(depth+1,sour*ingredient[depth][0],bitter+ingredient[depth][1],selectedCount+1);
		solve(depth+1,sour,bitter,selectedCount);
	}

}
