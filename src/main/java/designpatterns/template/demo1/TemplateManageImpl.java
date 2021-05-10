package designpatterns.template.demo1;

/**
 * 模板实现类
 *
 * @author happy
 * @since 2021-05-10
 */
public class TemplateManageImpl extends TemplateManager {
    @Override
    public void manageThing() {
        System.out.println("子类管理物品");
    }

    @Override
    public void manageFactor() {
        System.out.println("子类管理工人");
    }
}
