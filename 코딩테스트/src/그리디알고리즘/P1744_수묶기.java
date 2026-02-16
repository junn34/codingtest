package 그리디알고리즘;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import java.io.*;
import java.util.*;

public class P1744_수묶기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder()); // 양수>1
        PriorityQueue<Integer> minPQ = new PriorityQueue<>(); // 음수
        int ones = 0;
        int zeros = 0;

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x > 1) maxPQ.offer(x);
            else if (x == 1) ones++;
            else if (x == 0) zeros++;
            else minPQ.offer(x);
        }

        long sum = ones;

        // 양수>1: 큰 것부터 2개씩
        while (maxPQ.size() >= 2) {
            int a = maxPQ.poll();
            int b = maxPQ.poll();
            sum += (long) a * b;
        }
        if (!maxPQ.isEmpty()) sum += maxPQ.poll();

        // 음수: 작은 것부터 2개씩
        while (minPQ.size() >= 2) {
            int a = minPQ.poll();
            int b = minPQ.poll();
            sum += (long) a * b;
        }
        // 음수 하나 남음: 0 있으면 상쇄(버림), 없으면 더함
        if (!minPQ.isEmpty()) {
            int last = minPQ.poll();
            if (zeros == 0) sum += last;
        }

        System.out.println(sum);
    }
}
