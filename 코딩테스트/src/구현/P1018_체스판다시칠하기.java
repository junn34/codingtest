package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018_체스판다시칠하기 {
	static String[] chessboard;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());//행
		int M=Integer.parseInt(st.nextToken());//열
		chessboard=new String[N];
		for(int i=0;i<N;i++) {
			chessboard[i]=br.readLine();
		}
		int count=Integer.MAX_VALUE;
		
		for(int i=0;i<=N-8;i++) {
			for(int j=0;j<=M-8;j++) {
				int resultCnt=findMin(i,j,chessboard);
				if(count>resultCnt) count=resultCnt;
			}
			
		}
		System.out.println(count);
		
	}
	
	public static int findMin(int startrow,int startcol,String[] chessboard) {
		String[] board= {"WBWBWBWB","BWBWBWBW"};
		int cnt=0;
		for(int i=0;i<8;i++) {
			int row=startrow+i;
			for(int j=0;j<8;j++) {
				int col=startcol+j;
				if(chessboard[row].charAt(col)!=board[i%2].charAt(j)) cnt++;
			}
		}
		return Math.min(cnt, 64-cnt);
	}

}
