package designpatterns.prototype;


import java.io.*;
import java.util.Date;

/**
 * 序列化对象
 *
 * @author DeveloperZJQ
 * @since 2022-8-31
 */
public class Student3 implements Cloneable, Serializable {
    private Integer id;
    private String name;
    private String cardId;
    private Date startTime;
    private Bag bag;

    public Student3(Integer id, String name, String cardId, Date startTime, Bag bag) {
        this.id = id;
        this.name = name;
        this.cardId = cardId;
        this.startTime = startTime;
        this.bag = bag;
    }

    public static class Bag implements Cloneable, Serializable {
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

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Object object = super.clone();
            // 实现深度克隆(deep clone)
            Bag user = (Bag) object;
            return user;
        }
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
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardId='" + cardId + '\'' +
                ", startTime=" + startTime +
                ", bag=" + bag +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object copy = null;
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copy = ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
        return copy;
    }
}