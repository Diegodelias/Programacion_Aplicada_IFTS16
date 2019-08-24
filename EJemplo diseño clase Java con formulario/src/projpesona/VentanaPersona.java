/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpesona;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class VentanaPersona extends javax.swing.JFrame {
    
    Persona p;//definicion de un objeto de la clase Persona
    

    /**
     * Creates new form VentanaPersona
     */
    public VentanaPersona() {
        initComponents();
        p = new  Persona();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoApellidos = new javax.swing.JTextField();
        textoFechaNac = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox<>();
        comboTipoSangre = new javax.swing.JComboBox<>();
        botonCapturar = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de personas");
        getContentPane().setLayout(null);

        jLabel1.setText("NOMBRE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 40, 90, 15);

        jLabel2.setText("APELLIDOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 40, 80, 20);

        jLabel3.setText("SEXO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 36, 15);

        jLabel4.setText("TIPO DE SANGRE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 110, 120, 15);

        jLabel5.setText("FECHA DE NACIMIENTO(AAAA-MM-DD)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 190, 270, 20);

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textoNombre);
        textoNombre.setBounds(40, 70, 170, 20);

        textoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(textoApellidos);
        textoApellidos.setBounds(250, 70, 180, 20);
        getContentPane().add(textoFechaNac);
        textoFechaNac.setBounds(300, 190, 140, 20);

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", " " }));
        getContentPane().add(comboSexo);
        comboSexo.setBounds(40, 140, 170, 24);

        comboTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        getContentPane().add(comboTipoSangre);
        comboTipoSangre.setBounds(260, 140, 100, 24);

        botonCapturar.setText("CAPTURAR");
        botonCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCapturarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCapturar);
        botonCapturar.setBounds(50, 280, 140, 40);

        botonMostrar.setText("MOSTRAR");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonMostrar);
        botonMostrar.setBounds(280, 280, 140, 40);

        setBounds(0, 0, 472, 412);
    }// </editor-fold>//GEN-END:initComponents

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoApellidosActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        String mensaje = "Datos Ingresados de la persona" + "\n";
        mensaje = mensaje + "Nombre :" + p.getNombre() + "\n";
        mensaje = mensaje + "Apellidos :" + p.getApellidos() + "\n";
        mensaje = mensaje + "Tipo Sangre :" + p.getTipoSangre() + "\n";
        mensaje = mensaje + "Sexo : " + p.getSexo() + "\n";
        mensaje = mensaje + "Fecha Nacimiento :" + p.getFechaNacimiento() + "\n";
        
        JOptionPane.showMessageDialog(this, mensaje);
        
        
        
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void botonCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCapturarActionPerformed
        p.setNombre(textoNombre.getText());
        p.setApellidos(textoApellidos.getText());
        p.setSexo(comboSexo.getSelectedItem().toString().charAt(0));
        p.setFechaNacimiento(textoFechaNac.getText());
        
    }//GEN-LAST:event_botonCapturarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCapturar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JComboBox<String> comboTipoSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textoApellidos;
    private javax.swing.JTextField textoFechaNac;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
