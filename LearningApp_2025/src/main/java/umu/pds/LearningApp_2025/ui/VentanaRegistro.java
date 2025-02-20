package umu.pds.LearningApp_2025.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoContrasena;
    private JButton botonRegistrar, botonVolver;

    public VentanaRegistro() {
        setTitle("Registro de Usuario");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(3, 2));

        campoUsuario = new JTextField();
        campoContrasena = new JPasswordField();
        botonRegistrar = new JButton("Registrar");
        botonVolver = new JButton("Volver");

        panel.add(new JLabel("Nuevo Usuario:"));
        panel.add(campoUsuario);
        panel.add(new JLabel("Contraseña:"));
        panel.add(campoContrasena);
        panel.add(botonRegistrar);
        panel.add(botonVolver);

        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarUsuario();
            }
        });

        botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volverALogin();
            }
        });

        add(panel);
    }

    private void registrarUsuario() {
        String usuario = campoUsuario.getText();
        String contrasena = new String(campoContrasena.getPassword());
        JOptionPane.showMessageDialog(this, "Usuario registrado: " + usuario);
    }

    private void volverALogin() {
        new VentanaLogin().setVisible(true);
        this.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaRegistro().setVisible(true));
    }
}
