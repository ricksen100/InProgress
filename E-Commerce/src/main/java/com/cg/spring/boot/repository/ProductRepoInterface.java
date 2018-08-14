package com.cg.spring.boot.repository;

import java.util.List;

import com.cg.spring.boot.beans.Product;


public interface ProductRepoInterface {
	public List<Product> showProducts();
	public List<Product> showInvoice();

}
