package dev.toktab.clevercloudmysqlspringboot.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // No-argument constructor
    public User() {
        // This constructor is required by Hibernate
    }

    // Constructor with parameters
    public User(String name) {
        this.name = name;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
