package designpatterns.template.demo1;

/**
 * 抽象模板
 *
 * @author happy
 * @since 2021-05-10
 */
public abstract class TemplateManager {
    public void TemplateMethod() {
        System.out.println("模板方法");
        manageMoney();
        manageThing();
        manageFactor();
        manageStaff();
    }

    public void manageMoney() {
        System.out.println("管理财务");
    }

    public void manageThing() {
        System.out.println("管理物品");
    }

    public abstract void manageFactor();

    public void manageStaff() {
        System.out.println("管理下属");
    }
}
