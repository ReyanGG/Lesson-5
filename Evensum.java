public class Evensum {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        while (b <= 50) {
            if (b % 2 == 0) {
                a = a + b;
            }
            b++;
        }
        System.out.println(a);
    }
}