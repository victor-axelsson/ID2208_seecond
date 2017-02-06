package se.kth.webservice.second.data;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.Random;

/**
 * Created by victoraxelsson on 2017-02-06.
 */
public abstract class Database {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:8889/flights";
    private static final String USER = "root";
    private static final String PASS = "root";
    Connection connection;
    Random rand;

    public Database(){
        rand = new Random();
    }

    protected int getRandomInt(int low, int high){
        return rand.nextInt(high-low) + low;
    }



    protected String doHash(String src){
        MessageDigest md = null;
        String hashed = "SoucePan";
        try {
            md = MessageDigest.getInstance("MD5");
            md.reset();
            md.update(src.getBytes());
            byte[] digest = md.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            hashed = bigInt.toString(16);

            while (hashed.length() < 32){
                hashed = "0" + hashed;
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return hashed;
    }


    protected Connection getConnection(){

        if(connection == null){
            try {
                Class.forName(JDBC_DRIVER).newInstance();
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return connection;
    }

    protected Statement getStatement(){
        Statement stmt = null;
        try {
            connection = getConnection();
            stmt = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stmt;
    }

    protected PreparedStatement getPreparedStatement(String sql){
        connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return preparedStatement;
    }

    protected void safeCloseConnection(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
