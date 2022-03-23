package com.harman.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","");
            Scanner input = new Scanner(System.in);
            String name, rollno, admndno, college;
            System.out.println("Enter the name");
            name = input.next();
            System.out.println("Enter the roll number");
            rollno = input.next();
            System.out.println("Enter the admnd number");
            admndno = input.next();
            System.out.println("Enter college name");
            college = input.next();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("INSERT INTO `student`(`name`, `rollno`, `admndno`, `college`) " +
                    "VALUES('"+name+"',"+rollno+","+admndno+",'"+college+"')");
            System.out.println();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



