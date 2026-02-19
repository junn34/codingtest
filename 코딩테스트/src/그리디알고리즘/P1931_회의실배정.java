package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1931_회의실배정 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[][] arr=new int[N][2];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());	
		}
		Arrays.sort(arr,(a,b)->{
			if(a[1]==b[1]) return a[0]-b[0];
			return a[1]-b[1];
		});
		int cnt=0;
		int endtime=0;
		for(int i=0;i<N;i++) {
			if(arr[i][0]>=endtime) {
				endtime=arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
