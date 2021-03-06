/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import app.demo;
import entity.Book;
import entity.ListBook;
import java.io.File;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Apple
 */
public class DataProcess {

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String user = "sa";
        String pass = "123456";
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=LoginMVC";
        conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }

    public static boolean checkLogin(String _u, String _p) {
        boolean f = false;
        String sql = "Select * from tblUser Where _username=? and _password=?";
        try {
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, _u);
            prst.setString(2, _p);
            ResultSet rs = prst.executeQuery(); // tap ket qua
            f = rs.next();
            rs.close();
            prst.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }

    public static ArrayList<Book> getData() {
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstbook;
    }

    public boolean deleteBook(String id) {
        int result = 0;
        String sql = "DELETE FROM tblBook where _bookId=?";
        try {
            PreparedStatement prst = getConnection().prepareCall(sql);
            prst.setString(1, id);
            result = prst.executeUpdate();// so luong row da duoc su ly
            prst.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }

    public boolean upDate(String id, String title, String price, String description,
            String dateTime, String image) {

        int resutl = 0;
        String sql = "UPDATE tblBook SET _title=?,_price=?,_description=?,"
                + "_dateTime=?,_image=? WHERE _bookId=?";
        try {
            PreparedStatement prst = getConnection().prepareCall(sql);
            prst.setString(1, title);
            prst.setString(2, price);
            prst.setString(3, description);
            prst.setString(4, dateTime);
            prst.setString(5, image);
            prst.setString(6, id);
            resutl = prst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resutl > 0;
    }

    public Book getByID(String id) {
        Book nBook = null;
        String sql = "Select * from tblBook where _bookId='" + id + "'";
        try {
            Statement prst = getConnection().createStatement();
            ResultSet rs = prst.executeQuery(sql);
            while (rs.next()) {
                nBook = new Book();
                nBook.setBookId(rs.getInt(1));
                nBook.setTitle(rs.getString(2));
                nBook.setPrice(rs.getFloat(3));
                nBook.setDescription(rs.getString(4));
                nBook.setDateTime(rs.getString(5));
                nBook.setImage(rs.getString(6));
            }
            rs.close();
            prst.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nBook;
    }

    public static ArrayList<Book> unma(String path) {
        ArrayList<Book> list = new ArrayList<>();
        try {
            JAXBContext jaxBContext = JAXBContext.newInstance(ListBook.class);
            Unmarshaller jaxbUmar = jaxBContext.createUnmarshaller();
            ListBook books = (ListBook) jaxbUmar.unmarshal(new File(path));
            for (Book book : books.getBooks()) {
                System.out.println("Id" + book.getBookId());
                list.add(book);
            }
        } catch (JAXBException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return list;
    }
}
