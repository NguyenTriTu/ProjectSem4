/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Apple
 */
public class DataProcess {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String user = "sa";
        String pass = "123456";
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=LoginMVC";
        conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }

    public ArrayList<Book> getData() {
        ArrayList lstbook = new ArrayList();
        String sql = "Select * from tblBook";
        try {
            Statement prst = getConnection().createStatement();
            ResultSet rs = prst.executeQuery(sql);
            while (rs.next()) {
                Book NewBook = new Book();
                NewBook.setBookId(rs.getInt(1));
                NewBook.setTitle(rs.getString(2));
                NewBook.setPrice(rs.getFloat(3));
                NewBook.setDescription(rs.getString(4));
                NewBook.setDatetime(rs.getString(5));
                NewBook.setImage(rs.getString(6));
                lstbook.add(NewBook);
            }
            rs.close();
            prst.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstbook;
    }

}
