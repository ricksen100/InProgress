package com.cg.spring.boot.beans;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Coupon {

	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int couponid;
		@Column(name="discount")
		private float discount;
		@Column(name="expiry_date")
		private Date expirydt;
		@Column(name="m_id")
		private int merchantid;
		@Column(name="c_id")
		private int customerid;
		//@OneToOne(cascade = CascadeType.ALL)
		//@JoinColumn(name = "p_type")
		@Column(name="p_type")
		private String type;
		
		public int getCouponid() {
			return couponid;
		}
		public void setCouponid(int couponid) {
			this.couponid = couponid;
		}
		public float getDiscount() {
			return discount;
		}
		public void setDiscount(float discount) {
			this.discount = discount;
		}
		public Date getExpirydt() {
			return expirydt;
		}
		public void setExpirydt(Date expirydt) {
			this.expirydt = expirydt;
		}
		public int getMerchantid() {
			return merchantid;
		}
		public void setMerchantid(int merchantid) {
			this.merchantid = merchantid;
		}
		public int getCustomerid() {
			return customerid;
		}
		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		public Coupon(int couponid, float discount, Date expirydt, int merchantid, int customerid, String type,
				int quantity) {
			super();
			this.couponid = couponid;
			this.discount = discount;
			this.expirydt = expirydt;
			this.merchantid = merchantid;
			this.customerid = customerid;
			this.type = type;
			
		}
	
		Coupon()
		{
		}
		@Override
		public String toString() {
			return "Coupon [couponid=" + couponid + ", discount=" + discount + ", expirydt=" + expirydt
					+ ", merchantid=" + merchantid + ", customerid=" + customerid + ", type=" + type + "]";
		}
		

}
