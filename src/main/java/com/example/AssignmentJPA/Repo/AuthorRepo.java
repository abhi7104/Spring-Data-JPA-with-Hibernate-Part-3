package com.example.AssignmentJPA.Repo;

import com.example.AssignmentJPA.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Integer> {
}
