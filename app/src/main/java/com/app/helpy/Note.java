package com.app.helpy;

public class Note {
    private String title,content,date,time;
    private long ID;
    Note(){}
    Note( String title,String content,String date,String time){
        this.title=title;
        this.content=content;
        this.date=date;
        this.time=time;
    }
    Note(long id,String title,String content,String date,String time){
        this.ID=id;
        this.title=title;
        this.content=content;
        this.date=date;
        this.time=time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
