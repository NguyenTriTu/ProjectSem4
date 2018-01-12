/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.*;
import javax.xml.bind.annotation.*;

/**
 *
 * @author Apple
 */
public class Book {

    private int bookId;
    private String title;
    private float price;
    private String description;
    private String dateTime;
    private String image;

    public Book() {
    }

    public Book(int bookId, String title, float price, String description, String dateTime, String image) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.description = description;
        this.dateTime = dateTime;
        this.image = image;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getImage() {
        return image;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
