import java.io.*;
import java.util.*;

public class Main {
	static int maxValue=Integer.MIN_VALUE;
	static int minValue=Integer.MAX_VALUE;
	static int[] operator = new int[4];
	static int[] number;
	static int N;
    public static void main(String[] args) throws Exception {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 N = Integer.parseInt(br.readLine()); //숫자의 개수
         number = new int[N]; //숫자 넣을 배열 초기화

         // 숫자 입력
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         for (int i = 0; i < N; i++) {
             number[i] = Integer.parseInt(st.nextToken());
         }
         st = new StringTokenizer(br.readLine(), " ");
         for (int i = 0; i < 4; i++) { //더하기, 빼기, 곱하기, 나누기 연산자가 존재하므로 총 4개
             operator[i] = Integer.parseInt(st.nextToken());
         }
         solution(number[0], 1);
    }
    public static void solution(int num, int index) {
    	if (index == N) {
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
            return;
        }
    	for(int i=0;i<4;i++) {
    		operator[i]--;
    		switch(i) {
    		 case 0: //더하기일 경우
                 solution(num + number[index], index + 1);
                 break;
             case 1: //빼기일 경우
                 solution(num - number[index], index + 1);
                 break;
             case 2: //곱하기일 경우
                 solution(num * number[index], index + 1);
                 break;
             case 3: //나누기일 경우
                 solution(num / number[index], index + 1);
                 break;
    		}
    		operator[i]++;
    	}
    }
}