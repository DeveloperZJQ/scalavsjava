package designpatterns.template.demo1;

/**
 * demo1 客户端
 *
 * @author happy
 * @since 2021-05-10
 */
public class Template1Client {
    public static void main(String[] args) {
        TemplateManager templateManage = new TemplateManageImpl();
        templateManage.TemplateMethod();
    }
}
