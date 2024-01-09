package com.boot.jpa.bootJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boot.jpa.bootJPA.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{
	
	
	
}
