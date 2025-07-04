package 자료구조_스택과큐;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298_오큰수구하기 {//top 보다 index에 있는 값이 더크면 pop 연산 실행 후 top에 있던 pop한 인덱스에 오큰수 저장ㄴ 

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] A=new int[n];
		int[] ans=new int[n];
		String[] str=br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			A[i]=Integer.parseInt(str[i]);
		}
		Stack<Integer> myStack= new Stack<>();
		myStack.push(0);//처음엔 항상 스택이 비어있으므로 최초값 push해 초기화
		for(int i=1;i<n;i++) {
			//스택이 비어있지않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
			while(!myStack.isEmpty()&&A[myStack.peek()]<A[i]) {
				ans[myStack.pop()]=A[i];//정답 배열에 오큰수를 현재 수열로 저장
			}
			myStack.push(i);	//신규 데이터 push
		}
		while(!myStack.empty()){
			//반복문 다 돌고 나왔는데 스택이 비어있지않다면 빌 때까지
			ans[myStack.pop()]=-1;
			//스택에 쌓인 index에 1을 넣고
		}
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<n;i++) {
			bw.write(ans[i]+" ");
		}//출력
		bw.write("\n");
		bw.flush();
		
		
	}

}
