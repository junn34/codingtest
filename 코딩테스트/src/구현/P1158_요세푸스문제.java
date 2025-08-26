package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


//해결못함
public class P1158_요세푸스문제 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue= new LinkedList<>();
		ArrayList<Integer> al=new ArrayList<>();
		int cnt=0;
		int i=1;
		int nope=0;
		while(al.size()!=N) {
			
			queue.add(i);
			queue.poll();
			if(i==N) {
				int min=al.get(0);
				for(int j=1;j<al.size();j++) {
					if(min>al.get(j)) min=al.get(j);
				}
				i=min;
			}
			i++;
			cnt++;
			if(cnt==3) {
				nope=i-1;
				al.add(nope);
				cnt=0;
			}
			
			
		}
	}

}
