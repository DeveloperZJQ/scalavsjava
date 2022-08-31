package designpatterns.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author DeveloperZJQ
 * @since 2022-8-31
 */
public class Teacher implements Cloneable, Serializable {
    // 必须实现Cloneable ，否则报错：Exception in thread "main" java.lang.ClassCastException: class designpatterns.prototype.Student cannot be cast to class designpatterns.prototype.Teacher (designpatterns.prototype.Student and designpatterns.prototype.Teacher are in unnamed module of loader 'app')
    //	at designpatterns.prototype.PrototypeClient.main(PrototypeClient.java:19)
    private Integer id;
    private String name;
    //    private String teacherCard;
    private String cardId;
    private Date startTime;

    public Teacher(Integer id, String name, String cardId, Date startTime) {
        this.id = id;
        this.name = name;
        this.cardId = cardId;
        this.startTime = startTime;
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


    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardId='" + cardId + '\'' +
                ", startTime=" + startTime +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
