package com.cm.bean;

/**
 * Created by 吴亚斌 on 2017/6/6.
 */
public class Message {
    private String title;
    private String body;

    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", date='" + date + '\'' +
                ", publister='" + publister + '\'' +
                '}';
    }

    private String date;
    private String  publister;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPublister() {
        return publister;
    }

    public void setPublister(String publister) {
        this.publister = publister;
    }

}
