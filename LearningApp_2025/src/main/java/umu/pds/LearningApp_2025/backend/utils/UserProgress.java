package umu.pds.LearningApp_2025.backend.utils;

import jakarta.persistence.*;

@Entity
@Table(name = "progreso_usuario")
class ProgresoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Course curso;

    private int progreso;
    
    // Getters y Setters
}