package com.demo.model;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
import com.demo.config.AESEncryptor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	@Convert(converter = AESEncryptor.class)
	private String fullName;
	
	@Convert(converter = AESEncryptor.class)
	private String email;
	
	@Convert(converter = AESEncryptor.class)
	private String contact;
	
	//comment new
	private String address;
	
	private String location;
	

}
