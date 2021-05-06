package designpatterns.proxy.dynamic;

/**
 * @author happy
 * @since 2021-05-05
 */
public class Tom implements IPerson {
    @Override
    public void findPerformTeacher() {
        System.out.println("符合Tom的要求。");
    }
}
