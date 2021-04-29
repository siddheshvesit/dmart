package com.example.demo.query;

import org.springframework.stereotype.Component;

@Component
public class Querys {
	public String getInitialLoginCredentials="select * from initial_login;";
	public String checkPhoneNumber="select * from initial_login where phone_number=?;";

}
