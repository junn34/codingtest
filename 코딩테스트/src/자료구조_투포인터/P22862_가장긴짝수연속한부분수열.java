package 자료구조_투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P22862_가장긴짝수연속한부분수열 {

	public static void main(String[] args) throws Exception{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;

	        st = new StringTokenizer(br.readLine());

	        int n = Integer.parseInt(st.nextToken()); // 배열의 길이
	        int k = Integer.parseInt(st.nextToken()); // 최대 뺄 수 있는 수의 개수

	        int answer = 0; // 정답 추적
	        int[] arr = new int[n]; // 입력받은 배열

	        st = new StringTokenizer(br.readLine());
	        for(int i =0 ; i < n; i++){
	            arr[i] = Integer.parseInt(st.nextToken());
	        }

	        int start = 0;
	        int end = 0;
	        int nowK = 0;
	        int count = 0;

	        while(end < n){ // 끝까지 탐색 조건
	            if(nowK < k){ // 아직 뺼 수 있는게 있다면
	                if(arr[end] % 2 == 0){ // 짝수라면
	                    count++; // 값 증가
	                    end++; // 끝 인덱스 증가
	                    answer = Math.max(answer, count - nowK); // 최댓값 갱신
	                    continue;
	                }
	                end++; // 끝 인덱스 증가
	                count++; // 값 증가
	                nowK++; // 현재 k값 증가
	                answer = Math.max(answer, count - nowK); // 최댓값 갱신
	                continue;
	            }
	            if(nowK == k){ // 이미 최대에 다 왔다면
	                if(arr[end] % 2 == 0){ // 짝수라면
	                    count++; // 값 증가
	                    end++; // 끝 인덱스 증가
	                    answer = Math.max(answer, count - nowK); // 최댓값 갱신
	                    continue;
	                }
	                while(arr[start] % 2 == 0){
	                    count--; // 값 감소
	                    start++; // 시작 인덱스 증가
	                }
	                count--; // 값 감소
	                nowK--; // 현재 k값 감소
	                start++; // 시작 인덱스 증가
	                answer = Math.max(answer, count - nowK); // 최댓값 갱신
	            }
	        }

	        System.out.println(answer);

	    }

	}

}
