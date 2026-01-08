package 구현;

import java.io.*;
import java.util.*;
public class P1316_그룹단어체커 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		
		
		int cnt=0;//그룹단어 개수 체크
		for(int i=0;i<N;i++) {
			boolean isDupl=false;//그룹단어인지 체크 기본값 false
			String str=br.readLine();
			ArrayList<Character> arr=new ArrayList<>(); //이제까지 나온 글자 저장 리스트
			arr.add(str.charAt(0));
			for(int j=1;j<str.length();j++) {
				if(str.charAt(j-1)!=str.charAt(j)) {//현재 문자열의 글자가 이전 글자와 다르면
					for(int k=0;k<arr.size();k++) {//글자가 리스트에 이미 있는지 확인
						if(str.charAt(j)==arr.get(k)) {//있다면 반복문 중단
							isDupl=true;
							break;
						}
						
					}
					//없다면 리스트에 글자 추가
					arr.add(str.charAt(j));
				}
			}
			if(isDupl==false) cnt++;
		}
		System.out.println(cnt);
	}

}
