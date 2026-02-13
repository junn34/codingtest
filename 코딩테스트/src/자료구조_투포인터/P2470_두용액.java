package 자료구조_투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

package 자료구조_투포인터;

import java.io.*;
import java.util.*;

public class P2470_두용액 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr); // 핵심: 정렬

        int left = 0, right = N - 1;
        int bestA = arr[left], bestB = arr[right];
        long bestAbs = Long.MAX_VALUE;

        while (left < right) {
            long sum = (long) arr[left] + arr[right];
            long abs = Math.abs(sum);

            if (abs < bestAbs) {
                bestAbs = abs;
                bestA = arr[left];
                bestB = arr[right];
                if (bestAbs == 0) break; // 더 좋아질 수 없음
            }

            if (sum < 0) left++;      // 합이 음수면 0에 가까워지려면 키워야 함
            else right--;             // 합이 양수면 줄여야 함
        }

        System.out.println(bestA + " " + bestB);
    }
}

