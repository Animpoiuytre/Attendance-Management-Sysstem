package org.example.models;

public class ModelUser {
    private int Id;
    public String Username;
    public String Password;


    public ModelUser(int Id, String Username, String Password) {
        this.Id = Id;
        this.Username = Username;
        this.Password = Password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }


    public void setPassword(String Password) {
        this.Password = Password;
    }
}