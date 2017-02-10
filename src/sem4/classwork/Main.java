package sem4.classwork;

/**
 * Created by admin on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyHashTable table = new MyHashTable(100);
        table.put("table", "стол");
        table.put("pack", "пакет");
        table.put("air", "воздух");
        table.put("pool", "тяни");
        System.out.println(table.get("table"));
    }
}
