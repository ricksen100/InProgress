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
public class CsTransaction {

	@Id
	@Column(name="p_id")
	private int id;
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "p_type")
	@Column(name="p_type")
	private String type;
	@Column(name="o_no")
	private int order;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transactionid;
	@Column(name="t_type")
	private int transactiontype;
	@Column(name="t_amount")
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
