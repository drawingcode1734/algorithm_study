import java.util.Scanner;

public class bj10952{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("A B를 입력하세요 (0 0을 입력하면 종료)");
        
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int sum = A + B;
        
            if (A == 0 && B == 0)
                break;

            System.out.println(sum);
        }
 
    }
}