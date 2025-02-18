package com.example.demo.data;

import lombok.Data;

@Data
public class RegisterData {
	private String storeName;
	private String lastName;
	private String firstName;
    private String email;
    private String phone;
    private String password;
}
