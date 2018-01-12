/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import entity.Book;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import model.DataProcess;

/**
 *
 * @author Apple
 */
public class ViewAction extends ActionSupport {

    private String path = "src//data//Data.xml";
    private ArrayList<Book> items;

    public ViewAction() {
    }

    public String execute() throws Exception {
        return "success";
    }

    public ArrayList<Book> getItems() {
        items = DataProcess.unma(path);
        return items;
    }

    public void setItems(ArrayList<Book> items) {
        this.items = items;
    }

}
