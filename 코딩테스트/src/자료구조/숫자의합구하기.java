package 자료구조;

import java.util.Scanner;
public class 숫자의합구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		String sNum=sc.next();
		char[] cNum = sNum.toCharArray();//문자열을 하나의 문자로 분리해서 배열에 저장
		int sum=0;
		for(int i=0;i<cNum.length;i++) {
			sum+=cNum[i]-'0';//아스키코드 감안해서 문자 '0' 빼기 연산 수행
		}
		System.out.println(sum);
	}

}
