package 구간합;

import java.util.Scanner;
public class 평균구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int subjectNum=sc.nextInt();
		double arr[]= new double[subjectNum];
		double max=0;
		double sum=0;
		
		for(int i=0;i<subjectNum;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<subjectNum;i++) {
			if(max<arr[i]) max=arr[i];
			sum+=arr[i];
		}
		System.out.println(sum*100.0/max/subjectNum);
		sc.close();
		//인덱스를 저장하면 안되는 이유는 2번째 for문에서 값이 변하기 떄문이다. 
		
	}

}
