package com.greenfox.dszalay.todo.repository;

import com.greenfox.dszalay.todo.todo.ToDo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<ToDo, Long> {
  List<ToDo> findAllByOrderByIdAsc();
}
