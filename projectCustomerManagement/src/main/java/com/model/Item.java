package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private int itemid;
	private String description;
	private int price;
	
	public Item() {
		super();
	}

	public Item(int itemid, String description, int price) {
		super();
		this.itemid = itemid;
		this.description = description;
		this.price = price;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
