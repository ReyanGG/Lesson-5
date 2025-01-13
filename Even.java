import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start number");
        int a = sc.nextInt();
        System.out.println("End number");
        int b = sc.nextInt();

        while (b >= a) {
            System.out.println(a);

            a += 2;

        }

    }

}
