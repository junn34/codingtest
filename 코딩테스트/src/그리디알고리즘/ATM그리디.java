package 그리디알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class ATM그리디 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] arr=new int[N];
    int[] sum=new int[N];
    
    int total=sum[0];
    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
    }
    
    Arrays.sort(arr);
    sum[0]=arr[0];
    for(int i=1;i<arr.length;i++){
      sum[i]=sum[i-1]+arr[i];
      total+=sum[i];
    }
    System.out.println(total+sum[0]);
	}

}
