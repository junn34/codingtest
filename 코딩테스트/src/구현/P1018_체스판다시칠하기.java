package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018_체스판다시칠하기 {
	static int N,M;
	static String[] board;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());//행
		M=Integer.parseInt(st.nextToken());//열
		
		board=new String[N];
		for(int i=0;i<N;i++) {
			board[i]=br.readLine();
		}
		int cnt=Integer.MAX_VALUE;
		for(int i=0;i<=N-8;i++) {
			int resultCnt=0;
			for(int j=0;j<=M-8;j++) {
				resultCnt=findMin(i,j,board);
				if(cnt>resultCnt) cnt=resultCnt;
			}
			
		}
		System.out.println(cnt);
		
	}
	private static int findMin(int startrow,int startcol,String[] board) {
		String[] chessboard = {"WBWBWBWB","BWBWBWBW"};
		int cnt=0;
		for(int i=0;i<8;i++) {
			int row=i+startrow;
			for(int j=0;j<8;j++) {
				int col=j+startcol;
				if(board[row].charAt(col)!=chessboard[i%2].charAt(j)) {
					cnt++;
				}
			}
		}
		return Math.min(cnt, 64-cnt);
		
	}
}
