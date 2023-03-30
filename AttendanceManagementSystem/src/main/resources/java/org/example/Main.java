package org.example;

import org.example.models.ModelClass;
import org.example.models.ModelAttendance;
import org.example.models.ModelUser;

import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Connection connection = DbHandler.connect();

        String Username;
        String Password;


        List<ModelClass> myclass = DbHandler.getClassFilter();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter UserName");
        userName = scanner.nextLine();
        System.out.println("Enter Password");
        email = scanner.nextLine();



        ModelUsers modelUser = new ModelUser(-1,Username,Password);

        DbHandler.addUser(modelUser,connection);

        String date = new Date().toString();

        int userId = DbHandler.getUserIdFromUser(connection,"Anim");


        System.out.println(userId);

    }
}