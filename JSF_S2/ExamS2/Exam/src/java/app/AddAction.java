/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import entity.FormCreate;
import java.util.ArrayList;

/**
 *
 * @author Apple
 */
public class AddAction extends ActionSupport {

    private String date;
    private String time;
    private String plan;
    private String where;
    private String info;
    private ArrayList<FormCreate> items;

    public AddAction() {
    }

    public String execute() throws Exception {
        FormCreate form = new FormCreate();
        form.setDate(date);
        form.setPlan(plan);
        form.setTime(time);
        form.setWhere(where);
        form.setInfo(info);
        items.add(form);
        return "success";
    }

    public void validate() {
        if (getDate().length() == 0) {
            addFieldError("Dien vao di", "????");
        }
        if (getPlan().length() == 0) {
            addFieldError("Dien vao di", "????");
        }
        if (getTime().length() == 0) {
            addFieldError("Dien vao di", "????");
        }
    }

    public ArrayList<FormCreate> getItems() {
        return items;
    }

    public void setItems(ArrayList<FormCreate> items) {
        this.items = items;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
