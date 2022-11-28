/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Casa;
import Modelo.ConsultasSQL;
import Modelo.Persona;

/**
 *
 * @author alumno
 */
public class PanelModificarCasa extends javax.swing.JPanel {

    /**
     * Creates new form PanelModificarCasa
     */
    Casa casa;
    
    public PanelModificarCasa() {
        initComponents();
        System.out.println("Abriendo modificar casa");
        
        
        casa=ConsultasSQL.consulta.buscarCasa(Persona.getUsuario().getDni());
        System.out.println("casa encontrada");
        
        labelcodigo.setText(Integer.toString(casa.getCodigo()));
        labellocalidad.setText(casa.getLocalidad());
        labelpropietario.setText(casa.getPropietario());
        fielddireccion.setText(casa.getDireccion());
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
        labelcodigo = new javax.swing.JLabel();
        Localidad = new javax.swing.JLabel();
        labellocalidad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelpropietario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fielddireccion = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();

        jLabel1.setText("Codigo:");

        labelcodigo.setText("jLabel2");

        Localidad.setText("Localidad");

        labellocalidad.setText("jLabel3");

        jLabel2.setText("Propietario:");

        labelpropietario.setText("jLabel3");

        jLabel3.setText("Direccion:");

        fielddireccion.setText("jTextField1");

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(Localidad)
                            .addComponent(jLabel1))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelcodigo)
                            .addComponent(labellocalidad)
                            .addComponent(labelpropietario)
                            .addComponent(fielddireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(Modificar)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelcodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Localidad)
                    .addComponent(labellocalidad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelpropietario))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fielddireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modificar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        ConsultasSQL.consulta.modificarCasa(casa.getCodigo(),fielddireccion.getText());
        System.out.println("Direccion modificada");
    }//GEN-LAST:event_ModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Localidad;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField fielddireccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelcodigo;
    private javax.swing.JLabel labellocalidad;
    private javax.swing.JLabel labelpropietario;
    // End of variables declaration//GEN-END:variables
}