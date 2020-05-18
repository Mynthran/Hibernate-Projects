package com.oara.org.dto;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name = "restaurant")
public class Restaurant implements Serializable
{
	@Id
	@Column(name = "name")
	private String name;
	@Column(name = "menu")
	private String menu;
	@Column(name = "price")
	private double price;
	@Column(name = "address")
	private String address;
	@Column(name = "contact")
	private long contact;
	
	public Restaurant()
	{
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", menu=" + menu + ", price=" + price + ", address=" + address
				+ ", contact=" + contact + "]";
	}
	
	
}
