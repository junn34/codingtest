import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

        int[] cnt = new int[d + 1];
        int distinct = 0;

        // 초기 윈도우 [0..k-1]
        for (int i = 0; i < k; i++) {
            int x = arr[i];
            if (cnt[x] == 0) distinct++;
            cnt[x]++;
        }

        int max = distinct + (cnt[c] == 0 ? 1 : 0);

        // 슬라이딩: 총 N번의 창문을 본다 (원형이므로)
        for (int start = 1; start < N; start++) {
            int out = arr[start - 1];
            cnt[out]--;
            if (cnt[out] == 0) distinct--;

            int inIdx = (start + k - 1) % N;
            int in = arr[inIdx];
            if (cnt[in] == 0) distinct++;
            cnt[in]++;

            int cur = distinct + (cnt[c] == 0 ? 1 : 0);
            if (cur > max) max = cur;
        }

        System.out.println(max);
    }
}
