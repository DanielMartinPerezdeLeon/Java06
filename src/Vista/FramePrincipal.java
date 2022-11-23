
package Vista;

import Modelo.ConsultasSQL;
import javax.swing.JPanel;


//Accede y muestra las distintas opciones del programa
public class FramePrincipal extends javax.swing.JFrame {

    public boolean sesion =false;   //Nos indica si hemos iniciado sesion
    public static FramePrincipal fprincipal;
    
    public FramePrincipal() {
        super("Base de Datos Multas"); //Nombre de la ventana
        initComponents();
        
        visibilidadBotones();   //dejo botones enabled o disabled
        
    }

    
    //VISTA
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        botoniniciarsesion = new javax.swing.JMenuItem();
        botondesconectarse = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        botonmultasindividual = new javax.swing.JMenuItem();
        botonmultasgeneral = new javax.swing.JMenuItem();
        botondatosusuario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        botonaltapersona = new javax.swing.JMenuItem();
        sf = new javax.swing.JMenu();
        botonbajapersona = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Sesión");

        botoniniciarsesion.setText("Iniciar Sesión");
        botoniniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoniniciarsesionActionPerformed(evt);
            }
        });
        jMenu1.add(botoniniciarsesion);

        botondesconectarse.setText("Desconectarse");
        botondesconectarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondesconectarseActionPerformed(evt);
            }
        });
        jMenu1.add(botondesconectarse);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ver");

        botonmultasindividual.setText("Multas Individualmente");
        botonmultasindividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmultasindividualActionPerformed(evt);
            }
        });
        jMenu2.add(botonmultasindividual);

        botonmultasgeneral.setText("Multas en General");
        botonmultasgeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmultasgeneralActionPerformed(evt);
            }
        });
        jMenu2.add(botonmultasgeneral);

        botondatosusuario.setText("Datos  Usuario");
        botondatosusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondatosusuarioActionPerformed(evt);
            }
        });
        jMenu2.add(botondatosusuario);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Alta");

        botonaltapersona.setText("Persona");
        botonaltapersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonaltapersonaActionPerformed(evt);
            }
        });
        jMenu3.add(botonaltapersona);

        jMenuBar1.add(jMenu3);

        sf.setText("Baja");

        botonbajapersona.setText("Coche");
        botonbajapersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbajapersonaActionPerformed(evt);
            }
        });
        sf.add(botonbajapersona);

        jMenuBar1.add(sf);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoniniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoniniciarsesionActionPerformed
        String args[] = null;
        IniciarSesionFrame.main(args);
    }//GEN-LAST:event_botoniniciarsesionActionPerformed

    private void botondesconectarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondesconectarseActionPerformed
        ConsultasSQL.consulta.desconectarseBD(); //Llama a la consulta para desconectarse de la bd
        System.out.println("Desconectado"); //Indica que se ha desconectado correctamente
        sesion=false;   //cambia sesion
        visibilidadBotones();   //Cambiara los enabled de los botones
    }//GEN-LAST:event_botondesconectarseActionPerformed

    private void botonmultasindividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmultasindividualActionPerformed
        PanelMultasIndividual panel= new PanelMultasIndividual();
        cambiarPanel(panel);
    }//GEN-LAST:event_botonmultasindividualActionPerformed

    private void botonmultasgeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmultasgeneralActionPerformed
        PanelListaMultas panel = new PanelListaMultas();
        cambiarPanel(panel);
    }//GEN-LAST:event_botonmultasgeneralActionPerformed

    private void botondatosusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondatosusuarioActionPerformed
        PanelUsuario panel = new PanelUsuario();
        cambiarPanel(panel);
    }//GEN-LAST:event_botondatosusuarioActionPerformed

    private void botonaltapersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonaltapersonaActionPerformed
        PanelAltaPersona panel = new PanelAltaPersona();
        cambiarPanel(panel);
    }//GEN-LAST:event_botonaltapersonaActionPerformed

    private void botonbajapersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbajapersonaActionPerformed
        PanelBajaCoche panel = new PanelBajaCoche();
        cambiarPanel(panel);
    }//GEN-LAST:event_botonbajapersonaActionPerformed

  
    
    //MAIN
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FramePrincipal.fprincipal = new FramePrincipal();   //instancio el Frame para controlarlo
                fprincipal.setVisible(true);        //Lo hago visible
            }
        });
    }
    
    
    public void cambiarPanel(javax.swing.JPanel panel){
        System.out.println("Cambiando panel");    //Avisa que se está cambiando el panel
        this.setContentPane(panel); //Cambia el panel
        pack();
        
    }
    
    
    
    //METODOS
    public void visibilidadBotones(){   //Pone los botones enabled o disables dependiendo de como esté sesion
        botoniniciarsesion.setEnabled(!sesion);
        botondesconectarse.setEnabled(sesion);
        botonmultasindividual.setEnabled(sesion);
        botonmultasgeneral.setEnabled(sesion);
        botondatosusuario.setEnabled(sesion);
        botonaltapersona.setEnabled(sesion);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botonaltapersona;
    private javax.swing.JMenuItem botonbajapersona;
    private javax.swing.JMenuItem botondatosusuario;
    private javax.swing.JMenuItem botondesconectarse;
    private javax.swing.JMenuItem botoniniciarsesion;
    private javax.swing.JMenuItem botonmultasgeneral;
    private javax.swing.JMenuItem botonmultasindividual;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu sf;
    // End of variables declaration//GEN-END:variables
}
