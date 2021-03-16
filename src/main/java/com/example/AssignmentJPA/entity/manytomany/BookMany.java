package com.example.AssignmentJPA.entity.manytomany;

import com.example.AssignmentJPA.entity.Author;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bookmany")
public class BookMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "books")
    private List<AuthorMany> author;

    public List<AuthorMany> getAuthor() {
        return author;
    }

    public void setAuthor(List<AuthorMany> author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
