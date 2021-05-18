package designpatterns.adapter.interfaceadapter;

/**
 * @author happy
 * @since 2021-04-19
 */
public class StudentImpl extends AbstractStudent {
    @Override
    public int speakAge() {
        System.out.println("芳龄20");
        return super.speakAge();
    }

    @Override
    public String speakLook() {
        System.out.println("美娇娘");
        return super.speakLook();
    }
}
