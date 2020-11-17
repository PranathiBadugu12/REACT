package com.example.repositories;
import com.example.services.*;
import com.example.controllers.*;
import com.example.repositories.*;
import com.example.models.*;
import com.example.securities.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}
