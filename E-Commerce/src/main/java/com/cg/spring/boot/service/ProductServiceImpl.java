package com.cg.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.beans.Product;
import com.cg.spring.boot.repository.ProductRepoInterface;

@Service
public class ProductServiceImpl implements ProductServiceInterface {

	@Autowired
	private ProductRepoInterface repo;

	@Override
	public List<Product> showProducts() {
		// TODO Auto-generated method stub
		return repo.showProducts();
	}

	@Override
	public List<Product> showInvoice() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
