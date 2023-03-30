package org.example.models;

public class ModelAttendance {

    private int Id;
    private int Classid;
    public ModelAttendance(int Id, int Clasid, int Userid) {
        this.Id = Id;
        this.Classid = Classid;
        this.Userid = Userid;

    }
    
    private int Userid;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getClassid() {
        return Classid;
    }

    public void setClassid(int Classid) {
        this.Classid = Classid;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int Userid) {
        this.Userid = Userid;
    }

}
