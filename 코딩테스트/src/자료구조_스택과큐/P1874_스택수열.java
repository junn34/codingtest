package 자료구조_스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1874_스택수열 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;

        while (n-- > 0) {
            int k = Integer.parseInt(br.readLine());

            if (k > start) {
                for (int i = start + 1; i <= k; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = k;
            }

            if (stack.peek() == k) {
                stack.pop();
                sb.append('-').append('\n');
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }

}
