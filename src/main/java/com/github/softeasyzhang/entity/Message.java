package com.github.softeasyzhang.entity;


import java.util.Objects;

/**
 * you car write what you want.
 * @author EasyZhang
 * @date 2018/9/11 -  15:03
 */

public class Message {

    private long id;
    private long delayTime;
    private String topic;
    private String message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(long delayTime) {
        this.delayTime = delayTime;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message1 = (Message) o;
        return getId() == message1.getId() &&
                getDelayTime() == message1.getDelayTime() &&
                Objects.equals(getTopic(), message1.getTopic()) &&
                Objects.equals(getMessage(), message1.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDelayTime(), getTopic(), getMessage());
    }
}
