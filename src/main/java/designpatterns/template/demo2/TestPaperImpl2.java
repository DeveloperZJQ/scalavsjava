package designpatterns.template.demo2;

/**
 * @author happy
 * @since 2022/1/8
 */
public class TestPaperImpl2 implements TestPaper {

    @Override
    public void testQuestion1() {
        System.out.println("this is question 1");
        System.out.println("this is answer b");
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