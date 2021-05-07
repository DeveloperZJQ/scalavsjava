package designpatterns.builder.improve;

/**
 * @author happy
 * @since 2021-04-17
 */
public class BuildClient {

    public static void main(String[] args) {
        //盖房子实现类
        HouseBuilderImpl houseBuilder = new HouseBuilderImpl();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        //完成盖房子,返回产品-房子
        houseDirector.constructHouse();
    }
}
