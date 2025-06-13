package 투포인터;

import java.util.Scanner;

public class 연속된자연수의합 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=1,start_index=1,end_index=1,sum=1;//바로 N과 동일한 수 있으면 뽑는 경우의 수 추가(count=1)
		while(end_index!=N) {
			if(sum==N) {
				count++;
				end_index++;
				sum=sum+end_index;
			}
			else if(sum>N) {
				sum=sum-start_index;
				start_index++;
			}
			else {
				end_index++;
				sum=sum+end_index;
			}
		}
		System.out.println(count);
	}

}
