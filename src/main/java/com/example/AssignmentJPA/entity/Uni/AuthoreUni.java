package com.example.AssignmentJPA.entity.Uni;

import com.example.AssignmentJPA.entity.Address;
import com.example.AssignmentJPA.entity.Book;
import com.example.AssignmentJPA.entity.Subject;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "authoruni")
public class AuthoreUni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Embedded
    private AddressUni address;

    public AddressUni getAddress() {
        return address;
    }

    public void setAddress(AddressUni address) {
        this.address = address;
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
