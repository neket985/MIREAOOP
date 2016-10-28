package labs.Lab2;


/**
 * Created by nikitos on 21.10.16.
 */
import java.util.Random;

//Задание 14 (вывод всех элементов массива)
//Сортировка методом Шелла
public class Main {
    public static void main(String[] args) {
        int arr[] = new int[1000];
        int arr2[] = new int[1000];
        Random rd = new Random();
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = rd.nextInt(200);
        }
        for (int i = 0; i < arr2.length; ++i) {
            arr2[i] = rd.nextInt(200);
        }
        SortShell(arr);
        SortShell(arr2);
        if(arr[arr.length-1] < arr2[arr2.length - 1]){
            int arr3 [] = arr;
            arr = arr2;
            arr2 = arr3;
        }
        int count = arr[0] < arr2[0] ? arr[0] : arr2[0];
        int lost1 = 0, lost2 = 0;
        while (lost1 < arr.length || lost2 < arr2.length) {
            if (lost2 < arr2.length && arr2[lost2] < count) {
                ++lost2;
            }
            if (arr[lost1] > count) {
                try {
                    if (arr2[lost2] > count) {
                        ++count;
                    } else if (arr2[lost2] == count) {
                        System.out.print(", " + arr2[lost2]);
                        ++lost2;
                        ++count;
                    }
                } catch (Exception e) {
                    ++count;
                }
            } else if (arr[lost1] == count) {
                if (lost2 < arr2.length && arr2[lost2] == count) {
                    ++lost2;
                }
                System.out.print(", " + arr[lost1]);
                ++lost1;
                ++count;
            } else {
                ++lost1;
            }
        }

    }

    public static void SortShell(int arr[]) {
        int h = 0;
        int val;

        while (h * 3 < arr.length) {
            h = h * 3 + 1;
        }
        System.out.println("started");
        long time = System.nanoTime();
        while (h > 0) {
            for (int out = h; out < arr.length; out += h) {
                val = arr[out];
                for (int k = out - h; k >= 0; k -= h) {
                    if (val < arr[k]) {
                        arr[k + h] = arr[k];
                    } else {
                        arr[k + h] = val;
                        break;
                    }
                }
            }
            h = (h - 1) / 3;
        }
        System.out.println("Время сортировки: " + (float) (System.nanoTime() - time) / 1000000 + "мс");
    }
}
