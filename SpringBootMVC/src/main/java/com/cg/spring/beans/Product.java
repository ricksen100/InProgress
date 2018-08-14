package com.cg.spring.beans;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Date;

public class Product {

	private int id;
	private String name;
	private String companyname;
	private Blob image;
	private BigDecimal price;
	private Date dateofmanufacturing;
	private String type;
	private int merchantid;
	private int couponid;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDateofmanufacturing() {
		return dateofmanufacturing;
	}
	public void setDateofmanufacturing(Date dateofmanufacturing) {
		this.dateofmanufacturing = dateofmanufacturing;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMerchantid() {
		return merchantid;
	}
	public void setMerchantid(int merchantid) {
		this.merchantid = merchantid;
	}
	public int getCouponid() {
		return couponid;
	}
	public void setCouponid(int couponid) {
		this.couponid = couponid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	Product()
	{
		
	}
	public Product(int id, String name, String companyname, Blob image, BigDecimal price, Date dateofmanufacturing,
			String type, int merchantid, int couponid, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.companyname = companyname;
		this.image = image;
		this.price = price;
		this.dateofmanufacturing = dateofmanufacturing;
		this.type = type;
		this.merchantid = merchantid;
		this.couponid = couponid;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", companyname=" + companyname + ", image=" + image + ", price="
				+ price + ", dateofmanufacturing=" + dateofmanufacturing + ", type=" + type + ", merchantid="
				+ merchantid + ", couponid=" + couponid + ", quantity=" + quantity + "]";
	}
	
	
}
