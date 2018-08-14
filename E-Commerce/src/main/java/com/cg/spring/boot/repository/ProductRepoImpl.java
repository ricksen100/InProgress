package com.cg.spring.boot.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.beans.Product;

@Repository


public class ProductRepoImpl implements ProductRepoInterface{
	@Autowired
	@PersistenceContext
    EntityManager entityManager; 
	
	@Override
	public List<Product> showProducts() {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<>();
		Query q=entityManager.createQuery("from Product");
		list=q.getResultList();
		return list;
	}

	@Override
	public List<Product> showInvoice() {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<>();
		Query q=entityManager.createQuery("from Product");
		list=q.getResultList();
		return list;
	}

}
