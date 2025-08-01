package 자료구조_투포인터;
import java.io.BufferedReader;
import java.util.*;
import java.io.*;
public class P1940주몽{
  public static void main(String[] args) throws IOException{
    // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer st=new StringTokenizer(br.readLine());
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int[] arr=new int[N];
    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int i=0;
    int j=N-1;
    int cnt=0;
    while(i<j){
      if(arr[i]+arr[j] > M) j--;
      else if(arr[i]+arr[j]<M) i++;
      else{
        i++;
        j--;
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}