/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Sistema.metodoP;

import Clases.Carrito1;
import Sistema.Carrito;
import static Sistema.Carrito.lbltotal;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import movimiento.MoverComp;

/**
 *
 * @author CRISTHIAN
 */
public class direccion extends javax.swing.JPanel {
    public direccion() {
        initComponents();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rbt3 = new javax.swing.JRadioButton();
        rbt1 = new javax.swing.JRadioButton();
        rbt2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        subtotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbld = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        txtd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cont.setBackground(new java.awt.Color(255, 255, 255));
        cont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbt3.setForeground(new java.awt.Color(43, 45, 66));
        rbt3.setText("Lima Norte");
        jPanel1.add(rbt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 98, -1));

        rbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbt1.setForeground(new java.awt.Color(43, 45, 66));
        rbt1.setText("Lima Sur");
        jPanel1.add(rbt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 98, -1));

        rbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbt2.setForeground(new java.awt.Color(43, 45, 66));
        rbt2.setText("Lima Centro");
        jPanel1.add(rbt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 45, 66));
        jLabel3.setText("Seleccionar zona:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        cont.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 145, 140));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 45, 66));
        jLabel4.setText("Pendiente");
        cont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 77, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        cont.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 2, 100));

        subtotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subtotal.setForeground(new java.awt.Color(43, 45, 66));
        cont.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 60, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 45, 66));
        jLabel6.setText("Total: ");
        cont.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, 20));

        lbld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbld.setForeground(new java.awt.Color(43, 45, 66));
        lbld.setText("Delivery: ");
        cont.add(lbld, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 120, 20));

        jButton1.setForeground(new java.awt.Color(60, 63, 65));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        cont.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 45, 66));
        jLabel7.setText("Subtotal:");
        cont.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 60, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("Nombre:");
        cont.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, -1));
        cont.add(txtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, -1));
        cont.add(txtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 45, 66));
        jLabel11.setText("DNI:");
        cont.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, -1));
        cont.add(txtdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 120, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 45, 66));
        jLabel12.setText("Dirección:");
        cont.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, -1));

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        cont.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 110, 30));

        add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 400));
    }// </editor-fold>//GEN-END:initComponents
    double hallarD(boolean p1, boolean p2, boolean p3){
        double valor=0;
        if (rbt1.isSelected())
            valor=10.0;
        if (rbt2.isSelected())
            valor=15.0;
        if (rbt3.isSelected())
            valor=20.0;
        return valor;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double total;
        Carrito1 obj=new Carrito1();
        total = obj.totalPago();
        subtotal.setText(""+total);
        double valor = 0;
        boolean p1 = rbt1.isSelected(),p2=rbt2.isSelected(),p3=rbt3.isSelected();
        valor = hallarD(p1,p2,p3);
        lbld.setText("Delivery:      "+valor);
        double subt = Double.parseDouble(subtotal.getText());
        double tot = subt + valor;
        jLabel6.setText("Total:         "+tot);
        lbltotal.setText(""+tot);
    }//GEN-LAST:event_jButton1ActionPerformed
        public void showPanel(JPanel m){
            m.setSize(540, 400);
            m.setLocation(0, 0);
            Carrito.contenedor.removeAll();
            Carrito.contenedor.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
            Carrito.contenedor.revalidate();
            Carrito.contenedor.repaint();
        }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(txtn.getText().equals("")||txtd.getText().equals("")||txtdi.getText().equals("")||!(rbt1.isSelected()||rbt2.isSelected()||rbt3.isSelected())){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
            metodoPago m = new metodoPago();
            showPanel(m);
            MoverComp.Derecha(Carrito.cambio, 2, 1, 200);
            Carrito.lblmetodo.setForeground(Color.BLACK);
            Carrito.lbldireccion.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cont;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbld;
    private javax.swing.JRadioButton rbt1;
    private javax.swing.JRadioButton rbt2;
    private javax.swing.JRadioButton rbt3;
    public static javax.swing.JLabel subtotal;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txtdi;
    private javax.swing.JTextField txtn;
    // End of variables declaration//GEN-END:variables
}
