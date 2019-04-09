package dopsak.xyz.portal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import dopsak.xyz.portal.bean.Todo;
import dopsak.xyz.portal.repository.TodoRepo;

@Service
public class TodoService {
	
	
	@Autowired
	private TodoRepo tdr;
	

	public List<Todo> getAllTodo() {
	   List<Todo> ltd =new ArrayList<>();
		
		tdr.findAll().forEach(ltd::add);
		return ltd;
		
	}

	public void addTodo(Todo newTodo) {
		// TODO Auto-generated method stub
		tdr.save(newTodo);

	}

	public String deleteTodo(Integer todoId) {
		// TODO Auto-generated method stub
		if(tdr.existsById(todoId))
		{
			tdr.deleteById(todoId);
			return "Id is DELETED";
		}
			
		else
			return "Id is not found in the record set,So can not delete the record";
		
	}

	public void updateTodo(Todo upTd, Integer todoId) {
		// TODO Auto-generated method stub
		tdr.save(upTd);
		
	}

	
}
