package classwork.fibonachy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите порядковый номер числа Фибоначчи: ");
        Scanner in = new Scanner(System.in);
        NumFibanachy nf = new NumFibanachy(in.nextInt());
        System.out.println(nf.get());
    }
}
