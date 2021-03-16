package com.example.AssignmentJPA.Repo;

import com.example.AssignmentJPA.entity.onetoone.BookOne;
import org.springframework.data.repository.CrudRepository;

public interface OneToOneRepo extends CrudRepository<BookOne,Integer> {
}
