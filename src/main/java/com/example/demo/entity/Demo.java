package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "demo")
public class Demo {

	
	@Id
	private Long Id;
	
	private int categoryCode;
	private int value;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public int getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Demo(int categoryCode, int value) {
		super();
		this.categoryCode = categoryCode;
		this.value = value;
	}
	
	
}
