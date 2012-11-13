
package proyectocine;

import Paneles.AdministradorPanel;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Administrador extends javax.swing.JFrame {
    
    JFrame frame = new JFrame();
    
    public Administrador() {
        initComponents();
        AdministradorPanel back = new AdministradorPanel();
        this.add(back,BorderLayout.CENTER);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarUsuario = new javax.swing.JButton();
        btnAgregarSala = new javax.swing.JButton();
        btnAgregarPelicula = new javax.swing.JButton();
        btnEditarHorario = new javax.swing.JButton();
        btnEditarPerfil = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnListarUsuarios = new javax.swing.JToggleButton();

        setTitle("Menu de Administrador");
        setResizable(false);

        btnAgregarUsuario.setText("AGREGAR USUARIOS");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnAgregarSala.setText("AGREGAR SALAS");
        btnAgregarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSalaActionPerformed(evt);
            }
        });

        btnAgregarPelicula.setText("AGREGAR PELICULAS");
        btnAgregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPeliculaActionPerformed(evt);
            }
        });

        btnEditarHorario.setText("EDITAR HORARIOS");
        btnEditarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarHorarioActionPerformed(evt);
            }
        });

        btnEditarPerfil.setText("EDITAR PERFIL");
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnListarUsuarios.setText("LISTA DE USUARIOS");
        btnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(577, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-866)/2, (screenSize.height-634)/2, 866, 634);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        frame = new AddUsuario();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSalaActionPerformed
        frame = new AddSala();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarSalaActionPerformed

    private void btnAgregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPeliculaActionPerformed
        frame = new AddPelicula();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarPeliculaActionPerformed

    private void btnEditarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHorarioActionPerformed
        frame = new EditHoras();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarHorarioActionPerformed

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        frame = new EditPerfil();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuariosActionPerformed
        frame = new ListUsers();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListarUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPelicula;
    private javax.swing.JButton btnAgregarSala;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnEditarHorario;
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JToggleButton btnListarUsuarios;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
