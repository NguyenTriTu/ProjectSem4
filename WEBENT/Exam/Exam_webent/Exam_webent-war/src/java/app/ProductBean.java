/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Apple
 */
public class ProductBean {

    @EJB
    private ProductFacade productFacade;
    private int prodId;
    private String prodName;
    private double prodPrice;
    private int prodQuantity;

    private List<Product> items;

    /**
     * Creates a new instance of ProductBean
     */
    public ProductBean() {
    }

    public String insertProd() {
        Product prod = new Product();
        prod.setProdID(prodId);
        prod.setProdName(prodName);
        prod.setProdPrice(prodPrice);
        prod.setProdQuantity(prodQuantity);
        productFacade.create(prod);
        return "success";
    }

    public ProductFacade getProductFacade() {
        return productFacade;
    }

    public void setProductFacade(ProductFacade productFacade) {
        this.productFacade = productFacade;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdQuantity() {
        return prodQuantity;
    }

    public void setProdQuantity(int prodQuantity) {
        this.prodQuantity = prodQuantity;
    }

    public List<Product> getItems() {
        items = productFacade.viewAll();
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }
    /**
     * Creates a new instance of ProductBean
     */

}
