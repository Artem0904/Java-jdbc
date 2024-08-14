package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String URL = "jdbc:postgresql://ep-little-voice-a5zcydzn.us-east-2.aws.neon.tech:5432/artemdb";
    private static final String USER = "artemdb_owner";
    private static final String PASSWORD = "TiZtIB09fjdm";

    private static Connection connection;

    public static void main(String[] args) throws SQLException {
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(Exception ex){
            System.out.printf("Error connection: %d", ex);
        }finally {
            if(connection != null)
                connection.close();
        }




    }
}