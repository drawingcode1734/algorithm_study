import java.util.Scanner;

public class star{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        
        for(int i = 1 ; i <= num ; i++) {
            for(int j = num-i ; j >= 0 ; j--)
                System.out.print(" ");
            
            for(int k = 1 ; k <= i ; k++)
                System.out.print("*");

            System.out.println();
        }

    }
}

