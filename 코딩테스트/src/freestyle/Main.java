import java.util.Scanner;

public class Main {
    static int N;               // 보드 크기
    static char[][] board;      // 사탕 보드
    static int answer = 1;      // 최대 연속 사탕 길이 (최소 1)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();       // 보드 크기 입력
        board = new char[N][N];

        // 보드 입력
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < N; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        // 모든 위치에서 오른쪽 / 아래쪽과 교환 시도
        // (왼쪽, 위는 중복되므로 볼 필요 없음)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                // 오른쪽 칸과 교환 가능한 경우
                if (j + 1 < N && board[i][j] != board[i][j + 1]) {
                    swap(i, j, i, j + 1);          // 두 칸 교환
                    answer = Math.max(answer, check()); // 전체 보드 검사
                    swap(i, j, i, j + 1);          // 다시 원상복구
                }

                // 아래쪽 칸과 교환 가능한 경우
                if (i + 1 < N && board[i][j] != board[i + 1][j]) {
                    swap(i, j, i + 1, j);          // 두 칸 교환
                    answer = Math.max(answer, check()); // 전체 보드 검사
                    swap(i, j, i + 1, j);          // 다시 원상복구
                }
            }
        }

        System.out.println(answer); // 최대 연속 사탕 출력
    }

    // 두 위치의 사탕을 교환하는 함수
    static void swap(int x1, int y1, int x2, int y2) {
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    // 현재 보드에서 가로/세로 최대 연속 사탕 길이 구하는 함수
    static int check() {
        int max = 1;

        // 가로 검사
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                // 왼쪽 사탕과 색이 같으면 연속 길이 증가
                if (board[i][j] == board[i][j - 1]) {
                    count++;
                } else {
                    count = 1; // 색이 다르면 연속 끊김
                }
                max = Math.max(max, count);
            }
        }

        // 세로 검사
        for (int j = 0; j < N; j++) {
            int count = 1;
            for (int i = 1; i < N; i++) {
                // 위쪽 사탕과 색이 같으면 연속 길이 증가
                if (board[i][j] == board[i - 1][j]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }

        return max; // 최대 연속 길이 반환
    }
}