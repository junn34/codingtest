package 스택과큐;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P17298_오큰수구하기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int[] arr=new int[N];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		//알고리즘
		int[] result=new int[N];
		result[N-1]=-1;
		for(int i=0;i<N-1;i++) {
			ArrayList<Integer> al=new ArrayList<>();
			
			for(int j=i+1;j<N;j++) {
				if(arr[i]<arr[j]) {
					al.add(arr[j]);
					break;
				}
				
			}
			
			if(al.size()==0) result[i]=-1;
			else result[i]=al.get(0);
			
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
			
		}
		
	}

}
