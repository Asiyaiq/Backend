package com.manager.demo1.modal;

import jakarta.persistence.*;

@Entity
// we are creating table 
@Table(name = "customers")
public class Member {

//  we are a cerating  colonms of table 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "productname")
	private String productname;

	@Column(name = "price")
	private long price;

	@Column(name = "address")
	private String address;

	@Column(name = "email")
	private String email;

	@Column(name = "phonenumber")
	private long phonenumber;

	@Column(name = "zipcode")
	private long zipcode;

	public Member() {

	}

	public Member(String name, String productname, long phone, long price, String address, String email,
			long phonenumber, long zipcode) {
		super();

		this.name = name;
		this.productname = productname;
		this.price = price;
		this.address = address;
		this.email = email;
		this.phonenumber = phonenumber;
		this.zipcode = zipcode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	

}
