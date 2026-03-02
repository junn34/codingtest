package 구현;

import java.util.Scanner;

public class P1475_방번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0~9까지 한세트의 숫자가 있음.
		//방번호가 주어졌을 때 필요한 세트의 최솟값
		//9=6
		//for문으로 글자와 맞는 인덱스 칸 +1 다른 숫자면 1초과면,9나 6은 2초과면 세트 초기화하고 cnt++
		
		Scanner sc=new Scanner(System.in);
		String N=sc.nextLine();
		
		int[] board=new int[10];
		for(int i=0;i<N.length();i++) {
			int now=Integer.parseInt(String.valueOf(N.charAt(i));
			if(now==6||now==9) board[6]++;
			else board[now]++;
		} 
		int max=0;
		for(int i=0;i<N.length();i++) {
			if(max<board[i]) {
				if(board[i])
			}
		}
		22666
		칸마다 max 갱신하고 
	}

}
