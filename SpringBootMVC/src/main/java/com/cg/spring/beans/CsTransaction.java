package com.cg.spring.beans;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Date;


public class CsTransaction {

	
	private int id;
	private String type;
	private int order;
	private int transactionid;
	private int transactiontype;
	private float transactionamount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public int getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(int transactiontype) {
		this.transactiontype = transactiontype;
	}
	public float getTransactionamount() {
		return transactionamount;
	}
	public void setTransactionamount(float transactionamount) {
		this.transactionamount = transactionamount;
	}
	
	public CsTransaction()
	{
		
	}
	
	public CsTransaction(int id, String type, int order, int transactionid, int transactiontype,
			float transactionamount) {
		super();
		this.id = id;
		this.type = type;
		this.order = order;
		this.transactionid = transactionid;
		this.transactiontype = transactiontype;
		this.transactionamount = transactionamount;
	}
	@Override
	public String toString() {
		return "CsTransaction [id=" + id + ", type=" + type + ", order=" + order + ", transactionid=" + transactionid
				+ ", transactiontype=" + transactiontype + ", transactionamount=" + transactionamount + "]";
	}
	
}
