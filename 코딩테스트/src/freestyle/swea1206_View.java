package freestyle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea1206_View {
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<10;i++) {
			
			int N=Integer.parseInt(br.readLine());
			st=new StringTokenizer(br.readLine());
			arr=new int[N];
			
			int cnt=0;
			
			
			for(int j=0;j<N;i++) {
				arr[j]=Integer.parseInt(st.nextToken());
			}
			int lastNum;
			
			
			for(int k=0;k<arr.length;k++) {
				int max=0;
				int maxIdx;
				int secondMax=0;
				if(arr[k]>max) {//최댓값 찾기
					max=arr[k];
					maxIdx=k;
				}
				for(int q=k-2;q<k+3;q++) {
					
					if(q==k) continue;
					
					if(arr[q]>secondMax) secondMax=arr[q];
					
				}
				cnt+= max-secondMax;
				
				
			}
			
		}
	}

}
