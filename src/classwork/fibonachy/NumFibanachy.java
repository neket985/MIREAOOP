package classwork.fibonachy;

/**
 * Created by liveuser on 11.11.16.
 */
public class NumFibanachy {
    int k;

    NumFibanachy (int k){
        this.k = k;
    }

    public int get(){
        return rec(this.k);
    }
    private int rec(int k){
        if(k==0){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return rec(k-1)+rec(k-2);
    }
}
