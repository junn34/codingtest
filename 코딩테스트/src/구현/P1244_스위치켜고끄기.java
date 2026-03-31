package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1244_스위치켜고끄기 {
	static int[] arr;
	static int N;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		arr=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int student=Integer.parseInt(br.readLine());
		for(int i=0;i<student;i++) {
			st=new StringTokenizer(br.readLine());
			int sex=Integer.parseInt(st.nextToken());
			int num=Integer.parseInt(st.nextToken());
			changeState(sex,num);
		}
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
			if((i+1)%20==0) System.out.println();
		}
		
	}
	static void changeState(int sex, int num) {
		
		if(sex==1) {
			int idx=num-1;
			while(idx<N) {
				if(arr[idx]==0) arr[idx]=1;
				else arr[idx]=0;
				idx+=num;
			}
		}
		
		else {
			int idx=num-1;
			int left=idx-1;
			int right=idx+1;
			while(left>=0&&right<N) {
				if(arr[left]==arr[right]) {
					left--;
					right++;
				}
				else {
					
					break;
				}
			}
			for(int i=left+1;i<=right-1;i++) {
				if(arr[i]==0) arr[i]=1;
				else arr[i]=0;
			}
		}
	}

}
