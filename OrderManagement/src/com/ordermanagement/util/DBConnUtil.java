package com.ordermanagement.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnUtil {

    public static Properties getProperties() {
        Properties properties = new Properties();
        try (InputStream inputStream = DBConnUtil.class.getClassLoader().getResourceAsStream("jdbc.properties")) {
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Properties properties = getProperties();
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            Class.forName(driver); // Load JDBC driver
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}