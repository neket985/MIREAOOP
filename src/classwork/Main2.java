package classwork;

/**
 * Created by liveuser on 11.11.16.
 * выводит количество элементов, равных максимуму, пока не введён 0
 */
public class Main2 {
        public static void rec(int max, int count) {
            java.util.Scanner in = new java.util.Scanner(System.in);
            int n = in.nextInt();
            if (n > 0) {

                if (n > max) {
                    rec(n, 1);
                }
                else if (n == max) {
                    rec(max, ++count);
                }
                else {
                    rec(max, count);
                }
            } else {
                System.out.println(count);
            }
        }
        public static void main(String[] args) {
            rec(0, 0);
        }
}
