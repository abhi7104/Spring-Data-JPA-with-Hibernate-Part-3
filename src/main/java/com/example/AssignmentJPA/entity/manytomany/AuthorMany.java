package com.example.AssignmentJPA.entity.manytomany;

import com.example.AssignmentJPA.entity.Book;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authormany")
public class AuthorMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "manytomany",joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
    private List<BookMany> books;

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

    public List<BookMany> getBooks() {
        return books;
    }

    public void setBooks(List<BookMany> books) {
        this.books = books;
    }
}
