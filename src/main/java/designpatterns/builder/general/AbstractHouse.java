package designpatterns.builder.general;

/**
 * @author happy
 * @since 2021-04-16
 */
public abstract class AbstractHouse {
    //打地桩
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWall();

    //房顶
    public abstract void buildProof();

    public void build(){
        buildBasic();
        buildWall();
        buildProof();
    }
}
