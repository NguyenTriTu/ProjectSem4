/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

    public ArrayList getData() {
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
                NewBook.setDateTime(rs.getString(5));
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

    public boolean addItem(String title, float price, String description, String dateTime, String image) throws SQLException {
        int result = 0;
        Connection con = null;
        PreparedStatement prmst = null;
        PreparedStatement prmst1 = null;
        try {
            con = getConnection();
            String sql = "INSERT INTO tblBook values(?,?,?,?,?)";
            String sql1 = "INSERT INTO tblBook values(?,?,?,?,?)";
            con.setAutoCommit(false);
            prmst = con.prepareStatement(sql);
            prmst.setString(1, title);
            prmst.setFloat(2, price);
            prmst.setString(3, description);
            prmst.setString(4, dateTime);
            prmst.setString(5, image);
            result = prmst.executeUpdate();
            prmst1 = con.prepareStatement(sql1);
            prmst1.setString(1, title);
        //  prmst1.setString(2, title); error tại đây
            prmst1.setFloat(2, price);
            prmst1.setString(3, description);
            prmst1.setString(4, dateTime);
            prmst1.setString(5, image);
            prmst1.executeUpdate();
            con.commit();
            System.out.println("Done!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            if (con != null) {
                try {
                    System.err.print("Transaction is being rolled back");
                    con.rollback();
                } catch (SQLException excep) {
                    System.out.println(excep.getMessage());
                }
            }
        } finally {
            if (prmst != null) {
                prmst.close();
            }
            con.setAutoCommit(true);
            con.close();
        }
        return result > 0;
    }

    public boolean deleteItem(int bookId) {
        String sql = "DELETE FROM tblBook WHERE _bookId=" + bookId;
        int result = 0;
        try {
            Statement stm = getConnection().createStatement();
            result = stm.executeUpdate(sql);
            stm.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public Book editBook(int bookId) {
        Book book = new Book();
        String sql = "Select * from tblBook WHERE _bookId=" + bookId;
        try {
            Statement prst = getConnection().createStatement();
            ResultSet rs = prst.executeQuery(sql);
            while (rs.next()) {
                //Book NewBook = new Book();
                book.setBookId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setPrice(rs.getFloat(3));
                book.setDescription(rs.getString(4));
                book.setDateTime(rs.getString(5));
                book.setImage(rs.getString(6));
            }
            rs.close();
            prst.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }

    public boolean updateItem(int bookID, String title, float price, String description, String dateTime, String image) {
        String sql = "UPDATE tblBook SET _title=?,_price=?,_description=?,_dateTime=?,_image=? Where _bookID=?";
        int result = 0;
        try {
            PreparedStatement prmst = getConnection().prepareStatement(sql);
            prmst.setString(1, title);
            prmst.setFloat(2, price);
            prmst.setString(3, description);
            prmst.setString(4, dateTime);
            prmst.setString(5, image);
            prmst.setInt(6, bookID);
            result = prmst.executeUpdate();
            prmst.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
}
