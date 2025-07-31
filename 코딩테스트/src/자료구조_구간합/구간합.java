package 자료구조_구간합;

import java.util.*;

public class 구간합 {

	  public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    int N=sc.nextInt();
		    int M=sc.nextInt();
		    int[] arr=new int[N];
		    int[] S=new int[N+1];
		    S[0]=0;
		    for(int i=0;i<N;i++){
		      arr[i]=sc.nextInt();
		    }
		    for(int i=1;i<=N;i++){
		      S[i]=arr[i-1]+S[i-1];
		    }
		    for(int i=0;i<M;i++){
		      int input1=sc.nextInt();
		      int input2=sc.nextInt();
		      System.out.println(S[input2]-S[input1-1]);
		    }
		   }

} 
 