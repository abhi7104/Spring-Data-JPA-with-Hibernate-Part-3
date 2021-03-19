package com.example.AssignmentJPA.Repo;

import com.example.AssignmentJPA.entity.Uni.BookUni;
import org.springframework.data.repository.CrudRepository;

public interface UniBookmapping extends CrudRepository<BookUni,Integer> {
}
