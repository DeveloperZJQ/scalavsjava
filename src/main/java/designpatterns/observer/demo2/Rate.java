package designpatterns.observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 汇率-抽象目标类
 *
 * @author happy
 * @since 2021-05-17
 */
public abstract class Rate {
    protected List<Company> companyList = new ArrayList<>();

    void add(Company company) {
        companyList.add(company);
        System.out.println("添加一个company");
    }

    void remove(Company company) {
        companyList.remove(company);
        System.out.println("删除一个company");
    }

    public abstract void change(int number);
}
