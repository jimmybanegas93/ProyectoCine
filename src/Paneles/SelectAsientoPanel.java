/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class SelectAsientoPanel extends javax.swing.JPanel {

    public SelectAsientoPanel() {
        initComponents();
        this.setSize(922,493);
    }
    
    @Override
    public void paintComponent(Graphics g){
        Dimension dim = getSize();
        ImageIcon ImagenFondo = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Standard2.jpg")).getImage());
        g.drawImage(ImagenFondo.getImage(),0,0,dim.width,dim.height,null);
        setOpaque(false);
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
