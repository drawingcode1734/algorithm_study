import java.util.Scanner;

public class bj10952{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
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