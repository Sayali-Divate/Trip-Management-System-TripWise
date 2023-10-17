package com.tripwise.demo.model;

import lombok.Data;

@Data
public class Package {

	private Integer packageId;
	private String packageName;
	private String packageDescription;
	private Double packageCost;
	
}
