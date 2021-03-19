package com.example.AssignmentJPA.entity.Uni;

import com.example.AssignmentJPA.entity.Author;

import javax.persistence.*;

@Entity
@Table(name = "bookuni")
public class BookUni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name="author_id")
    private AuthoreUni author;

    public AuthoreUni getAuthor() {
        return author;
    }

    public void setAuthor(AuthoreUni author) {
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
