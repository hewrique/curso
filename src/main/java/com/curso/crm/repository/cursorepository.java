package com.curso.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.crm.model.cursomodel;

@Repository
public interface cursorepository extends JpaRepository<cursomodel, Long>{
	

}
