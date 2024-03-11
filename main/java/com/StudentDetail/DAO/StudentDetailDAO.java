package com.StudentDetail.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentDetail.Entity.StudentDetailEntity;
import com.StudentDetail.Respoistory.StudentDetailRespoistory;

@Repository
public class StudentDetailDAO {
	@Autowired
	StudentDetailRespoistory sr;
	public String post(StudentDetailEntity s) {
		sr.save(s);
		return "Success";
	}
	 public List<StudentDetailEntity> get(){
		 return sr.findAll();
	 }
	 public Optional<StudentDetailEntity> getid(int id){
		 return sr.findById(id);
	 }
	 public String delete(int id){
		  sr.deleteById(id);
		  return "Success";
	 }
	

}
