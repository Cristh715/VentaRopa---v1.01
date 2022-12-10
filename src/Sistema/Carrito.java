/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema;

import Sistema.metodoP.direccion;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author CRISTHIAN
 */
public class Carrito extends javax.swing.JFrame {
    
    public Carrito() {
        direccion d = new direccion();
        initComponents();
        setLocationRelativeTo(null);
        showPanel(d);
    }
    
    public void showPanel(JPanel p){
            p.setSize(540, 400);
            p.setLocation(0, 0);
            contenedor.removeAll();
            contenedor.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
            contenedor.revalidate();
            contenedor.repaint();
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zonas = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        salir1 = new Sistema.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        panelC = new javax.swing.JPanel();
        lbldireccion = new javax.swing.JLabel();
        lblmetodo = new javax.swing.JLabel();
        lblrevisar = new javax.swing.JLabel();
        cambio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(142, 142, 142));
        jLabel1.setText("Total a pagar");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 97, 36));

        lbltotal.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(43, 45, 66));
        jPanel2.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 130, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 45, 66));
        jLabel2.setText("Pedido pendiente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/billetes.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 50, 40));

        salir1.setBackground(new java.awt.Color(247, 247, 247));
        salir1.setForeground(new java.awt.Color(204, 204, 204));
        salir1.setRoundBottomLeft(30);
        salir1.setRoundBottomRight(30);
        salir1.setRoundTopLeft(30);
        salir1.setRoundTopRight(30);
        salir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salir1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salir1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                salir1MouseReleased(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("←");
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout salir1Layout = new javax.swing.GroupLayout(salir1);
        salir1.setLayout(salir1Layout);
        salir1Layout.setHorizontalGroup(
            salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salir1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        salir1Layout.setVerticalGroup(
            salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salir1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 32));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 120));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 167, 540, 400));

        panelC.setBackground(new java.awt.Color(255, 255, 255));
        panelC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbldireccion.setBackground(new java.awt.Color(0, 0, 0));
        lbldireccion.setFont(new java.awt.Font("Dubai Medium", 0, 15)); // NOI18N
        lbldireccion.setForeground(new java.awt.Color(0, 0, 0));
        lbldireccion.setText("Dirección");
        panelC.add(lbldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 70, 30));

        lblmetodo.setBackground(new java.awt.Color(0, 0, 0));
        lblmetodo.setFont(new java.awt.Font("Dubai Medium", 0, 15)); // NOI18N
        lblmetodo.setForeground(new java.awt.Color(102, 102, 102));
        lblmetodo.setText("Método de pago");
        panelC.add(lblmetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 30));

        lblrevisar.setBackground(new java.awt.Color(0, 0, 0));
        lblrevisar.setFont(new java.awt.Font("Dubai Medium", 0, 15)); // NOI18N
        lblrevisar.setForeground(new java.awt.Color(102, 102, 102));
        lblrevisar.setText("Revisa tu pedido");
        panelC.add(lblrevisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 110, 30));

        cambio.setBackground(new java.awt.Color(0, 210, 172));

        javax.swing.GroupLayout cambioLayout = new javax.swing.GroupLayout(cambio);
        cambio.setLayout(cambioLayout);
        cambioLayout.setHorizontalGroup(
            cambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cambioLayout.setVerticalGroup(
            cambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        panelC.add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 38, -1, 2));

        getContentPane().add(panelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 540, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void salir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseClicked
        Principal obj=new Principal();
        Principal.lblpago2.setText(lbltotal.getText());
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salir1MouseClicked

    private void salir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseEntered
        salir1.setBackground(new Color(231,231,231));
    }//GEN-LAST:event_salir1MouseEntered

    private void salir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseExited
        salir1.setBackground(new Color(247,247,247));
    }//GEN-LAST:event_salir1MouseExited

    private void salir1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MousePressed
        salir1.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_salir1MousePressed

    private void salir1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseReleased
        salir1.setBackground(new Color(247,247,247));
    }//GEN-LAST:event_salir1MouseReleased

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
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel cambio;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lbldireccion;
    public static javax.swing.JLabel lblmetodo;
    public static javax.swing.JLabel lblrevisar;
    public static javax.swing.JLabel lbltotal;
    private javax.swing.JPanel panelC;
    private Sistema.PanelRound salir1;
    public static javax.swing.ButtonGroup zonas;
    // End of variables declaration//GEN-END:variables
}
