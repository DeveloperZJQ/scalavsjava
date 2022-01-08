package designpatterns.template.demo3;

/**
 * @author happy
 * @since 2022/1/8
 */
public class TemplateMethodClient3 {
    public static void main(String[] args) {
        TemplateImpl template1 = new TemplateImpl("a", "b", "c");
        template1.testQuestion1();
        template1.testQuestion2();
        template1.testQuestion3();
    }
}
