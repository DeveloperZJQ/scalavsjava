package datastruct.array;

/**
 * @author happy
 * @since  2020-06-07 10:31
 */
public class ArrayOperate {

    private int[] data;
    private int length;
    private int count;

    //构造方法
    public ArrayOperate(int capacity){
        this.data   = new int[capacity];    //数组初始化
        this.length = capacity;             //数组定义的长度
        this.count  =   0;                  //初始化实际元素个数为0个
    }


    //插入无序--头部和尾部插入--true 为头部插入，false为尾部插入
    public void insertByUnSortsArrays(int value,boolean insertStyle){
        if (count>=length) System.out.println("out of bound");
        if (count>0&&count<length&&insertStyle){   //数组头部插入
            data[count]   =   value;
            ++count;
        }
        //数组尾部插入
        int temp;
        if (count>0&&count<length&&!insertStyle){   //数组头部插入

            for (int i=count;i>0;i--){
                temp        =   data[i];
                data[i]     =   data[i-1];
            }
            data[0]         =   value;
            ++count;
        }
        if (count==0){
            data[0] =   value;
            ++count;
        }
    }

    //通过下标删除元素
    public void deleteByIndexArrays(int index){
        if (index<0||index>=count){
            System.out.println("out of delete`s range .");
        }

        for (int i=2;i<count-1;i++){
            data[i] = data[i+1];
        }
        --count;
    }

    //通过值删除元素
    public void deleteByVauleArrays(int value){}

    //删除、标记、打包带走
    public void deleteByIndexSignPackAway(int index,boolean b){//默认只是标记，不清理

    }

    //查找元素通过值
    public int findByValueArrasy(int a){
        if (count<0||count>length) return -1;
        int i;
        for (i =0;i<count;i++){
            if (data[i]==a)
                break;
        }
        return data[i];
    }

    //查找元素通过索引
    public int findByIndexArrasy(int index){
        if (index<0||index>=count){
            return -1;
        }
        return data[index];
    }

    //输出打印
    public void printAll(){
        System.out.println("begin print elements of arrays .");
        for (int i=0;i<count;i++){
            System.out.print(data[i]+" ");
        }
//        System.out.println();
//        for (int i=count-1;i>=0;i--){
//            System.out.print(data[i]+" ");
//        }
        System.out.println("\nend print elements of arrays .");
    }

    //main
    public static void main(String[] args) {
        ArrayOperate arrayOperate = new ArrayOperate(10);
        arrayOperate.insertByUnSortsArrays(10,true);
        arrayOperate.insertByUnSortsArrays(20,true);
        arrayOperate.insertByUnSortsArrays(12,true);
        arrayOperate.insertByUnSortsArrays(14,true);
        arrayOperate.insertByUnSortsArrays(16,true);
        arrayOperate.insertByUnSortsArrays(18,true);
        arrayOperate.insertByUnSortsArrays(22,true);
        arrayOperate.insertByUnSortsArrays(32,true);
        arrayOperate.insertByUnSortsArrays(42,false);
        arrayOperate.insertByUnSortsArrays(52,false);
        arrayOperate.deleteByIndexArrays(2);
        arrayOperate.printAll();
    }
}

