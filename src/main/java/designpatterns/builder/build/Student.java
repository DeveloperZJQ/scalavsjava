package designpatterns.builder.build;

/**
 * @author happy
 * @since 2022/8/28
 */
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String clazz;
    private Integer grade;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.clazz = builder.clazz;
        this.grade = builder.grade;
    }

    public Student(Integer id, String name, Integer age, String clazz, Integer grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.clazz = clazz;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public static class Builder {
        private Integer id;
        private String name;
        private Integer age;
        private String clazz;
        private Integer grade;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder clazz(String clazz) {
            this.clazz = clazz;
            return this;
        }

        public Builder grade(Integer grade) {
            this.grade = grade;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }


    public static void main(String[] args) {
        Student student = new Builder()
                .id(1)
                .name("san")
                .age(30)
                .clazz("123")
                .grade(2)
                .build();

        System.out.println(student);
    }
}
