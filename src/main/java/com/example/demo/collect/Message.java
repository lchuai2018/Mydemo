package com.example.demo.collect;

import java.util.Date;
import java.util.Objects;

public class Message {

    private Long id;    //id

    private String msg; //消息

    public Message(Long id, String msg, Date sendTime) {
        this.id = id;
        this.msg = msg;
        this.sendTime = sendTime;
    }

    public Long getId() {
        return id;
    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id) &&
                Objects.equals(msg, message.msg) &&
                Objects.equals(sendTime, message.sendTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, msg, sendTime);
    }
*/

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    private Date sendTime;  //时间戳
}
