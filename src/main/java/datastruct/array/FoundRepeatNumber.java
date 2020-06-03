package datastruct.array;

import java.util.ArrayList;
import java.util.BitSet;

/**
 * @author happy
 * @create 2020-06-04 06:33
 * 如何在给定的整数数组上找到重复的数字？
 * 如果数组包含多个重复项，如何在数组中找到重复的数字？
 * 如何从Java中的给定数组中删除重复项？ ---这个问题和上面的两个都是一类问题，只要找到重复的数字，把数放到可变长度的list里面，后面可以转成数组，或者直接查看bitset里面非0的位置，建一个定长数组也已解决。
 */
public class FoundRepeatNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,10,88,65,43,22,45,33,6,10};
        ArrayList<Integer> ints = new ArrayList<Integer>();
        BitSet bitSet = new BitSet();

        for (int i : arr) {
            if (bitSet.get(i)){              //加一个判断，找出重复的值
                ints.add(i);
            }
            bitSet.set(i);
        }

        //print repeat number
        for(int i = 0; i<ints.size(); i++) {
            System.out.println(ints.get(i));
        }

    }
}
