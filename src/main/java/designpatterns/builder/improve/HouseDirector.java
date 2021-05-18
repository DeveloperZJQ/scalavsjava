package designpatterns.builder.improve;

/**
 * @author happy
 * @since 2021-04-17
 */
public class HouseDirector {
    HouseBuilder houseBuilder ;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildProof();
    }
}
