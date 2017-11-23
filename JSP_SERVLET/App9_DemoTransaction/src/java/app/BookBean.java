/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.Book;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import model.DataProcess;

/**
 *
 * @author Apple
 */
public class BookBean {

    private int bookId;
    private String title;
    private float price;
    private String description;
    private String dateTime;
    private String image;

    private ArrayList items;

    /**
     * Creates a new instance of BookBean
     */
    public BookBean() {
        DataProcess dt = new DataProcess();
        this.items = dt.getData();
        this.dateTime = LocalDateTime.now().toString();
    }

    public String upDate() {
    DataProcess dt = new DataProcess();
        if (dt.updateItem(bookId,title, price, description, dateTime, image)) {
            this.items = dt.getData();
            return "updated";
        } else {
            return "false";
        }
    }
    public String editBook(int _bookId) {
        DataProcess dt = new DataProcess();
        Book book = dt.editBook(_bookId);
        bookId = book.getBookId();
        title = book.getTitle();
        price = book.getPrice();
        description = book.getDescription();
        dateTime = book.getDateTime();
        image = book.getImage();
        return "edited";
    }

    public String insertBook() {
        DataProcess dt = new DataProcess();
        if (dt.addItem(title, price, description, dateTime, image)) {
            this.items = dt.getData();
            return "success";
        } else {
            return "false";
        }
    }

    public String deleteBook(int _bookId) {
        DataProcess dt = new DataProcess();
        if (dt.deleteItem(_bookId)) {
            this.items = dt.getData();
            return "success";
        } else {
            return "false";
        }
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

}
