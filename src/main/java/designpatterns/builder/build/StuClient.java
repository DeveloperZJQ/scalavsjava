package designpatterns.builder.build;

/**
 * @author happy
 * @since 2022/8/29
 */
public class StuClient {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .id(1)
                .name("san")
                .age(30)
                .clazz("123")
                .grade(2)
                .build();

        System.out.println(student);
    }
}
