import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P1253_좋다 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		Integer[] arr=new Integer[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr,Collections.reverseOrder());
		int left=0;
		int right=0;
		int cnt=0;
		for(int now=0;now<N;now++) {
			for(int i=now+1;i<N-1;i++) {
				for(int j=i+1;j<N;j++) {
					int cur=arr[i]+arr[j];
					if(cur==arr[now]) {
						cnt++;
						break;
					}
				}
			}
		}
		System.out.println(cnt);
		
		
	}

}
