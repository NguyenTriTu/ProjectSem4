/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import dao.BookDAO;
import entity.Book;
import java.util.ArrayList;

/**
 *
 * @author Apple
 */
public class ViewAction extends ActionSupport {
    
    private ArrayList<Book> items;
    
    public ViewAction() {
    }
    
    public String execute() throws Exception {
        return "success";
    }

    public ArrayList<Book> getItems() {
        
        return items = new BookDAO().getBook();
    }

    public void setItems(ArrayList<Book> items) {
        this.items = items;
    }
    
}
