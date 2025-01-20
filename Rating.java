import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rate the Movie");
        int a = sc.nextInt();

        if (a < 5000) {
            System.out.println("bad");
        } else if (a >= 5000 & a <= 25000) {
            System.out.println("good");
        } else if (a >= 25000 & a <= 45000) {
            System.out.println("better");

        } else if (a >= 45000 & a <= 70000) {
            System.out.println("best");
        } else if (a >= 75000) {
            System.out.println("out of this world");
        } else {
            System.out.println("error");
        }

    }
}
