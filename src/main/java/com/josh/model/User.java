package com.josh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;//Primary key for User table.
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private String contact;
	private String ssn;


	

}
