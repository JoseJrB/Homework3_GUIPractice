/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.Practice3.GUIPractice;

import javax.swing.JOptionPane;

/**
 *
 * @author jrbusadre
 */
public class Milestone_Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Milestone_Calculator
     */
    public Milestone_Calculator() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMilestone1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMilestone2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTerminalAssessment = new javax.swing.JTextField();
        calculateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Milestone Calculator");

        jLabel2.setText("Student Name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Milestone 1:");

        txtMilestone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMilestone1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Milestone 2:");

        txtMilestone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMilestone2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Terminal Assessment:");
        jLabel5.setToolTipText("");

        txtTerminalAssessment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerminalAssessmentActionPerformed(evt);
            }
        });

        calculateBtn.setBackground(new java.awt.Color(0, 0, 153));
        calculateBtn.setForeground(new java.awt.Color(255, 255, 255));
        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addComponent(txtName)
                    .addComponent(txtMilestone1)
                    .addComponent(txtMilestone2)
                    .addComponent(txtTerminalAssessment)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMilestone1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMilestone2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTerminalAssessment, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtMilestone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMilestone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMilestone1ActionPerformed

    private void txtMilestone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMilestone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMilestone2ActionPerformed

    private void txtTerminalAssessmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerminalAssessmentActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_txtTerminalAssessmentActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();

    try {
        // Get and convert milestone grades from text fields to numeric values
        double grade1 = Double.parseDouble(txtMilestone1.getText()); // Milestone 1 (Max: 25) 
        double grade2 = Double.parseDouble(txtMilestone2.getText()); // Milestone 2 (Max: 40)
        double grade3 = Double.parseDouble(txtTerminalAssessment.getText()); // Terminal Assessment (Max: 35) 

        // Check if Milestone 1 is within the valid range (0–25) 
        if (grade1 < 0 || grade1 > 25) {
            JOptionPane.showMessageDialog(this, "Milestone 1 must be between 0 and 25.");
            return;
        }
        
        // Check if Milestone 2 is within the valid range (0–40)
        if (grade2 < 0 || grade2 > 40) {
            JOptionPane.showMessageDialog(this, "Milestone 2 must be between 0 and 40.");
            return;
        }
        
        // Check if Terminal Assessment is within the valid range (0–35) 
        if (grade3 < 0 || grade3 > 35) {
            JOptionPane.showMessageDialog(this, "Terminal Assessment must be between 0 and 35.");
            return;
        }

        // Compute the total grade from all milestones
        double total = grade1 + grade2 + grade3;
        
        // Prepare the message to show to the student 
        String message = String.format("Hi %s! Your total score is: %.2f", name, total);
        
        // Determine if the student passed or failed based on total score
        if (total >= 75) {
            message += "\nStatus: Passed";
        } else {
            message += "\nStatus: Failed";
        }
        
        // Display the result in a dialog box
        JOptionPane.showMessageDialog(this, message);

    } catch (NumberFormatException ex) {
        // Handle input that is not a valid number (e.g., letters or symbols)
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for all grades!");
    }
    }//GEN-LAST:event_calculateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Milestone_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Milestone_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Milestone_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Milestone_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Milestone_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtMilestone1;
    private javax.swing.JTextField txtMilestone2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTerminalAssessment;
    // End of variables declaration//GEN-END:variables
}
