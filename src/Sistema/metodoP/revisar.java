/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Sistema.metodoP;

import Sistema.Principal;
import Sistema.VistaCompras;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTHIAN
 */
public class revisar extends javax.swing.JPanel {

    /**
     * Creates new form revisar
     */
    public revisar() {
        initComponents();
        confirmar.setCursor(new Cursor(HAND_CURSOR));
        ver.setCursor(new Cursor(HAND_CURSOR));
        cancelar.setCursor(new Cursor(HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmar = new Sistema.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        ver = new Sistema.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        cancelar = new Sistema.PanelRound();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmar.setBackground(new java.awt.Color(0, 210, 172));
        confirmar.setRoundBottomLeft(15);
        confirmar.setRoundBottomRight(15);
        confirmar.setRoundTopLeft(15);
        confirmar.setRoundTopRight(15);
        confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                confirmarMouseReleased(evt);
            }
        });
        confirmar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirmar pedido");
        confirmar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 15, 130, -1));

        add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 170, 50));

        ver.setBackground(new java.awt.Color(38, 70, 83));
        ver.setRoundBottomLeft(15);
        ver.setRoundBottomRight(15);
        ver.setRoundTopLeft(15);
        ver.setRoundTopRight(15);
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                verMouseReleased(evt);
            }
        });
        ver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ver compras");
        ver.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 100, -1));

        add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 130, 30));

        cancelar.setBackground(new java.awt.Color(230, 57, 70));
        cancelar.setRoundBottomLeft(15);
        cancelar.setRoundBottomRight(15);
        cancelar.setRoundTopLeft(15);
        cancelar.setRoundTopRight(15);
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelarMouseReleased(evt);
            }
        });
        cancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cancelar compra");
        cancelar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 5, 120, -1));

        add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseClicked
        File f = new File("Compras.txt");
        Principal p=new Principal();
        JOptionPane.showMessageDialog(this,"¡Su pedido se ha realizado con éxito!");
        this.setVisible(false);
        p.setVisible(true);
        f.delete();
    }//GEN-LAST:event_confirmarMouseClicked

    private void confirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseEntered
        confirmar.setBackground(new Color(22, 196, 165));
    }//GEN-LAST:event_confirmarMouseEntered

    private void confirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseExited
        confirmar.setBackground(new Color(0,210,172));
    }//GEN-LAST:event_confirmarMouseExited

    private void confirmarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMousePressed
        confirmar.setBackground(new Color(12, 166, 138));
    }//GEN-LAST:event_confirmarMousePressed

    private void confirmarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseReleased
        confirmar.setBackground(new Color(0,210,172));
    }//GEN-LAST:event_confirmarMouseReleased

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        VistaCompras v = new VistaCompras();
        v.setVisible(true);
    }//GEN-LAST:event_verMouseClicked

    private void verMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMousePressed
        ver.setBackground(new Color(24, 45, 52));
    }//GEN-LAST:event_verMousePressed

    private void verMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseReleased
        ver.setBackground(new Color(38,70,83));
    }//GEN-LAST:event_verMouseReleased

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        File f = new File("Compras.txt");
        Principal p = new Principal();
        int respuesta=JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere cancelar la compra?", "Cancelar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (respuesta==0){
            JOptionPane.showMessageDialog(null, "Compra cancelada", "Cancelado", 1);
            p.setVisible(true);
            this.setVisible(false);
            f.delete();
        }

    }//GEN-LAST:event_cancelarMouseClicked

    private void cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarMousePressed

    private void cancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Sistema.PanelRound cancelar;
    private Sistema.PanelRound confirmar;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private Sistema.PanelRound ver;
    // End of variables declaration//GEN-END:variables
}
