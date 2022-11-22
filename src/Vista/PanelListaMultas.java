/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ConsultasSQL;
import Modelo.Multa;
import Modelo.Persona;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author alumno
 */
public class PanelListaMultas extends javax.swing.JPanel {

    /**
     * Creates new form PanelListasMultas
     */
    
    //Lista donde se guardará todos las multas del usuario
    ArrayList <Multa> listamultas = new <Multa> ArrayList();

            
    public PanelListaMultas() {
        initComponents();
        
        System.out.println("Abriendo lista multas");
        
        
        labeltitulo.setText("Listado Multas del Usuario " + Persona.getUsuario().getNombre() + " " + Persona.getUsuario().getApellido()); //Titulo para el panel
            
        listamultas=ConsultasSQL.consulta.guardarMultas(Persona.getUsuario().getDni()); //Llama al sql que guarda multas
        
        String datos[] = new String[listamultas.size()];    //Array para el jlist
        
  
        
        for(int i =0; i<listamultas.size(); i++){
            datos[i]=listamultas.get(i).toString(); //mete en el array cada multa(tostring)
          
        }
        
        lista.setListData(datos);   //Mete los datos en el jlist
        
;
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
        lista = new javax.swing.JList<>();
        labeltitulo = new javax.swing.JLabel();

        jScrollPane1.setViewportView(lista);

        labeltitulo.setText("Listado multas del usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(labeltitulo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltitulo)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
