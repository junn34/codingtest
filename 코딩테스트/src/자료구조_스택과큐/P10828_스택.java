package 자료구조_스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P10828_스택 {

	public static void main(String[] args)  throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    
	    int N=Integer.parseInt(br.readLine());
	    Stack<Integer> stack=new Stack<>();
	    for(int i=0;i<N;i++){
	      StringTokenizer st=new StringTokenizer(br.readLine());
	      
	      String s=st.nextToken();
	      
	      switch(s){
	        case "push":
	          int pushInt=Integer.parseInt(st.nextToken());
	          stack.push(pushInt);
	          break;
	        case "top":
	          if(stack.isEmpty()) System.out.println(-1);
	          else System.out.println(stack.peek());
	          break;
	        case "pop":
	          if(stack.isEmpty()) System.out.println(-1);  
	          else System.out.println(stack.pop());
	          break;
	        case "size":
	          System.out.println(stack.size());
	          break;
	        case "empty":
	          if(stack.isEmpty()) System.out.println(1);
	          else System.out.println(0);
	          break;
	      }
	    }
	    

	  }

}
