package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javassist.SerialVersionUID;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable{

    private static final long SerialVersionUID = 1L;

    @Id
    @Column(name = "IDPRODUCT", nullable = false)
    private int idProduct;

    @Column(name = "PRODUCTNAME", nullable = false)
    private String productName;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "ENTRY_DATE")
    private Date entryDate;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "STATUS")
    private byte productStatus;
    
    public Product(){
    }
    
    public Product(int idProduct, String productName, String brand, String category, Date entryDate, double price,
    byte productStatus) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.brand = brand;
        this.category = category;
        this.entryDate = entryDate;
        this.price = price;
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
    return "Product [brand=" + brand + ", category=" + category + ", entryDate=" + entryDate + ", idProduct="
                + idProduct + ", price=" + price + ", productName=" + productName + ", productStatus=" + productStatus
                + "]";
    }
    
    //#region Getter / Setters
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(byte productStatus) {
        this.productStatus = productStatus;
    }
    //#endregion
}
