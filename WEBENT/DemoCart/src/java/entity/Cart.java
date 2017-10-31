/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Hashtable;

/**
 *
 * @author Apple
 */
public class Cart {
    private Hashtable content;
    public Hashtable getContent()
    {
        return content;
    }

    public void setContent(Hashtable content) {
        this.content = content;
    }
    
    public void addItem(String id)
    {
        if(content==null) //gio hang chua exist
        {
            content = new Hashtable();
            content.put(id, "1");          
        }else // gio hang da co
        {
            if(!content.containsKey(id)) // san pham chua exist trong cart
            {
                content.put(id, "1");
            }else // san pham da co trong gio hang
            {
                String temp = content.get(id).toString();
                int current = Integer.parseInt(temp);
                current++;
                content.remove(id);
                content.put(id, String.valueOf(current));              
            }
        }
        
    }
    
}
