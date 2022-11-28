/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ConsultasSQL;
import Modelo.Persona;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author alumno
 */
public class PanelUsuario extends javax.swing.JPanel {

    /**
     * Creates new form PanelUsuario
     */
    public PanelUsuario() {
        initComponents();
        System.out.println("Abriendo datos del usuario");

        fieldapalabrado.setText(Persona.getUsuario().getApalabrado());
        fieldapellido.setText(Persona.getUsuario().getApellido());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateformatted = sdf.format(Persona.getUsuario().getFechanacimiento().getTime());  
        fieldfecha.setText(dateformatted);
        
        fielddni.setText(Persona.getUsuario().getDni());
        fieldnombre.setText(Persona.getUsuario().getNombre());
        
        float totalmultas=ConsultasSQL.consulta.totalMultas(Persona.getUsuario().getDni());
        fieldmultas.setText(Float.toString(totalmultas));
        
        if(Persona.getUsuario().getFoto().startsWith("/")){
            foto.setIcon(new ImageIcon(Persona.getUsuario().getFoto()));
        }else{
            foto.setIcon(new ImageIcon("src/fotos/"+Persona.getUsuario().getFoto()));
        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        foto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fielddni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldfecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldmultas = new javax.swing.JTextField();
        fieldapalabrado = new javax.swing.JTextField();
        fieldnombre = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/1001.jpg"))); // NOI18N

        jLabel1.setText("DNI:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        fielddni.setText("jTextField2");
        fielddni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fielddniActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Nacimiento:");

        fieldapellido.setText("jTextField3");

        jLabel5.setText("Total Multas:");

        fieldfecha.setText("jTextField4");

        jLabel6.setText("Apalabrado:");

        fieldmultas.setText("jTextField5");

        fieldapalabrado.setText("jTextField6");

        fieldnombre.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addComponent(fielddni))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldapellido)
                            .addComponent(fieldfecha)
                            .addComponent(fieldmultas)
                            .addComponent(fieldapalabrado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(fieldnombre)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fielddni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(fieldmultas, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldapalabrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(foto)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(foto)
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fielddniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fielddniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fielddniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldapalabrado;
    private javax.swing.JTextField fieldapellido;
    private javax.swing.JTextField fielddni;
    private javax.swing.JTextField fieldfecha;
    private javax.swing.JTextField fieldmultas;
    private javax.swing.JTextField fieldnombre;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
