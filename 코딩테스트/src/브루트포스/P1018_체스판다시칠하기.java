package 브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018_체스판다시칠하기 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		String[] arr=new String[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=br.readLine();
		}
		int cnt=Integer.MAX_VALUE;
		for(int i=0;i<=N-8;i++) {
			for(int j=0;j<=M-8;j++) {
				int resultCount=getMinCost(i,j,arr);
				if(cnt>resultCount) cnt=resultCount;
			}
		}		
		System.out.println(cnt);
	}
	private static int getMinCost(int startrow,int startcol, String[] board) {
		String[] chessboard= {"WBWBWBWB","BWBWBWBW"};
		int whitevercount=0;
		for(int i=0;i<8;i++) {
			int row=startrow+i;
			for(int j=0;j<8;j++) {
				int col=startcol+j;
				
				if(board[row].charAt(col)!=chessboard[i%2].charAt(j)) whitevercount++; 
			}
		}
		return Math.min(64-whitevercount, whitevercount);
	}

}
