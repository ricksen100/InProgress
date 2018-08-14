package com.cg.spring.beans;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Date;


public class Coupon {

	
		
		private int couponid;
		private float discount;
		private Date expirydt;
		private int merchantid;
		private int customerid;
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
