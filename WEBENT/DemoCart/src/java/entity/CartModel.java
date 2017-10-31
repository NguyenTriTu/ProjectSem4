/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author Apple
 */
public class CartModel {
    ArrayList<BookCart> list=null;
    public CartModel()
    {
        list=new  ArrayList<BookCart>();
    }
    
    public int getSize(){
       return list.size();
    }
    
    public void addItem(BookCart b)
    {
        if(findByID(b.getId())!=null){
            BookCart b1=findByID(b.getId());
            b1.setQuantity(b1.getQuantity()+1);
        }
            else
        {
               list.add(b);
        }
    }
    public void deleteItem(String id)
    {
        list.remove(findByID(id));
    }
    public void updateCart(int index, int quantity)
    {
        if(quantity>0){
        list.get(index).setQuantity(quantity);
        }
        else
        {}
    }
    public ArrayList<BookCart> getContent()
    {
        return list;
    }
    private BookCart findByID(String id) {      
        BookCart b=null;
        for(BookCart temp : list)
        {
            if(temp.getId().equals(id))
                return temp;
        }
        return b;
    }
}
