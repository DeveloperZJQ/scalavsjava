package designpatterns.template.demo2;

/**
 * @author happy
 * @since 2022/1/8
 */
public class TemplateMethodClient {

    public static void main(String[] args) {
        TestPaper paperImpl1 = new TestPaperImpl1();
        paperImpl1.testQuestion1();
        paperImpl1.testQuestion2();
        paperImpl1.testQuestion3();

        TestPaper paperImpl2 = new TestPaperImpl2();
        paperImpl2.testQuestion1();
        paperImpl2.testQuestion2();
        paperImpl2.testQuestion3();
    }
}
