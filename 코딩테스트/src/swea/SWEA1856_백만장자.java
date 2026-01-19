import java.util.*;
import java.io.*;

public class SWEA1856_백만장자 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int T= Integer.parseInt(br.readLine()); // 테스트케이스 

		
		for(int tc=1; tc<=T; tc++) {
			
			int N = Integer.parseInt(br.readLine()); 
			int arr[] = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i=0; i<N; i++) {
				int num = Integer.parseInt(st.nextToken()); // 점수
				arr[i] = num;
			}
			
			
			long profit = 0;
			int max = 0;
			
            // 뒤에서부터 체크11312
			for(int i=N-1; i>=0; i--) {
				int today = arr[i];
				if(max > today) {
					profit += max - today;
				}
				// 최대값 갱신
				else {
					max = today;
				}
			}
			
			sb.append("#" + tc + " " + profit + "\n");

		}
		
		System.out.println(sb);
		
	}
}