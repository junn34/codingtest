package 탐색_DFS;
import java.util.*;

public class P2023_신기한소수찾기 {
	static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		DFS(2,1);
		DFS(3,1);
		DFS(5,1);
		DFS(7,1);
		
	}

	private static void DFS(int number, int jarisu) {
		// TODO Auto-generated method stub
		if(jarisu==N) {
			if(isPrime(number)) {
				System.out.println(number);
			}
			return;
		}
		for(int i=1;i<10;i++) {
			if(i%2==0) continue;//짝수면 탐색 x
			if(isPrime(number*10+i)) {//소수면 재귀함수로 자릿수 증가
				DFS(number*10+i,jarisu+1);
			}
		}
	}
	static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) 
				return false;
		}
		return true;
	}
	

}
