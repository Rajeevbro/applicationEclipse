package com.eclipseTest.applicationEclipse.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ProductDto {
	// This is the example of dto
private String productName;
	
	private Integer productQuantity;
	
	private String supplierName;
	

}
