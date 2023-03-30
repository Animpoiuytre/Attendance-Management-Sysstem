package org.example;

import org.example.models.ModelBooks;
import org.example.models.ModelLend;
import org.example.models.ModelUser;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbHandler {

    //Table Names
    public static final String TABLE_CLASS = "Class";
    public static final String TABLE_USER = "User";
    public static final String TABLE_ATTENDANCE = "Attendance";

    //Column Names
    public static final String COLUMN_ID = "Id";
    public static final String COLUMN_CLASSNAME = "Classname";
    public static final String COLUMN_USERNAME = "Username";
    public static final String COLUMN_PASSWORD = "Password";
    public static final String COLUMN_CLASSID = "Classid";
    public static final String COLUMN_USERID = "Userid";
    public static final String COLUMN_DATE = "Date";



    public static Connection connect(){

        Connection connect = null;

        String url = "jdbc:sqlite:src/main/resources/database/Attendance.db";

        try {
            connect = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connect;
    }


    public static int getUserIdFromUser(Connection connection, String nameuser) {
        String query = "SELECT * FROM "+ TABLE_USER + " WHERE " + COLUMN_USERNAME + " = " + nameuser;
        List<ModelUser> modelUser = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

                while(resultSet.next()){
                int id = resultSet.getInt(COLUMN_ID);

                 ModelUser modelUser1 = new ModelUser(id,"","","");
                modelUsers.add(modelUser1);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return modelUsers.get(0).getId();
    }

    public List<ModelBooks> getAllClass(Connection conn,String names){

        String query = "SELECT * FROM "+ TABLE_CLASS + " WHERE "+COLUMN_NAME + " like %" + names + "%";

        List<ModelClass> modelClass = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                int id = resultSet.getInt(COLUMN_ID);
                String Classname = resultSet.getString(COLUMN_CLASSNAME);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return modelClass;

    }


    public static List<ModelClass> getClassFilter(Connection conn,int active){

        String query = "SELECT * FROM "+ TABLE_CLASS + " WHERE " + COLUMN_Active + " = " + active;
        List<ModelClass> modelBooks = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                int id = resultSet.getInt(COLUMN_ID);
                String Classname = resultSet.getString(COLUMN_CLASSNAME);

                ModelClass modelClass1 = new ModelClass(Id,Classname);
                modelBooks.add(modelBooks1);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return modelBooks;
    }


    public static void addUser(ModelUser modeUser, Connection connection){

        String sql = "INSERT INTO " + TABLE_USERS + "("+ COLUMN_ID + "," + COLUMN_USERNAME + "," + COLUMN_PASSWORD +") " +
                "VALUES(?,?,?)";

//        insert into tableName (name,contact,email) values("RAM",984321651,p@gmail.com)
        try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, modeUser.getUsername());
            pstmt.setString(2, modeUser.getPassword());
            pstmt.executeUpdate();

            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public static void addClass (ModelClass modelclass, Connection connection){

        String sql = "INSERT INTO lending (Id,Classname), values(?,?)";

//        insert into tableName (name,contact,email) values("RAM",984321651,p@gmail.com)
        try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, modelLend.getId());
            pstmt.setString(2, modelLend.getClassname());
            pstmt.executeUpdate();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
