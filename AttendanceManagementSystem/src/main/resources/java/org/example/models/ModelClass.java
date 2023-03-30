
package org.example.models;

public class ModelClass {
    private int Id;
    private String Classname;

    public ModelUser(int Id, String Classname) {
        this.Id = Id;
        this.Classname = Classname;

    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getClassname() {
        return Classname;
    }

    public void setClassname(String Classname) {
        this.Classname = Classname;
    }

}