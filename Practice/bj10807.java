import java.util.Scanner;

public class bj10807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt(); // 숫자 개수 N 입력 받기

        int[] array = new int[N]; // N에 의해 array 생성

        for(int i = 0 ; i < N ; i++)
            array[i] = sc.nextInt(); // 배열에 값 입력

        int v = sc.nextInt(); // 찾을 값 입력

        int k = 0;
        for(int i = 0 ; i < N ; i++) {
            if(array[i] == v) {
                k++;
            }
        }
        System.out.println("찾는 값의 개수: " + k);
    }



}
