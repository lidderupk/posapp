
package in.poshost.posapp.model;

import java.io.Serializable;

import com.activeandroid.annotation.Column;

public class Transaction implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -4730307012985714066L;
    
    @Column(name="uid")
    private long uid;
    
    @Column(name="name")
    private String name;
    
    @Column(name="desc")
    private String desc;
    
    @Column(name="createdAt")
    private String createdAt;
    
    @Column(name="picUrl")
    private String picUrl;
    
    @Column(name="price")
    private double price;
    
    @Column(name="quantity")
    private int quantity;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String pic) {
        this.picUrl = pic;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Transaction: " + uid;
    }
}
