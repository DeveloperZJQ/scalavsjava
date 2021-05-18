package designpatterns.observer.demo2;

public class RMBRate extends Rate {
    @Override
    public void change(int number) {
        for (Company company : companyList) {
            company.response(number);
        }
    }
}
