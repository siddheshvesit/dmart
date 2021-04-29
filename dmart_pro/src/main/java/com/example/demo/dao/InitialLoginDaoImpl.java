package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.pojo.Initallogin;
import com.example.demo.query.Querys;

@Component
public class InitialLoginDaoImpl implements InitialLoginDao{
	@Autowired
	JdbcTemplate jdbctemp;
	rowmapper rw=new rowmapper();
	Querys query=new Querys();
	

	@Override
	public List getinitalLoginCredentials() {
		// TODO Auto-generated method stub
		System.out.println("hey");
		System.out.println(jdbctemp.query(query.getInitialLoginCredentials,rw));
		return jdbctemp.query(query.getInitialLoginCredentials,rw);
		
	}


	@Override
	public int checkPhoneNumber(int phoneNumber) {
		System.out.println("insisde checkphonenumber dao impl");
		// TODO Auto-generated method stub
		int flag=1;
		List temp=jdbctemp.query(query.checkPhoneNumber,rw,phoneNumber);
		if(temp.isEmpty())
		{
			flag=0;
		} 
		else 
		{
			flag=1;
		}
		System.out.println(flag);
		return flag;
	}

}
class rowmapper  implements RowMapper<Initallogin>
{

	@Override
	public Initallogin mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Initallogin ilogin=new Initallogin();
		ilogin.setuId(rs.getInt(1));
		ilogin.setPhoneNumber(rs.getInt(2));
		return ilogin;
	}
	
}