package designpatterns.adapter.interfaceadapter;

/**
 * @author happy
 * @since 2021-04-19
 */
public class AbstractStudent implements StudentAction{
    @Override
    public int speakAge() {
        return 20;
    }

    @Override
    public String speakName() {
        return "lisi";
    }

    @Override
    public int speakWeight() {
        return 100;
    }

    @Override
    public String speakLook() {
        return "good";
    }
}
