package 구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class P18110_solvedac {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int cut = (int) Math.round(n * 0.15);
        int sum = 0;
        for (int i = cut; i < n - cut; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / (n - cut * 2);
        System.out.println((int) Math.round(avg));
    }
}
