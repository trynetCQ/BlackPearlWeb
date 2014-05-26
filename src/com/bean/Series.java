package com.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Series implements Serializable {

	private static final long serialVersionUID = -3088499825498688563L;
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