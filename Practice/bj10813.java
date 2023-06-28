import java.util.Scanner;

public class bj10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니의 개수 N개
        int M = sc.nextInt(); // 공을 바꾸는 횟수 M번

        int[] arr = new int[N]; // 바구니를 배열로 표현
        
        for(int k = 0; k < N; k++) {
            arr[k] = k+1; // 바구니에 초기값 설정 (바구니의 번호 = 공 번호인 상황)
        }

        int i = 0; // i번 바구니
        int j = 0; // j번 바구니
        int tmp = 0;

        for(int k = 1; k <= M; k++) { // M번 공을 바꾸기 위한 반복문
            i = sc.nextInt();
            j = sc.nextInt();
            
            tmp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = tmp;
          
        }
        for(int k = 0; k < N; k++) {
            System.out.print(arr[k]+" "); // 최종 바구니 출력
        }
    }
}
