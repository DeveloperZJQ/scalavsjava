package firstblood;

public class Student {
    private String name;
    private Integer score;
    private String dept;
    private Double amt;
    private String sex;

    public Student(String name, Integer score, String dept, String sex, Double amt) {
        this.name = name;
        this.score = score;
        this.dept = dept;
        this.sex = sex;
        this.amt = amt;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", dept='" + dept + '\'' +
                '}';
    }
}

