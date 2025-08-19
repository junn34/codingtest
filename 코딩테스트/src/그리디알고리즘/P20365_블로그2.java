package 그리디알고리즘;

import java.io.*;

public class P20365_블로그2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int blue = 0, red = 0;

        // 연속된 색 구간 개수 세기
        char prev=s.charAt(0);
        if(prev=='B') blue++;
        else red++;
        for(int i=1;i<N;i++) {
        	char now=s.charAt(i);
        	if(now!=prev) {
        		if(now=='B') blue++;
        		else red++;
        		prev=now;
        	}
        }
        System.out.println(Math.min(red, blue)+1);
    }
}
