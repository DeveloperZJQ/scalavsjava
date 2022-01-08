package designpatterns.template.demo2;

/**
 * 模板方法 设计模式 一
 *
 * @author happy
 * @since 2022-01-08
 */
public class TestPaperImpl1 implements TestPaper {

    @Override
    public void testQuestion1() {
        System.out.println("this is question 1");
        System.out.println("this is answer a");
    }

    @Override
    public void testQuestion2() {
        System.out.println("this is question 2");
        System.out.println("this is answer b");
    }

    @Override
    public void testQuestion3() {
        System.out.println("this is question 3");
        System.out.println("this is answer c");
    }
}
