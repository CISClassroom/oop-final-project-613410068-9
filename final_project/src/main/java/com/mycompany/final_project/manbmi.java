/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.final_project;

/**
 *
 * @author 66982
 */
public class manbmi extends javax.swing.JFrame {

    /**
     * Creates new form manbmi
     */
    public manbmi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        tf_weightbmi = new javax.swing.JTextField();
        tf_hightbmi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_reset = new javax.swing.JButton();
        tf_showbmi = new javax.swing.JTextField();
        lb_show = new javax.swing.JLabel();
        bt_cal1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(532, 418));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        jLabel4.setText("Body Mass Index");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 34));
        getContentPane().add(tf_weightbmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 174, 29));
        getContentPane().add(tf_hightbmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 174, 29));

        jLabel1.setText("Weigth");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel2.setText("Hight");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        bt_reset.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        bt_reset.setText("reset");
        bt_reset.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bt_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetActionPerformed(evt);
            }
        });
        getContentPane().add(bt_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 80, 40));

        tf_showbmi.setText("0");
        getContentPane().add(tf_showbmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 174, 29));

        lb_show.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        getContentPane().add(lb_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 144, 37));

        bt_cal1.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        bt_cal1.setText("cal");
        bt_cal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cal1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_cal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 80, 40));

        jLabel5.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel5.setText("30 ขึ้นไปน้ำหนักเกิน");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 140, 30));

        jLabel6.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel6.setText("เพศชาย");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 60, 30));

        jLabel7.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel7.setText("น้อยกว่า 19 ผอมบาง");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 140, 30));

        jLabel8.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel8.setText("19 - 24.9 พอเหมาะ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 130, 30));

        jLabel9.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel9.setText("25 - 29.9 น้ำหนักเกิน");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 140, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\66982\\Pictures\\9999999999.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        BMI bmi = new BMI();
    private void bt_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetActionPerformed
        
        tf_weightbmi.setText("");
        tf_hightbmi.setText("");
        tf_showbmi.setText("");
        lb_show.setText("");
    }//GEN-LAST:event_bt_resetActionPerformed

    private void bt_cal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cal1ActionPerformed
        bmi.tf_weigthBMI = Double.valueOf(tf_weightbmi.getText());
        bmi.tf_hightBMI = Double.valueOf(tf_hightbmi.getText());
        String bmiresult = String.valueOf(bmi.Bmi(bmi.tf_weigthBMI, bmi.tf_hightBMI));
        tf_showbmi.setText(bmiresult);
        lb_show.setText(bmi.mancheckclass(Double.valueOf(bmiresult)));
    }//GEN-LAST:event_bt_cal1ActionPerformed

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
            java.util.logging.Logger.getLogger(manbmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manbmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manbmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manbmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manbmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cal1;
    private javax.swing.JButton bt_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_show;
    private javax.swing.JTextField tf_hightbmi;
    private javax.swing.JTextField tf_showbmi;
    private javax.swing.JTextField tf_weightbmi;
    // End of variables declaration//GEN-END:variables
}
