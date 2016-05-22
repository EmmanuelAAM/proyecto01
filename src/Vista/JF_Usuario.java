/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorUsuarios;
import java.util.Arrays;

/**
 *
 * @author Emmanuel
 */
public class JF_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form JF_Usuario
     */
    public JF_Usuario(ControladorUsuarios controlador) {
        initComponents();
        setVisible(false);
        jL_iconoAdvertencia.setVisible(false);
        jL_Advertencia.setVisible(false);
        agregarEventos(controlador);
    }

    public void loginIncorrecto(){
        jT_Cedula.setText("");
        jP_Password.setText("");
        jL_iconoAdvertencia.setVisible(true);
        jL_Advertencia.setVisible(true);
    }
    public void agregarEventos(ControladorUsuarios controlador){
        jB_Aceptar.addActionListener(controlador);
    }
    public String getCedula(){
        return jT_Cedula.getText();
    }
    public String getPassword(){
       String a=String.valueOf(jP_Password.getPassword());
        return a;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jT_Cedula = new javax.swing.JTextField();
        jP_Password = new javax.swing.JPasswordField();
        jB_Aceptar = new javax.swing.JButton();
        jL_Advertencia = new javax.swing.JLabel();
        jL_iconoAdvertencia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 0));
        setMinimumSize(new java.awt.Dimension(471, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Cédula");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 90, 60, 20);

        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Contraseña.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 130, 80, 16);
        getContentPane().add(jT_Cedula);
        jT_Cedula.setBounds(170, 90, 140, 20);
        getContentPane().add(jP_Password);
        jP_Password.setBounds(170, 130, 140, 20);

        jB_Aceptar.setBackground(new java.awt.Color(204, 204, 255));
        jB_Aceptar.setForeground(new java.awt.Color(0, 0, 0));
        jB_Aceptar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emmanuel\\Documents\\NetBeansProjects\\Ejercicio01\\src\\img\\Aceptar.png")); // NOI18N
        jB_Aceptar.setText("Aceptar");
        getContentPane().add(jB_Aceptar);
        jB_Aceptar.setBounds(170, 210, 120, 30);

        jL_Advertencia.setText("-Nombre O Contraseña Incorrectos.-");
        getContentPane().add(jL_Advertencia);
        jL_Advertencia.setBounds(140, 190, 210, 16);

        jL_iconoAdvertencia.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emmanuel\\Documents\\NetBeansProjects\\Ejercicio01\\src\\img\\Advertencia.png")); // NOI18N
        getContentPane().add(jL_iconoAdvertencia);
        jL_iconoAdvertencia.setBounds(220, 150, 40, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emmanuel\\Documents\\NetBeansProjects\\Ejercicio01\\src\\img\\UsersIcono.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 0, 90, 70);

        jLabel6.setFont(new java.awt.Font("Masque", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 10, 150, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(200, 50, 120, 20);

        jLFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emmanuel\\Documents\\NetBeansProjects\\Ejercicio01\\src\\img\\UsersFondo.png")); // NOI18N
        getContentPane().add(jLFondo);
        jLFondo.setBounds(-640, -20, 1420, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Aceptar;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jL_Advertencia;
    private javax.swing.JLabel jL_iconoAdvertencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jP_Password;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jT_Cedula;
    // End of variables declaration//GEN-END:variables
}