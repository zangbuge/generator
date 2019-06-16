package com.greedystar.generator.buildModel;

import java.io.Serializable;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Author lhm
 * Date  2019-06-07
 */
public class ProductInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private int productStock;
    private String productDescription;
    private String productIcon;
    private byte productStatus;
    private int categoryType;
    private Timestamp createTime;
    private Timestamp updateTime;


    public ProductInfo(){
    }

    public void setProductId (String productId) {this.productId = productId;} 
    public String getProductId(){ return productId;} 
    public void setProductName (String productName) {this.productName = productName;} 
    public String getProductName(){ return productName;} 
    public void setProductPrice (BigDecimal productPrice) {this.productPrice = productPrice;} 
    public BigDecimal getProductPrice(){ return productPrice;} 
    public void setProductStock (int productStock) {this.productStock = productStock;} 
    public int getProductStock(){ return productStock;} 
    public void setProductDescription (String productDescription) {this.productDescription = productDescription;} 
    public String getProductDescription(){ return productDescription;} 
    public void setProductIcon (String productIcon) {this.productIcon = productIcon;} 
    public String getProductIcon(){ return productIcon;} 
    public void setProductStatus (byte productStatus) {this.productStatus = productStatus;} 
    public byte isProductStatus(){ return productStatus;} 
    public void setCategoryType (int categoryType) {this.categoryType = categoryType;} 
    public int getCategoryType(){ return categoryType;} 
    public void setCreateTime (Timestamp createTime) {this.createTime = createTime;} 
    public Timestamp getCreateTime(){ return createTime;} 
    public void setUpdateTime (Timestamp updateTime) {this.updateTime = updateTime;} 
    public Timestamp getUpdateTime(){ return updateTime;} 

}