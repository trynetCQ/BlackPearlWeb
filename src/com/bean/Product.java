package com.bean;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 6267660123604765777L;
	private Integer id;
	private String name;
	private Series series;
	private ProductType productType;
	private Effect effect;
	private String useage;
	private String introduction;
	private String qualityLife;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private Integer with1;
	private Integer with2;
	private Integer with3;

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

	public Series getSeries() {
		return this.series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public ProductType getProductType() {
		return this.productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public Effect getEffect() {
		return this.effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}

	public String getUseage() {
		return this.useage;
	}

	public void setUseage(String useage) {
		this.useage = useage;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getQualityLife() {
		return this.qualityLife;
	}

	public void setQualityLife(String qualityLife) {
		this.qualityLife = qualityLife;
	}

	public String getImage1() {
		return this.image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return this.image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return this.image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return this.image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public Integer getWith1() {
		return this.with1;
	}

	public void setWith1(Integer with1) {
		this.with1 = with1;
	}

	public Integer getWith2() {
		return this.with2;
	}

	public void setWith2(Integer with2) {
		this.with2 = with2;
	}

	public Integer getWith3() {
		return this.with3;
	}

	public void setWith3(Integer with3) {
		this.with3 = with3;
	}

}