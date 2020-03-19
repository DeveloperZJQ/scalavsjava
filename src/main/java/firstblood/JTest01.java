package firstblood;

/**
 * @author happy
 * @create 2020-03-19 1:01
 * compare loop function about while and for use java
 */
public class JTest01 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        long start2 = System.currentTimeMillis();
        int a =0;
        while (a<=10000){
            System.out.println("------------26------------>"+a);
            a++;
        }
        long end2 = System.currentTimeMillis();
        long start1 = System.currentTimeMillis();
        for(int b=1; b<=10000;b++){
            System.out.println("----------30-------------->"+b);
        }
        long end1 = System.currentTimeMillis();

        System.out.println("end-start---------1-------->"+(end1-start1));
        System.out.println("end-start---------2-------->"+(end2-start2));
    }
}
