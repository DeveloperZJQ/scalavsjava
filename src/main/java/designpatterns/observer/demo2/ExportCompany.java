package designpatterns.observer.demo2;

/**
 * 出口具体类
 *
 * @author happy
 * @since 2021-05-17
 */
public class ExportCompany extends Company {
    @Override
    void response(int number) {
        if (number > 0) {
            System.out.println("人民币汇率升值" + number + "个基点，降低了出口产品收入，降低了出口公司的销售利润率。");
        } else {
            System.out.println("人民币汇率贬值" + (-number) + "个基点，提升了出口产品收入，提升了出口公司的销售利润率。");
        }
    }
}
