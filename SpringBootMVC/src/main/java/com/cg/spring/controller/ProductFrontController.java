package com.cg.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.beans.Product;

@RestController
public class ProductFrontController {

	@RequestMapping("/showall") //products/{id}
	public ModelAndView getProduct()  //@PathVariable
	{
		RestTemplate rt=new RestTemplate();
		List<Product> p=rt.getForObject("http://localhost:8085/getproducts",ArrayList.class);
		return new ModelAndView("ProductList","emps",p);
	}
	
	@RequestMapping(value="/invoice", method=RequestMethod.GET)
	public ModelAndView getAllEmployees()
	{
		RestTemplate rt=new RestTemplate();
		List<Product> p=rt.getForObject("http://localhost:8085/getproducts",ArrayList.class);
		return new ModelAndView("invoice1","emps",p);
	}
}

