package classwork;

/**
 * Created by nikitos on 14.11.16.
 * Выводит члены последовательности с нечетными номерами
 */
public class Main3 {
    public static void rec() {
    java.util.Scanner in = new java.util.Scanner(System.in);
    int n = in.nextInt();
    if (n > 0) {
        int m = in.nextInt();
        System.out.println(n);
        if (m > 0) {
            rec();
        }
    }
}
    public static void main(String[] args) {
        rec();
    }
}
