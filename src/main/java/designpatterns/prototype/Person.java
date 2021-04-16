package designpatterns.prototype;

/**
 * @author happy
 * @since 2021-04-16
 */
public class Person implements Cloneable {
    //姓名
    private String name;
    //职业
    private String occupation;
    //计算机
    private Computer computer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Person(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public Person(String name, String occupation, Computer computer) {
        this.name = name;
        this.occupation = occupation;
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", computer=" + computer +
                '}';
    }

    @Override
    protected Object clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
            //重写clone方法,实现深拷贝,该方式的缺陷是需要单独处理所有要克隆的类中的引用数据类型
            person.computer = (Computer) this.computer.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}
