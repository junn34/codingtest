package 자료구조_투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P2531_회전초밥 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int start=0;
		int end=start+k-1;
		
		int max=0;
		while(start<=arr.length-1) {
			HashSet<Integer> set=new HashSet<>();
			if(end>arr.length-1) {
				int overend=end-arr.length;
				for(int i=start;i<=arr.length-1;i++) {
					set.add(arr[i]);
					set.add(c);
				}
				for(int i=0;i<=overend;i++) {
					set.add(arr[i]);
				}
			}
			else {
				for(int i=start;i<=end;i++) {
					set.add(arr[i]);
					set.add(c);
				}
			}
			
			
			if(max<set.size()) max=set.size();
			start++;
			
		}
		System.out.println(max);
	}

}
