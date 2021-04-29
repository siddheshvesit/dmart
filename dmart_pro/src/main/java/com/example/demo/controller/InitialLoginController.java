package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.initialLoginService;

@RestController
@RequestMapping(value="/home")
public class InitialLoginController {
	@Autowired
	initialLoginService initialloginserv;
	@RequestMapping(value="/getallinitiallogins")
	public List getinitalLoginCredential() {
		System.out.println("in controller");
		
		return initialloginserv.getinitalLoginCredential();
		
	}
	@RequestMapping(value="/checkphonenumber/{phoneno}")
	public String checkPhoneNumber(@PathVariable("phoneno")  int phoneNumber)
	{
		System.out.println("insisde checkphonenumber controller");
		System.out.println(phoneNumber);
		if(initialloginserv.checkPhoneNumber(phoneNumber)==1)
		{
			return("phn no is not availabel");
		}
		else {
			return("phone number is availabel");
		}
		
	}

}
