package stream;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 求多个List<Object>集合的交集
 *
 * @author happy
 * @since 2023-06-27
 */
public class DistinctEntityByStream {
    public static void main(String[] args) {
        getDistinctList();
    }

    private static void getDistinctList() {
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher(10, "zhang", 24));
        list.add(new Teacher(10, "zhang", 24));
        list.add(new Teacher(10, "zhang", 24));
        list.add(new Teacher(10, "zhang", 24));
        list.add(new Teacher(5, "zhang2", 34));
        list.add(new Teacher(6, "zhang3", 26));
        list.add(new Teacher(6, "zhang3", 26));
        list.add(new Teacher(6, "zhang3", 26));
        list.add(new Teacher(6, "zhang3", 26));
        list.add(new Teacher(7, "zhang4", 24));
        list.add(new Teacher(7, "zhang4", 24));

        List<Teacher> teacherList = list
                .stream()
                .filter(one -> Collections.frequency(list, one) == 4)
                .filter(distinctByKey(Teacher::getId))
                .sorted(Comparator.comparing(Teacher::getId))
                .collect(Collectors.toList());
        teacherList.forEach(System.out::println);
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        ConcurrentHashMap<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static class Teacher {
        private Integer id;
        private String name;
        private Integer age;

        public Teacher(Integer id, String name, Integer age) {
            this.id = id;
            this.name = name;
            this.age = age;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Teacher teacher = (Teacher) o;
            return Objects.equals(id, teacher.id) && Objects.equals(name, teacher.name) && Objects.equals(age, teacher.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, age);
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
