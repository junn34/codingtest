package 자료구조_구간합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class 구간합 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int suNo=Integer.parseInt(stringTokenizer.nextToken());
		int quizNo=Integer.parseInt(stringTokenizer.nextToken());
		long[] S= new long[suNo +1];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for(int i=1;i<=suNo;i++) {
			S[i]=S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		for(int q=0;q<quizNo;q++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i=Integer.parseInt(stringTokenizer.nextToken());
			int j=Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j]-S[i-1]);
		}
		
		
	}

}
