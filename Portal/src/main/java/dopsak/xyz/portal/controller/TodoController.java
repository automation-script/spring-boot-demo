package dopsak.xyz.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dopsak.xyz.portal.bean.Todo;
import dopsak.xyz.portal.service.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService tds;
	
	//Get all todo
	@RequestMapping("/todo")
	public List<Todo> getAllTodo()
	{
		return tds.getAllTodo();
	}
	
	//insert a new todo by using post request
	@RequestMapping(method=RequestMethod.POST,value="/todo")
	public void addTodo(@RequestBody Todo newTodo)
	{
		tds.addTodo(newTodo);
	}
	
	//delete a todo
	@RequestMapping(method=RequestMethod.DELETE,value="/todo/{todoId}")
	public String deleteTodo(@PathVariable Integer todoId)
	{
		return tds.deleteTodo(todoId);
	}
	
	//update a todo
	@RequestMapping(method=RequestMethod.PUT,value="/todo/{todoId}")
	public void updateTodo(@RequestBody Todo upTd,@PathVariable Integer todoId)
	{
		tds.updateTodo(upTd,todoId);
	}
	

}
