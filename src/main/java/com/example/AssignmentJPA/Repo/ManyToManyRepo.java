package com.example.AssignmentJPA.Repo;

import com.example.AssignmentJPA.entity.manytomany.AuthorMany;
import org.springframework.data.repository.CrudRepository;

public interface ManyToManyRepo extends CrudRepository<AuthorMany,Integer> {
}
