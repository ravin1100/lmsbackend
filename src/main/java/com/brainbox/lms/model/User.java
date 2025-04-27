package com.brainbox.lms.model;

import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, updatable = false)
	private String uid = UUID.randomUUID().toString();
	
	private String username;
	
	private String mobileNumber;
	
	private String email;
	
	private Timestamp createdAt;
	
}
