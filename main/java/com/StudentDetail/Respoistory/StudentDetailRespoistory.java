package com.StudentDetail.Respoistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentDetail.Entity.StudentDetailEntity;

public interface StudentDetailRespoistory extends JpaRepository<StudentDetailEntity, Integer>{

}
