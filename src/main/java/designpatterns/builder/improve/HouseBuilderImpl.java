package designpatterns.builder.improve;

public class HouseBuilderImpl extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("建造地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("建造城墙");
    }

    @Override
    public void buildProof() {
        System.out.println("建造房顶");
    }
}
