/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.Book;
import entity.ListBook;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import model.DataProcess;

/**
 *
 * @author Apple
 */
public class demo {

    public static void main(String[] args) {
        String path = "src//java//data//Data.xml";
        ArrayList<Book> books = DataProcess.unma(path);
        for (Book book : books) {
            System.out.println("ID" + book.getBookId());
        }
    }

}
