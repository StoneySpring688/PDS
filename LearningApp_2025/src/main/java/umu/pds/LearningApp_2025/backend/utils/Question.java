package umu.pds.LearningApp_2025.backend.utils;

import java.io.IOException;

import java.io.File;

import jakarta.persistence.*;

import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@Table(name = "Question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enunciate;
    
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course curso;

    // Getters y Setters

    public void saveAsJSON(String rutaArchivo) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(rutaArchivo), this);
    }

    public static Question loadJSON(String rutaArchivo) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(rutaArchivo), Question.class);
    }
}