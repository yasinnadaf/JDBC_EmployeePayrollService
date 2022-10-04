package com.bridgelabz;

import java.sql.*;
import java.util.Enumeration;

public class JDBCConnection {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/payroll_service";
        String USER = "root";
        String PASS = "Yasin@786";

        Connection connection;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find the driver in ths classpath");
        }

        listDrivers();

        System.out.println("Connecting to Database" + URL);
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connection is Successful" + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        private static void listDrivers() {
            Enumeration<Driver> driverList = DriverManager.getDrivers();
            while (driverList.hasMoreElements()) {
                Driver driverClass = driverList.nextElement();
                System.out.println(" " + driverClass.getClass().getName());
            }

        }
}
