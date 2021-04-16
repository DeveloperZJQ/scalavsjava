package designpatterns.prototype;

/**
 * @author happy
 * @since 2021-04-16
 */
public class ProtoType {
    public static void main(String[] args) {
        //浅拷贝
        /*
        Person protoTypePerson = new Person("小菜鸟","程序员");
        Person clonePerson = (Person) protoTypePerson.clone();
        System.out.println("protoTypePerson-->"+protoTypePerson);
        System.out.println("clonePerson-->"+clonePerson);
         */
        //深拷贝
        Person protoTypeDeepPerson = new Person("小菜鸟","程序员",new Computer("red","acer"));
        Person cloneDeepPerson = (Person) protoTypeDeepPerson.clone();
        System.out.println("protoTypePerson-->"+protoTypeDeepPerson);
        System.out.println("clonePerson-->"+cloneDeepPerson);

    }
}
