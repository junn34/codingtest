package 브루트포스;

import java.util.Scanner;

public class P1018_체스판다시칠하기 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int row=sc.nextInt();
		int col=sc.nextInt();
		sc.nextLine();
		
		String[] board=new String[row];
		for(int i=0;i<row;i++) {
			board[i]=sc.nextLine();
		}
		//입력한 행 열보다 넘어가면 안됨.(반복은 8개의 행,열 안넘기게 확인하면서 진행)
		int sol=Integer.MAX_VALUE;
		for(int i=0;i<=row-8;i++) {
			for(int j=0;j<=col-8;j++) {
				int curSol=getSolution(i,j,board);
				if(sol>curSol) sol=curSol;
			}
		}
		System.out.println(sol);
		sc.close();
	}
	private static int getSolution(int startRow,int startCol,String[] board) {
		String[] orgBoard= {"WBWBWBWB","BWBWBWBW"};
		int whiteSol=0;
		for(int i=0;i<8;i++) {
			int row=startRow+i;
			for(int j=0;j<8;j++) {
				int col=startCol+i;
				if(board[row].charAt(col)!=orgBoard[row%2].charAt(j)) whiteSol++;
			}
		}//정답 체스판 기준으로 하므로 col이 아닌 j로 charAt
		return Math.min(whiteSol, 64-whiteSol);
	}
}
