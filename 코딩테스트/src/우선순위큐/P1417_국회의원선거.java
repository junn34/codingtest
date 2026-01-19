package 우선순위큐;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class P1417_국회의원선거 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int dasom=Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pr=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=1;i<N;i++) pr.offer(Integer.parseInt(br.readLine()));
		int cnt=0;
		while(!pr.isEmpty()&&dasom<=pr.peek()) {
			pr.offer(pr.poll()-1);
			dasom++;
			cnt++;
		}
		System.out.println(cnt);
		
	}

}
