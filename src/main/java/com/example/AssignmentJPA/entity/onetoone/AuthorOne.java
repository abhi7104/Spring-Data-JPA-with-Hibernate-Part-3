package com.example.AssignmentJPA.entity.onetoone;

import com.example.AssignmentJPA.entity.manytomany.BookMany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authorone")
public class AuthorOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne(mappedBy = "authorOne")
    private BookOne bookOne;
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

    public BookOne getBookOne() {
        return bookOne;
    }

    public void setBookOne(BookOne bookOne) {
        this.bookOne = bookOne;
    }
}
