package com.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class ProductType implements Serializable {

	private static final long serialVersionUID = -5913214237088089880L;
	private Integer id;
	private String name;
	private Set<Product> products = new HashSet<Product>();

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}