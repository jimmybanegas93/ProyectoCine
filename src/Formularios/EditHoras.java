/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Menú.Menu;
import Paneles.EditHorasPanel;
import Peliculas.Horarios;
import Peliculas.Pelicula;
import Salas.Sala;
import Salas.TipoSala;
import Salas.sala3D;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.EventObject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Alexander
 */
public class EditHoras extends javax.swing.JFrame {
 static  RandomAccessFile rCod ;
    /**
     * Creates new form EditHoras
     */
    public EditHoras() throws FileNotFoundException {
        initComponents();
        EditHorasPanel back = new EditHorasPanel();
        txtCodHorario.setText(String.valueOf(EditHoras.codHorario()));
        this.add(back,BorderLayout.CENTER);
        this.pack();
        
        int codSalas= AddSala.codSala();
        AddSala.restar();
        
        for(int s=1; s<codSalas; s++){
            String a= "Sala "+s;
            comboSala.addItem(a);
        }       
               
    }
 @Override
    public Image getIconImage(){
        Image icono=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
       
        return icono;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboSala = new javax.swing.JComboBox();
        comboPelicula = new javax.swing.JComboBox();
        txtDuracion = new javax.swing.JTextField();
        txtHoraFin = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtMinutos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMinFin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCodHorario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Sala");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Pelicula");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Duracion");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Hora Inicio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Hora Fin");

        comboSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboSalaMouseClicked(evt);
            }
        });
        comboSala.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSalaItemStateChanged(evt);
            }
        });
        comboSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSalaActionPerformed(evt);
            }
        });
        comboSala.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboSalaFocusLost(evt);
            }
        });

        comboPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboPeliculaMouseClicked(evt);
            }
        });
        comboPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPeliculaActionPerformed(evt);
            }
        });
        comboPelicula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboPeliculaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboPeliculaFocusLost(evt);
            }
        });

        txtDuracion.setEditable(false);
        txtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionActionPerformed(evt);
            }
        });
        txtDuracion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDuracionFocusGained(evt);
            }
        });

        txtHoraFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraFinFocusGained(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Sala", "Pelicula", "Titulo", "Inicio", "Fin", "Remover"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGREGAR PELICULA A HORARIO");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PELICULAS ASIGANDAS A  ESTA SALA");

        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(":");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(":");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCodHorario.setEditable(false);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Codigo:");

        jButton2.setText("Comprobar Horarios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboSala, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMinFin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnAceptar)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(txtMinutos)
                            .addComponent(txtHora))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMinFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-834)/2, (screenSize.height-423)/2, 834, 423);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        JFrame frame = new Administrador();
        restar();
        frame.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void comboSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSalaActionPerformed
        // TODO add your handling code here:
    try {
            // TODO add your handling code here:        
          Sala actual=Menu.getSala(comboSala.getSelectedIndex()+1);            
         
          System.out.println(actual.toString());
            
            ArrayList<Pelicula> peli=Menu.getPeliculas();           
            comboPelicula.removeAllItems();
            comboPelicula.repaint();
            for(Pelicula x: peli){               
              if(actual.getTipo()==TipoSala.NORMAL && x.getFormato().toString().equals("PELICULA_2D")){
                 String a=x.getTitulo();
                 comboPelicula.addItem(a);
               } 
            }  
           for(Pelicula x: peli){  
            if(actual.getTipo()==TipoSala.SALA3D && x.getFormato().toString().equals("PELICULA_3D")){
                 String a=x.getTitulo();  
                 comboPelicula.addItem(a);
               }
               
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error"); 
        }     

    }//GEN-LAST:event_comboSalaActionPerformed

    private void comboPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPeliculaActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_comboPeliculaActionPerformed

    private void txtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionActionPerformed
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_txtDuracionActionPerformed

    private void txtDuracionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuracionFocusGained
       
    }//GEN-LAST:event_txtDuracionFocusGained

    private void txtHoraFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFinFocusGained
        try {
            // TODO add your handling code here:
            Calendar a=Calendar.getInstance();     
            Date b=new Date(); 
            
             int x=comboPelicula.getSelectedIndex();
             Pelicula p=Menu.getPeli(x+1);
                
            int h =Integer.parseInt(txtHora.getText());
            int m =Integer.parseInt(txtMinutos.getText());
            
            a.set(b.getYear(), b.getMonth(), b.getDay(),h,m );    
            a.add(Calendar.HOUR, p.getHoras());
            a.add(Calendar.MINUTE, p.getMinutos());
            a.add(Calendar.MINUTE, 30);
            
           b=a.getTime();
           
           int n1=b.getHours();
           int n2= b.getMinutes();
          
            txtHoraFin.setText(String.valueOf(n1));
            txtMinFin.setText(String.valueOf(n2));
        } catch (FileNotFoundException ex) {
             System.out.println("Error: "+ ex.getMessage());
        }
        
        
    }//GEN-LAST:event_txtHoraFinFocusGained

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            // TODO add your handling code here:
          if(txtCodHorario.getText().equals("")||txtHora.getText().equals("")||txtMinutos.getText().equals("")||
                txtHoraFin.getText().equals("")|| txtMinFin.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No deben haber campos vacíos"); 
                return;
           }
            
          Calendar ini=Calendar.getInstance();    
          Calendar fi=Calendar.getInstance(); 
          Date a=new Date(); 
          Date b=new Date();
          int codHorario=Integer.parseInt(txtCodHorario.getText());
          int codSala=comboSala.getSelectedIndex()+1;
          int codPeli=comboPelicula.getSelectedIndex()+1; 
          ini.set(a.getYear(), a.getMonth(), a.getDay(),Integer.parseInt(txtHora.getText()),Integer.parseInt(txtMinutos.getText()) );
          a=ini.getTime();
          fi.set(b.getYear(), b.getMonth(), b.getDay(),Integer.parseInt(txtHoraFin.getText()),Integer.parseInt(txtMinFin.getText()) );
          b=fi.getTime();
          String tit=comboPelicula.getSelectedItem().toString();
          boolean activa=true;
          
          Sala proyectar= Menu.getSala(codSala);
          Menu.addPeliHorario(codHorario,codSala,codPeli,tit,a,b,activa,proyectar.getFilas(),proyectar.getAsientos(),proyectar.getSillas());
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error"); 
        } catch (IOException ex) {
           Logger.getLogger(ListUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      JFrame frame = new OperacionOk();
      frame.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                
             
    }//GEN-LAST:event_formWindowOpened

    private void comboSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboSalaMouseClicked
       
    }//GEN-LAST:event_comboSalaMouseClicked

    private void comboPeliculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboPeliculaFocusGained
        // TODO add your handling code here:
       
              
    }//GEN-LAST:event_comboPeliculaFocusGained

    private void comboSalaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboSalaFocusLost
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_comboSalaFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {           
            jTable1.setModel(makeTable());  
            jTable1.setRowHeight(36);
            jTable1.setAutoCreateRowSorter(true);
           
       TableColumn column = jTable1.getColumnModel().getColumn(6);
       column.setCellRenderer(new ButtonsRenderer());
       column.setCellEditor(new ButtonsEditor(jTable1));
            
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Error"); 
        }                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:

            if(txtCodHorario.getText().equals("")||txtHora.getText().equals("")||txtMinutos.getText().equals("")||
                txtHoraFin.getText().equals("")|| txtMinFin.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No deben haber campos vacíos"); 
                return;
           }  
              
            Date inicio=Menu.horaInicial(comboSala.getSelectedIndex()+1);
            Date fin=Menu.horaFinal(comboSala.getSelectedIndex()+1);
            Date a=new Date(); 
            Date b=new Date();
            Calendar ini=Calendar.getInstance();    
            Calendar fi=Calendar.getInstance(); 
            ini.set(a.getYear(), a.getMonth(), a.getDay(),Integer.parseInt(txtHora.getText()),Integer.parseInt(txtMinutos.getText()) );
            a=ini.getTime();
            fi.set(b.getYear(), b.getMonth(), b.getDay(),Integer.parseInt(txtHoraFin.getText()),Integer.parseInt(txtMinFin.getText()) );
            b=fi.getTime();
                    
         if(b.getTime()<inicio.getTime()) {
            JOptionPane.showMessageDialog(null, "Disponible");
            return;
         }    
         else if(a.getTime()>fin.getTime()){
             JOptionPane.showMessageDialog(null, "Disponible");                 
          }
           else{
              JOptionPane.showMessageDialog(null, "Los horarios se traslapan");
               txtHora.setText(null);  
           }          
            System.out.println("Inicio limite: "+inicio);
            System.out.println("Fin limite: "+fin);
        } catch (FileNotFoundException ex) {
             Logger.getLogger(ListUsers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
           Logger.getLogger(ListUsers.class.getName()).log(Level.SEVERE, null, ex); 
        }
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboPeliculaMouseClicked
        // TODO add your handling code here:
          
    }//GEN-LAST:event_comboPeliculaMouseClicked

    private void comboSalaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSalaItemStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_comboSalaItemStateChanged

    private void comboPeliculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboPeliculaFocusLost
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
            int x=comboPelicula.getSelectedIndex();
            Pelicula p=Menu.getPeli(x+1);
            txtDuracion.setText(String.valueOf(p.getHoras()+":"+p.getMinutos()));        
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error"); 
        }
    }//GEN-LAST:event_comboPeliculaFocusLost
       
     public static void eliminar(int codHorario) throws IOException{
        Menu.horarios.seek(0);
        while(Menu.horarios.getFilePointer() < Menu.horarios.length() ){      
            int codHora=Menu.horarios.readInt();
            Menu.horarios.readInt();
            Menu.horarios.readInt();
            Menu.horarios.readUTF();
            Menu.horarios.readLong();
            Menu.horarios.readLong(); 
            
            long pos=Menu.horarios.getFilePointer();
            boolean activa=Menu.horarios.readBoolean();   
        
           if(codHora==codHorario&&activa==true){           
              Menu.horarios.seek(pos);
              Menu.horarios.writeBoolean(false);
           }  
          }     
         
     }  
     
      public static int codHorario(){       
         File u=new File("Horarios");
         u.mkdir(); 
         try{
            rCod = new RandomAccessFile( new File("Horarios\\codigohorarios.movi"),"rw");
            int codigo = 100;
            
            if( rCod.length() == 4){
                codigo = rCod.readInt();
                rCod.seek(0);
            }
            
            rCod.writeInt(codigo + 1);
            return codigo;
        }
        catch(IOException e){
          System.out.println("ERROR");
          return -1;
        }
    } 
      
       public static void restar() {
        try {       
            rCod.seek(0);
              rCod.writeInt(codHorario()-1);
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Error"); 
        }        
    } 
     
      private  DefaultTableModel makeTable() throws FileNotFoundException {
        boolean empty = false;
        String [] cadenas={ "Codigo","Sala", "Pelicula", "Título","Inicio","Fin","Remover"};
       
        File u=new File("Horarios");
        u.mkdir();     
        Menu.horarios= new RandomAccessFile( new File("Horarios\\horarios_sala"+(comboSala.getSelectedIndex()+1)+".movi"), "rw");    
            
       
       ArrayList<Horarios> pelis;
       pelis= Menu.getHorario(comboSala.getSelectedIndex()+1);
       Object [][] data=null;
       
       
       if(pelis!=null){         
         data=new Object[pelis.size()][7];
         for(int x=0;x<pelis.size();x++){    
           data[x][0]=pelis.get(x).getCodHorario();
           data[x][1]=pelis.get(x).getCodSala();
           data[x][2]=pelis.get(x).getCodPel();
           data[x][3]=pelis.get(x).getTit();
           int hrs=pelis.get(x).getInicio().getHours();
           int mis=pelis.get(x).getInicio().getMinutes();
           data[x][4]=(hrs+":"+mis);
           hrs=pelis.get(x).getFina().getHours();
           mis=pelis.get(x).getFina().getMinutes();
           data[x][5]=(hrs+":"+mis);          
           data[x][6]= empty;
        }    
       }
        
       DefaultTableModel model = new DefaultTableModel(data, cadenas) {
            @Override public Class<?> getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };    
        return model;
    }
      
    class ButtonsPanel extends JPanel {
    public final List<JButton> buttons = Arrays.asList(new JButton("Eliminar"), new JButton("edit"));
    public ButtonsPanel() {
        super();
        setOpaque(true);
        for(JButton b: buttons) {
            b.setFocusable(false);
            b.setRolloverEnabled(false);
            add(b);
        }
    }

}
class ButtonsRenderer extends ButtonsPanel implements TableCellRenderer {
    public ButtonsRenderer() {
        super();
        setName("Table.cellRenderer");
    }
    @Override public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        this.setBackground(isSelected?table.getSelectionBackground():table.getBackground());
        return this;
    }
}
class ButtonsEditor extends ButtonsPanel implements TableCellEditor {
    public ButtonsEditor(final JTable table) {
        super();

        //---->
        //DEBUG: view button click -> control key down + edit button(same cell) press -> remain selection color
        MouseListener ml = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ButtonModel m = ((JButton)e.getSource()).getModel();
                if(m.isPressed() && table.isRowSelected(table.getEditingRow()) && e.isControlDown()) {
                    setBackground(table.getBackground());
                }
                
            }
        };

        buttons.get(0).addMouseListener(ml);
     //   buttons.get(1).addMouseListener(ml);

        buttons.get(0).addActionListener(new ActionListener() {
             int a ;
            @Override public void actionPerformed(ActionEvent e) {
             //   fireEditingStopped();
                a=table.getEditingRow();              
  
               int seleccion = JOptionPane.showOptionDialog(table, "¿Desea borrar esta película?", "Seleccione una opción", 
                  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Si", "No"}, "Si");
               
               if (seleccion != -1){
                   if((seleccion + 1)==1)   {
                       try {
                           EditHoras.eliminar(Integer.parseInt(table.getValueAt(a, 0).toString()));
                           jButton1.doClick();                           
                       } catch (IOException ex) {
                           System.out.println("Error: "+ ex.getMessage());
                       }
                   }
                   else {
                       JOptionPane.showMessageDialog(table, "Se canceló eliminación");
                   }
              }
            }
        });
       
        addMouseListener(new MouseAdapter() {
            @Override public void mousePressed(MouseEvent e) {
            //    fireEditingStopped();
            }
        });
    }
    @Override public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.setBackground(table.getSelectionBackground());
        return this;
    }
    @Override public Object getCellEditorValue() {
        return "";
    }

    transient protected ChangeEvent changeEvent = null;

    @Override public boolean isCellEditable(EventObject e) {
        return true;
    } 
    @Override public boolean shouldSelectCell(EventObject anEvent) {
        return true;
    }
    @Override public boolean stopCellEditing() {
     //   fireEditingStopped();
        return true;
    }
    @Override public void  cancelCellEditing() {
       // fireEditingCanceled();
    }
    @Override public void addCellEditorListener(CellEditorListener l) {
        listenerList.add(CellEditorListener.class, l);
    }
    @Override public void removeCellEditorListener(CellEditorListener l) {
        listenerList.remove(CellEditorListener.class, l);
    }
    public CellEditorListener[] getCellEditorListeners() {
        return listenerList.getListeners(CellEditorListener.class);
    } 
  
}

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EditHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new EditHoras().setVisible(true);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error"); 
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox comboPelicula;
    private javax.swing.JComboBox comboSala;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodHorario;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtMinFin;
    private javax.swing.JTextField txtMinutos;
    // End of variables declaration//GEN-END:variables
}
