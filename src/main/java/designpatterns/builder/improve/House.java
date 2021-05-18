package designpatterns.builder.improve;

/**
 * @author happy
 * @since 2021-04-17
 */
public class House {
    private String basic;
    private String walls;
    private String proof;

    public House(String basic, String walls, String proof) {
        this.basic = basic;
        this.walls = walls;
        this.proof = proof;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getProof() {
        return proof;
    }

    public void setProof(String proof) {
        this.proof = proof;
    }

    public House() {
    }

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", walls='" + walls + '\'' +
                ", proof='" + proof + '\'' +
                '}';
    }
}
