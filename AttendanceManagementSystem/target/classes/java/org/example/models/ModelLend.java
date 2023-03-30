package org.example.models;

public class ModelLend {

    private int id;
    private int bookid;
    private int userid;
    private String date;
    private String returndate;
    private int active;

    public ModelLend(int id, int bookid, int userid, String date, String returndate, int active) {
        this.id = id;
        this.bookid = bookid;
        this.userid = userid;
        this.date = date;
        this.returndate = returndate;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
