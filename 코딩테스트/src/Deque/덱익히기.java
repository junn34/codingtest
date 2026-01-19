package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 덱익히기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> deque = new LinkedList<>();
		int N= Integer.parseInt(br.readLine());
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int num=Integer.parseInt(st.nextToken());
			
				switch (num) {
				case 1:
					deque.offerFirst(Integer.parseInt(st.nextToken()));
					break;
				case 2:
					deque.offerLast(Integer.parseInt(st.nextToken()));
					break;
				case 3:
					if(!deque.isEmpty()) {
						sb.append(deque.pollFirst()
						+"\n");
					}
					else {
						sb.append(-1+"\n");
					}
					break;
				case 4:
					
					if(!deque.isEmpty()) {
						sb.append(deque.pollLast()
						+"\n");
					}
					else {
						sb.append(-1+"\n");
					}
					break;
				case 5:
					sb.append(deque.size()+"\n");
					break;
				case 6:
					if(!deque.isEmpty()) {
						sb.append(0+"\n");	
					}
					else {
						sb.append(1+"\n");
					}
					break;
				case 7:
					if(!deque.isEmpty()) {
						sb.append(deque.peekFirst()+"\n");
					}
					else {
						sb.append(-1+"\n");
					}
					break;
				case 8:
					if(!deque.isEmpty()) {
						sb.append(deque.peekLast()+"\n");
					}
					else {
						sb.append(-1+"\n");
					}
					break;
	
			}
			
		}
	
		System.out.println(sb);
	}

}

