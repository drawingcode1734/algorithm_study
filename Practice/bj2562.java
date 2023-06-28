import java.util.Scanner;

public class bj2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9]; // 길이가 9인 배열 생성
        for(int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
        }

        int max = 0;
        int max_num = 0;

        for(int i = 0; i < 8; i++) {
            if(array[max_num] < array[i+1]) {
                max = array[i+1];
                max_num = i+2;
            }
            max = array[max_num];
        }

        System.out.println(max);
        System.out.println(max_num);


    }

}
