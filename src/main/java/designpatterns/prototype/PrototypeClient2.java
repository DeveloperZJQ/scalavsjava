package designpatterns.prototype;

import java.util.Date;

/**
 * @author happy
 * @since 2022/8/31
 */
public class PrototypeClient2 {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        // 原型
        // 深拷贝 日期属性字段
        Date date = new Date();
        // 深拷贝
        Student3 stu1 = new Student3(1, "wwww", "22222x", date, new Student3.Bag("black", 100));

        Thread.sleep(2000L);

        Student3 stu2 = (Student3) stu1.clone();
        date.setTime(new Date().getTime());

        System.out.println("student1=" + stu1);
        System.out.println("student2=" + stu2);
        System.out.println("stu1=" + stu1.getStartTime());
        System.out.println("stu2=" + stu2.getStartTime());
    }
}
