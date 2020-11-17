package com.example.services;

import java.util.Date;

import java.util.List;
import java.util.Optional;
import com.example.services.*;
import com.example.controllers.*;
import com.example.repositories.*;
import com.example.models.*;
import com.example.securities.*;


public interface ITodoService {

	List<Todo> getTodosByUser(String user);

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo(String name, String desc, Date targetDate, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

}