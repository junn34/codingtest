package 동적프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1003_피보나치함수 {
	static int[] zero;
	static int[] one;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		zero=new int[41];
		one=new int[41];
		int T=Integer.parseInt(br.readLine());
		zero[0]=1; one[0]=0;
		zero[1]=0;one[1]=1;
		fibonacci();
		for(int i=0;i<T;i++) {
			
			int k=Integer.parseInt(br.readLine());
			System.out.println(zero[k]+" "+one[k]);
			
		}
	}
	static void fibonacci() {
		for(int i=2;i<=40;i++) {
			zero[i]=zero[i-1]+zero[i-2];
			one[i]=one[i-1]+one[i-2];
		}
	}
}
