package com.StudentDetail.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentDetail.DAO.StudentDetailDAO;
import com.StudentDetail.Entity.StudentDetailEntity;
import com.StudentDetail.Exception.NumberException;

@Service

public class StudentDetailService {
	@Autowired
	StudentDetailDAO sd;
	
	public String post(StudentDetailEntity s) throws NumberException {
		if(s.getAge()>18) {
			return sd.post(s);
		}
		else {
			throw new NumberException("It not correct");
		}
	}
	
	public List<StudentDetailEntity> get(){
		return sd.get();
	}
	public Optional<StudentDetailEntity>getid(int id){
		return sd.getid(id);
	}
		
    public String delete(int id){
    	return sd.delete(id);
    }
   

}
