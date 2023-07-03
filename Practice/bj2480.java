import java.util.Scanner;

public class bj2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int prize = 0;


        if (num1 == num2 && num2 == num3 && num1 == num3) {
            prize = 10000 + num1 * 1000;
            System.out.println(prize);
            
        } else if (num1 == num2 || num1 == num3) {
            prize = 1000 + num1 * 100;
            System.out.println(prize);
        } else if (num2 == num3) {
            prize = 1000 + num2 * 100;
            System.out.println(prize);
        } else {
            System.out.println((Math.max(num1, Math.max(num2, num3))*100));
        }

        
    }
}
