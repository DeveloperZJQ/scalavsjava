package concurrent.waitnotifyqueue;

/**
 * @author happy
 * @since 2022/5/1
 */
public final class Message {
    private Integer id;
    private Object value;

    public Message(Integer id, Object value) {
        this.id = id;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}
