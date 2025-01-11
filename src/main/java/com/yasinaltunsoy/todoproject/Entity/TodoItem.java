package com.yasinaltunsoy.todoproject.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// LOMBOK
@Setter
@Getter

@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "created_user_id", nullable = false)
    private User createdUser;

    @Column(name = "created_time", nullable = false, columnDefinition = "DATETIME DEFAULT '1900-01-01 00:00:00'")
    private String createdTime;

    @Column(nullable = false, length = 1)
    private String status;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(length = 1500)
    private String details;

    @Column(name = "completion_condition", length = 1500)
    private String completionCondition;
}
