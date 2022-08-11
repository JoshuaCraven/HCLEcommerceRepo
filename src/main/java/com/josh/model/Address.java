package com.josh.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
	private int addressId;
	private String city;
	private String state;
	private String street;
	private String zipCode;
	private String country;
	private String apartmentNumber;
	private String userId;

}
