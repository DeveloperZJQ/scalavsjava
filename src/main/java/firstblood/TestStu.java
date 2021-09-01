package firstblood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * stream分组求和，遍历封装成对象
 *
 * @author zhangjianqiang
 * @since 2021-08-29
 */
public class TestStu {
    public static void main(String[] args) {
        Student studentTYW = new Student("佟婉", 88, "学生", "女", 200.00);
        Student studentZTC = new Student("霆琛", 96, "老师", "女", 300.00);
        Student studentDYT = new Student("唐", 87, "学生", "女", -200.00);
        Student studentZZZ = new Student("Z", 100, "学生", "男", 400.00);
        Student studentDDD = new Student("D", 90, "老师", "男", 500.00);

        List<Student> students = Arrays.asList(studentTYW, studentZTC, studentDYT, studentZZZ, studentDDD);

        Map<String, Map<String, Double>> collect = students.stream().collect(Collectors.groupingBy(Student::getDept,
                Collectors.groupingBy(Student::getSex, Collectors.summingDouble(Student::getAmt))));

        List<Stu> stuList = new ArrayList<>();

        collect.forEach((key, value) -> value.forEach((key1, value1) -> {
            Stu stu = new Stu();
            stu.setDept(key);
            stu.setSex(key1);
            stu.setAmt(value1);
            stuList.add(stu);
        }));

        System.out.println(stuList);
    }

    public static class Stu {
        private String dept;
        private String sex;
        private Double amt;

        public Stu() {

        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        public void setAmt(Double amt) {
            this.amt = amt;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Stu{" +
                    "dept='" + dept + '\'' +
                    ", sex='" + sex + '\'' +
                    ", amt=" + amt +
                    '}' + "\n";
        }
    }
}
