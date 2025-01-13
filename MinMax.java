import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MAX_VALUE;
        char c;

        do {
            System.out.println("enter number");
            int a = sc.nextInt();

            if (a > m1) {
                m1 = a;
            }
            if (a < m2) {
                m2 = a;
            }

            System.out.println("want another round y/n");
            c = sc.next().toLowerCase().charAt(0);

        } while (c == 'y');
        System.out.println(m1);
        System.out.println(m2);

    }

}
