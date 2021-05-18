package designpatterns.builder.improve;

/**
 * @author happy
 * @since 2021-04-17
 */
public abstract class HouseBuilder {
    protected House house = new House();

    //将建造流程写好
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void buildProof();

    //返回产品
    public House getHouse(){
        return house;
    }
}
