package test;

import firstblood.JTest01;
import firstblood.TestFourPackageType;

import java.util.Arrays;

/**
 * @author happy
 * @create 2020-03-19
 * practise protected
 */
public class test extends TestFourPackageType {
    public static void main(String[] args) throws CloneNotSupportedException {
//        TestFourPackageType testFourPackageType = new TestFourPackageType();    //new parent class ，cannot use clone
//        test test = new test();     //children extends parent class of TestFourPackageType can use clone().
//        String a = test.a;
//        Object clone = test.clone();
//        int[] a = new int[10];
        int[] a =   {1,2,3,4,5,0,0};

        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        //变换
        int temp;
        for (int i=a.length-1;i>0;i--){
            temp        =   a[i];
            a[i]        =   a[i-1];
        }

        a[0] = 0;
        System.out.println();

        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
