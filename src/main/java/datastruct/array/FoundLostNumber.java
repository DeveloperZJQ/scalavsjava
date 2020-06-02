package datastruct.array;

import java.util.ArrayList;
import java.util.BitSet;

/**
 * @author happy
 * @create 2020-06-03
 * finding lost number in array
 */
public class FoundLostNumber {

    /**
     * by bitmap to resolve question
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,9,10};     //定义数组
        ArrayList<Integer> ints = new ArrayList<Integer>();
        BitSet bitSet = new BitSet(100);

        for (int i : arr) {
            bitSet.set(i);
        }

        System.out.println("length="+bitSet.length());      //i can not understand why bitset length eq 11
        System.out.println("size="+bitSet.size());          //i can not understand why bitset size eq 128

        for (int i=0;i<=100;i++){
            if (bitSet.get(i)) {
                System.out.println("bit=="+i+"==true");
            }else {
                System.out.println(ints.add(i));
            }
        }

        for(int i = 0; i<ints.size(); i++) {
            System.out.println(ints.get(i));
        }
    }
}
