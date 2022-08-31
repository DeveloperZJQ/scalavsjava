package designpatterns.prototype;

import java.util.Date;

/**
 * @author DeveloperZJQ
 * @since 2022-8-31
 */
public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        // 原型
        // 浅拷贝 日期属性字段
        Date date = new Date();
        // 深拷贝 日期属性字段
        Date date2 = new Date();

        Student student1 = new Student(1, "zhang", "san", date, new Student.Bag("red", 100));

        Thread.sleep(2000L);
        // 相同实体浅拷贝
        Student student2 = (Student) student1.clone();
        date.setTime(new Date().getTime());
        System.out.println("student1=" + student1);
        System.out.println("student2=" + student2);
        System.out.println("stu1=" + student1.getStartTime());
        System.out.println("stu2=" + student2.getStartTime());

        // 深拷贝
        Student2 stu3 = new Student2(1, "wwww", "22222x", date2, new Student2.Bag("black", 100));

        Student2 stu4 = (Student2) stu3.clone();
        date2.setTime(new Date().getTime());

        System.out.println("student3=" + stu3);
        System.out.println("student4=" + stu4);
        System.out.println("stu3=" + stu3.getStartTime());
        System.out.println("stu4=" + stu4.getStartTime());
    }
}
