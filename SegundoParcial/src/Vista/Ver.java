/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author estudiante
 */
import Modelo.*;
import Control.*;
import java.util.ArrayList;
public class Ver extends javax.swing.JFrame {

    /**
     * Creates new form Ver
     */
    public Ver() {
        initComponents();
    }
    
    public static void Alerta (String mensaje, String titulo){
    
        javax.swing.JOptionPane.showMessageDialog(null, mensaje, titulo, javax.swing.JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    public void Limpiar(){
    
        txtId.setText("");
        txtNombre.setText("");        
        txtContinente.setText("");
        txtTecnico.setText("");        
        txtGolesf.setText("");        
        txtGolesc.setText("");        
        txtPartidosg.setText("");
        txtPartidosp.setText("");        
        txtPartidosj.setText("");        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContinente = new javax.swing.JTextField();
        txtTecnico = new javax.swing.JTextField();
        txtGolesf = new javax.swing.JTextField();
        txtGolesc = new javax.swing.JTextField();
        txtPartidosg = new javax.swing.JTextField();
        txtPartidosp = new javax.swing.JTextField();
        txtPartidosj = new javax.swing.JTextField();
        btnMPG = new javax.swing.JButton();
        btnMDG = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLista = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)), "Mundial"));

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Continente ID");

        jLabel4.setText("Tecnico");

        jLabel5.setText("Goles a Favor");

        jLabel6.setText("Goles en Contra");

        jLabel7.setText("Partidos Ganados");

        jLabel8.setText("Partidos Perdidos");

        jLabel9.setText("Partidos Jugados");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnMPG.setText("Mayor partidos ganados");
        btnMPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMPGActionPerformed(evt);
            }
        });

        btnMDG.setText("Mejor difrencia gol");
        btnMDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMDGActionPerformed(evt);
            }
        });

        btnLista.setText("Lista");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        txtLista.setColumns(20);
        txtLista.setRows(5);
        jScrollPane1.setViewportView(txtLista);

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnGuardar)
                                .addComponent(btnEliminar))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBuscar)
                                .addComponent(btnActualizar))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnMDG)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnLista))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnMPG)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtId)
                                .addComponent(txtNombre)
                                .addComponent(txtContinente)
                                .addComponent(txtTecnico)
                                .addComponent(txtGolesf)
                                .addComponent(txtGolesc)
                                .addComponent(txtPartidosg)
                                .addComponent(txtPartidosp)
                                .addComponent(txtPartidosj, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtGolesf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtGolesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtPartidosg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtPartidosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPartidosj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnMPG)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnMDG)
                    .addComponent(btnLista))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
       Integer id = Integer.parseInt(txtId.getText());
       String nombre = txtNombre.getText();
       Integer continente_id = Integer.parseInt(txtContinente.getText());
       String tecnico = txtTecnico.getText();
       Integer goles_favor = Integer.parseInt(txtGolesf.getText());
       Integer goles_contra = Integer.parseInt(txtGolesc.getText());
       Integer partidos_ganados = Integer.parseInt(txtPartidosg.getText());
       Integer partidos_perdidos = Integer.parseInt(txtPartidosp.getText());
       Integer partidos_jugados = Integer.parseInt(txtPartidosj.getText());
       
       
       Seleccion d = new Seleccion(id,nombre,continente_id,tecnico,goles_favor,goles_contra,partidos_ganados,partidos_perdidos,partidos_jugados);
       Servicios s = new Servicios();
       
       s.RegistrarD(d);
       
       Alerta("Datos guardados!", "Registro");
        
       Limpiar();
       
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
       Integer id = Integer.parseInt(txtId.getText());
        
        Seleccion d = new Seleccion(id);
        
        Servicios s = new Servicios(); 
        s.Buscard(d);
        
        txtNombre.setText(d.getNombre());
        txtContinente.setText(String.valueOf(d.getContinente_id()));
        txtTecnico.setText(d.getTecnico());        
        txtGolesf.setText(String.valueOf(d.getGoles_favor()));        
        txtGolesc.setText(String.valueOf(d.getGoles_contra()));        
        txtPartidosg.setText(String.valueOf(d.getPartidos_ganados()));
        txtPartidosp.setText(String.valueOf(d.getPartidos_perdidos()));        
        txtPartidosj.setText(String.valueOf(d.getPartidos_jugados()));
        
        Alerta("Datos Encontrados!", "Buscar");
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        
        Integer id = Integer.parseInt(txtId.getText());
        
        Seleccion d = new Seleccion(id);
        
        Servicios s = new Servicios();
        
     
        s.EliminarD(d);
        
        Alerta("Datos Eliminados!", "Eliminar");
        
        Limpiar();
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       
       Integer id = Integer.parseInt(txtId.getText());
       String nombre = txtNombre.getText();
       Integer continente_id = Integer.parseInt(txtContinente.getText());
       String tecnico = txtTecnico.getText();
       Integer goles_favor = Integer.parseInt(txtGolesf.getText());
       Integer goles_contra = Integer.parseInt(txtGolesc.getText());
       Integer partidos_ganados = Integer.parseInt(txtPartidosg.getText());
       Integer partidos_perdidos = Integer.parseInt(txtPartidosp.getText());
       Integer partidos_jugados = Integer.parseInt(txtPartidosj.getText());
       
       
       Seleccion d = new Seleccion(id,nombre,continente_id,tecnico,goles_favor,goles_contra,partidos_ganados,partidos_perdidos,partidos_jugados);
       Servicios s = new Servicios();
       
       s.ActualizarD(d);
       
       Alerta("Datos Actualizados!", "Actualizar");
        
        Limpiar();
        
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMPGActionPerformed
      
        Seleccion d = new Seleccion();
        Servicios s = new Servicios();
        
        
        
        Alerta("la mayor cantidad de partidos ganados es de "+s.MayorD(d)+" por la seleccion de "+s.MayorS(d), "Mayor Cantidad de Partidos Ganados!!");
        
    }//GEN-LAST:event_btnMPGActionPerformed

    private void btnMDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMDGActionPerformed
     
        Seleccion d = new Seleccion();
        Servicios s = new Servicios();
        
        
        
        Alerta("la mejor diferencia de goles es de "+s.MayorDifM(d)+" por la seleccion de "+s.MayorS(d), "Mejor Diferencia de gol!!");
        
    }//GEN-LAST:event_btnMDGActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
       
        Seleccion d = new Seleccion();
        Servicios s = new Servicios();
        SeleccionServicios ss = new SeleccionServicios();
        
        s.Lista(d);
        
         String t="";
         for(int i =0; i<Seleccion.selecciones.size(); i++){
           
          // txtLista.setText(Seleccion.selecciones.get(i).getNombre()+"\n");
           
          
           txtLista.setText(t+= Seleccion.selecciones.get(i).mostrar());

         }
        
      
     
       
    }//GEN-LAST:event_btnListaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        txtLista.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLista;
    public javax.swing.JButton btnMDG;
    public javax.swing.JButton btnMPG;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtContinente;
    private javax.swing.JTextField txtGolesc;
    private javax.swing.JTextField txtGolesf;
    private javax.swing.JTextField txtId;
    public javax.swing.JTextArea txtLista;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPartidosg;
    private javax.swing.JTextField txtPartidosj;
    private javax.swing.JTextField txtPartidosp;
    private javax.swing.JTextField txtTecnico;
    // End of variables declaration//GEN-END:variables
}
