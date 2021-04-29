package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.InitialLoginDao;

@Component
public class initialloginserviceimpl implements initialLoginService {
	@Autowired
	InitialLoginDao initiallogindao;
	@Override
	public List getinitalLoginCredential() {
		// TODO Auto-generated method stub
	
		return initiallogindao.getinitalLoginCredentials();
		
	}
	@Override
	public int checkPhoneNumber(int phoneNumber) {
		// TODO Auto-generated method stub
		
		return initiallogindao.checkPhoneNumber(phoneNumber);
	}

}
