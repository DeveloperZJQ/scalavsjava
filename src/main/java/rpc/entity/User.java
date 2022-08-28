package rpc.entity;

import java.io.Serializable;

/**
 * @author happy
 * @since 2022/8/28
 */
public class User implements Serializable {

    // 序列化版本UID，如果不指定的话，一旦class修改，UID就不一样了
    private static final Long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
