package 정렬_버블정렬;

import java.io.*;
import java.util.Arrays;

public class P1377_버블소트1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		mData[] A=new mData[N];
		
		for(int i=0;i<N;i++) {
			A[i]=new mData(Integer.parseInt(br.readLine()),i);
		}
		Arrays.sort(A);
		int max=0;
		for(int i=0;i<N;i++) {
			if(max<A[i].index-i)
				max=A[i].index-i;
		}
		System.out.println(max+1);
	}
	

}
class mData implements Comparable<mData>{
	int value;
	int index;
	public mData(int value,int index) {
		super();
		this.value=value;
		this.index=index;
	}
	@Override
	public int compareTo(mData o) {
		return this.value-o.value;
	}
}
