package com.globallogic.SpringDemo.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.globallogic.SpringDemo.POJO.Student;

public class StudentDaoimpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String query = "insert into student_ info(id,name,city) values(?,?,?)";
		int result=this.jdbcTemplate.update(query, student.getId(),student.getName(),student.getCity());
		return result;
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	

}
