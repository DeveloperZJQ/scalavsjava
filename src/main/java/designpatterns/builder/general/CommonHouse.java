package designpatterns.builder.general;

/**
 * @author happy
 * @since 2021-04-16
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("建地面");
    }

    @Override
    public void buildWall() {
        System.out.println("建墙体");
    }

    @Override
    public void buildProof() {
        System.out.println("建房顶");
    }
}
