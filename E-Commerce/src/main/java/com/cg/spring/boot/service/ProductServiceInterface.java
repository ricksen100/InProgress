package com.cg.spring.boot.service;

import java.util.List;
import java.util.Optional;

import com.cg.spring.boot.beans.Product;

public interface ProductServiceInterface 
{
   public List<Product> showProducts();
   public List<Product> showInvoice();
}

