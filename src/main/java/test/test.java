package test;

import firstblood.JTest01;
import firstblood.TestFourPackageType;

/**
 * @author happy
 * @create 2020-03-19
 * practise protected
 */
public class test extends TestFourPackageType {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestFourPackageType testFourPackageType = new TestFourPackageType();    //new parent class ，cannot use clone
        test test = new test();     //children extends parent class of TestFourPackageType can use clone().
        String a = test.a;
        Object clone = test.clone();
    }
}
