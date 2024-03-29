package designpatterns.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author DeveloperZJQ
 * @since 2022-8-31
 */
public class Student implements Cloneable, Serializable {
    private Integer id;
    private String name;
    private String cardId;
    private Date startTime;
    private Bag bag;

    public static class Bag {
        private String color;
        private Integer size;

        public Bag(String color, Integer size) {
            this.color = color;
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }
    }

    public Student() {
    }

    public Student(Integer id, String name, String cardId, Date startTime, Bag bag) {
        this.id = id;
        this.name = name;
        this.cardId = cardId;
        this.startTime = startTime;
        this.bag = bag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardId='" + cardId + '\'' +
                ", startTime=" + startTime +
                ", bag=" + bag +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
