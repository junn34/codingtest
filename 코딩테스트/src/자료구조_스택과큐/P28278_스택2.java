package 자료구조_스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P28278_스택2 {

	public static void main(String[] args)throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st=new StringTokenizer(br.readLine());
	      int n=Integer.parseInt(st.nextToken());
	      Stack<Integer> stack = new Stack<>();
	      
	      while(n-->0){
	        
	        st=new StringTokenizer(br.readLine());
	        int a=Integer.parseInt(st.nextToken());
	        switch(a){
	          case 1:
	            stack.push(Integer.parseInt(st.nextToken()));
	            break;
	          case 2: 
	            if(!stack.isEmpty()) System.out.println(stack.pop());
	            else System.out.println(-1);
	            break;
	          case 3:
	            System.out.println(stack.size());
	            break;
	          case 4:
	            if(stack.isEmpty()) System.out.println(1);
	            else System.out.println(0);
	            break;
	          case 5:
	            if(!stack.isEmpty()) System.out.println(stack.peek());
	            else System.out.println(-1);
	            break;
	        }
	      }
	    }

}
