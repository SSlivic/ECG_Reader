/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ecg.reader;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanja
 */
public class TachycardiaNR extends javax.swing.JFrame  {

  private ImageIcon image1;
  private ImageIcon image2;
  private ImageIcon image3;

    /**
     * Creates new form Tachycardia
     */
 
       
    public TachycardiaNR() {
        initComponents();
     /* setLayout(new FlowLayout());
       
       image1 = new ImageIcon(getClass().getResource("sintah.jpg"));
    
      inputImage1=new JLabel(image1);
      add(inputImage1);
      
       image2 = new ImageIcon(getClass().getResource("aflater.jpg"));
      inputImage2=new JLabel(image2);
      add(inputImage2);
    
      image3 = new ImageIcon(getClass().getResource("Supraventricular-tachycardia-SVT.jpg"));
      inputImage3=new JLabel(image3);
      add(inputImage3);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        txtTachycardia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        stTherapy = new javax.swing.JButton();
        afTherapy = new javax.swing.JButton();
        svtTherapy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTachycardia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTachycardia.setText("Tachycardia - regular rhythm and narrow QRS");
        getContentPane().add(txtTachycardia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 12, -1, -1));

        jLabel1.setText("1. Synus Tachycardia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 52, 130, -1));

        jLabel2.setText("2. Atrial flutter 2:1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel3.setText("3. Supraventicular Tachycardia");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        stTherapy.setText("st therapy");
        stTherapy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stTherapyMouseClicked(evt);
            }
        });
        getContentPane().add(stTherapy, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        afTherapy.setText("af therapy");
        afTherapy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                afTherapyMouseClicked(evt);
            }
        });
        getContentPane().add(afTherapy, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        svtTherapy.setText("SVT therapy");
        svtTherapy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svtTherapyMouseClicked(evt);
            }
        });
        getContentPane().add(svtTherapy, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecg/reader/sintah.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 270, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecg/reader/aflater.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 230, 130));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecg/reader/Supraventricular-tachycardia-SVT.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 630, 130));

        setSize(new java.awt.Dimension(714, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stTherapyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stTherapyMouseClicked
        // TODO add your handling code here:
                        JOptionPane.showMessageDialog(null,"Treatment should carefully focus on the underlying cause.","Therapy",JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_stTherapyMouseClicked

    private void afTherapyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_afTherapyMouseClicked
        // TODO add your handling code here:
   JOptionPane.showMessageDialog(null,"Anti-arrhythmics, synchronized cardioversion, anti-coagulation therapy.","Therapy",JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_afTherapyMouseClicked

    private void svtTherapyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svtTherapyMouseClicked
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(null,"Carotid sinus massage, Vagal maneuvers, medications","Therapy",JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_svtTherapyMouseClicked
     
       
        
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
            java.util.logging.Logger.getLogger(TachycardiaNR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TachycardiaNR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TachycardiaNR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TachycardiaNR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TachycardiaNR().setVisible(true);
           //     new TachycardiaNR().pack();
            }
        });
        

       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afTherapy;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton stTherapy;
    private javax.swing.JButton svtTherapy;
    private javax.swing.JLabel txtTachycardia;
    // End of variables declaration//GEN-END:variables

   
}