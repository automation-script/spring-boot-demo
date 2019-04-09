package dopsak.xyz.portal.repository;

import org.springframework.data.repository.CrudRepository;

import dopsak.xyz.portal.bean.Todo;

public interface TodoRepo extends CrudRepository<Todo,Integer> {

}
