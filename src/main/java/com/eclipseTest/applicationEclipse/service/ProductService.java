package com.eclipseTest.applicationEclipse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclipseTest.applicationEclipse.dto.ProductDto;
import com.eclipseTest.applicationEclipse.enity.Product;
import com.eclipseTest.applicationEclipse.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {
	
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	
	public String saveProduct(ProductDto productDto)
	{
		
		
		return "success";
	}

}
