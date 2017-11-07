/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.Book;
import java.util.*;
import model.DataProcess;

/**
 *
 * @author Apple
 */
public class MyClass {

    public static List<Book> show(String title) {
        DataProcess dt = new DataProcess();
        ArrayList<Book> list = new ArrayList();
        list = dt.getData();
        List lstShow = new ArrayList();
        for (Book i : list) {
            if (i.getTitle().contains(title)) {
                lstShow.add(i);
            }
        }
        return lstShow;
    }
}
