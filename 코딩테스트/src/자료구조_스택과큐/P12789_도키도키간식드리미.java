package 자료구조_스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P12789_도키도키간식드리미 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		Stack<Integer> stack=new Stack<>();
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int[] arr=new int[N];
		
		int now=1; int quan=N;
		for(int i=0;i<N;i++) {
			int k=Integer.parseInt(st.nextToken());
			stack.push(k);
			while(!stack.isEmpty()&& stack.peek()==now) {
				stack.pop();
				now++;
			}
		}
		if(stack.isEmpty()) System.out.println("Nice");
		else System.out.println("Sad");
		
	}

}
