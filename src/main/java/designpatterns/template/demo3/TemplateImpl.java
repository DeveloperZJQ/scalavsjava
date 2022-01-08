package designpatterns.template.demo3;

/**
 * @author happy
 * @since 2022/1/8
 */
public class TemplateImpl {
    private String answer1;
    private String answer2;
    private String answer3;

    public TemplateImpl(String answer1, String answer2, String answer3) {
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    public void testQuestion1() {
        System.out.println("this is question 1");
        System.out.println("this is answer " + answer1);
    }

    public void testQuestion2() {
        System.out.println("this is question 2");
        System.out.println("this is answer " + answer2);
    }

    public void testQuestion3() {
        System.out.println("this is question 3");
        System.out.println("this is answer " + answer3);
    }
}
