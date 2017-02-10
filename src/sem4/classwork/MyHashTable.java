package sem4.classwork;

import java.util.ArrayList;

/**
 * Created by admin on 10.02.2017.
 */
public class MyHashTable {
    ArrayList<Bucket> buckets = new ArrayList<>();

    public MyHashTable(int n) {
        for(int i=0;i<n;++i){
            buckets.add(new Bucket());
        }
    }
    public String get(String k){
        int h = k.hashCode();
        int index = Math.abs(h%buckets.size());
        Bucket b = buckets.get(index);
        for(Pair p : b.pairs){
            if(p.key.equals(k)){
                return p.value;
            }
        }
        return null;
    }
    public void put(String k, String v){
        int h = k.hashCode();
        int index = Math.abs(h%buckets.size());
        Bucket b = buckets.get(index);
        for(Pair p : b.pairs){
            if(p.key.equals(k)){
                p.value = v;
                return;
            }
        }
        b.pairs.add(new Pair(k, v));
    }
}
