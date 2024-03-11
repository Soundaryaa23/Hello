package com.StudentDetail.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDetail.Entity.StudentDetailEntity;
import com.StudentDetail.Exception.NumberException;
import com.StudentDetail.Service.StudentDetailService;

@RestController
public class StudentDetailController {
	@Autowired
	StudentDetailService ss;
	
	@PostMapping(value="/post")
	public String post(@RequestBody StudentDetailEntity s) throws NumberException {
		return ss.post(s);
		
	}
	@GetMapping("/get")
	public List<StudentDetailEntity> get(){
		return ss.get();
	}
	@GetMapping(value="/get/{id}")
	public Optional<StudentDetailEntity> getid(@PathVariable int id){
		return ss.getid(id);
	}
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable int id){
		return ss.delete(id);
	}
	


}
 