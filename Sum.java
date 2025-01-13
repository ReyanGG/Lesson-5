import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell number");
        int a = sc.nextInt();

        int b = 0;
    

        while (a > -1) {
            b = b + a;
            a = a - 1;
        }
        System.out.println(b);

    }

}
