import java.util.Scanner;

public class bj2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9]; // 길이가 9인 배열 생성

        int max = 0;
        int max_num = 0;

        for(int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < 9; i++) {
            if(array[i] > max) { // 바로 max값과 비교하는 것으로 수정함
                max = array[i];
                max_num = i+1; // index가 아니라 몇 번째에 있는지 구하라고 했으므로 +1 해줌
            }
        }

        System.out.println(max);
        System.out.println(max_num);

    }
}
