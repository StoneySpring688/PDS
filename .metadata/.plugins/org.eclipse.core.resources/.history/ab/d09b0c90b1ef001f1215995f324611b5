package umu.pds.LearningApp_2025.backend.utils;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tittle;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User creator;

    // Getters y Setters
}