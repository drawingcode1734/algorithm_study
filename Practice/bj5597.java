import java.util.Scanner;

public class bj5597 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0; // 입력받을 변수

        int[] inputarr = new int[31]; // 입력받을 배열. 인덱스=출석번호로 하기 위해서 31칸 만들고 0번째는 쓰지 않음

        for(int i = 0; i < 28; i++) { // 28명 입력받기
            num = sc.nextInt();
            inputarr[num] = num; // 이렇게 하면 입력받은 배열에 인덱스와 출석번호가 같음
        }

        for(int i = 1; i <= 30; i++) { // i가 1부터 30의 인덱스까지 돌면서 빈방 찾음
            if(inputarr[i] == 0) { // 비어있는 곳 찾으면
                System.out.println(i); // 자리순대로 출력
            }
        }

        
    } // main 닫음
}