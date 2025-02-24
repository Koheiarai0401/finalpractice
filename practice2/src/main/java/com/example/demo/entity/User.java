package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
    @Id
	private String email;
	
    private String username;
    
	private String password;
    
    public String getPassword() {
    	return this.password;
    }
    
    public String getEmail() {
    	return this.email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
