package Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P1021_회전하는큐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;

        Deque<Integer> deque = new ArrayDeque<>(N);
        for (int i = 0; i < N; i++) {
            // index로 deque를 채운다.
            deque.add(i + 1);
        }

        int[] indices = new int[M];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = sc.nextInt();
        }

        for (int index : indices) {
            // 뽑아내려는 수의 위치 찾기
            // deque의 첫번째 값 ~ index 까지 거리 구하기
            int headToIndex = 0;

            for (int j : deque) {
                if (index == j) {
                    break;
                }
                headToIndex++;
            }

            int tailToIndex = deque.size() - headToIndex - 1;

            if (headToIndex <= tailToIndex) {
                // 왼쪽으로 회전
                while (deque.getFirst() != index) {
                    deque.addLast(deque.pollFirst());
                    result += 1;
                }
            } else {
                // 오른쪽으로 회전
                while (deque.getFirst() != index) {
                    deque.addFirst(deque.pollLast());
                    result += 1;
                }
            }

            // 원소 제거
            deque.removeFirst();
        }
        System.out.println(result);
    }
}
