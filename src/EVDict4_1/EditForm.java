/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVDict4_1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class EditForm extends javax.swing.JFrame {
//
//    /**
//     * Creates new form EditForm
//     */
//    public EditForm() {
//        initComponents();
//    }
    
    public int state = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evTypeButton = new javax.swing.JButton();
        veTypeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        wordTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        meaningTextPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        evTypeButton.setText("Anh - Việt");
        evTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evTypeButtonActionPerformed(evt);
            }
        });

        veTypeButton.setText("Việt - Anh");
        veTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veTypeButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Loại từ:");

        jLabel2.setText("Từ: ");

        jLabel3.setText("Nghĩa của từ:");

        submitButton.setText("Xác nhận");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        meaningTextPane.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(meaningTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(evTypeButton)
                                .addGap(89, 89, 89)
                                .addComponent(veTypeButton)
                                .addGap(109, 109, 109))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                    .addComponent(wordTextField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(submitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evTypeButton)
                    .addComponent(veTypeButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitButton)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
//        if (wordTextField.getText().isEmpty() || meaningTextPane.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Ô từ mới đang bị rỗng!!! Vui lòng nhập lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
//        } else if (state == 0) {
//            if (dic1.getWord_target1().contains(wordTextField.getText())) {
//                JOptionPane.showMessageDialog(null, "Từ bị nhập vào đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
//            } else {
//                int answer = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thêm vào?", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//                if (answer == JOptionPane.YES_OPTION) {
//                    String word = wordTextField.getText().toLowerCase();
//                    String meaning = "<html>" + meaningTextPane.getText();
//                    dic1.word_target1.add(word);
//                    dic1.word_target1.sort(DictionaryData::compare);
//                    dic1.EVDict1.put(word, meaning);
//                    JOptionPane.showMessageDialog(null, "Đã hoàn thành", "Thông báo", -1);
//                    setVisible(false);
//                    DictApp::initJList();
//                }
//                
//            }
//        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void evTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evTypeButtonActionPerformed
        // TODO add your handling code here:
        state = 0;
        JOptionPane.showMessageDialog(null, "Bạn đã chọn từ điển Anh-Việt", "Thông báo", -1);
    }//GEN-LAST:event_evTypeButtonActionPerformed

    private void veTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veTypeButtonActionPerformed
        // TODO add your handling code here:
        state = 1;
        JOptionPane.showMessageDialog(null, "Bạn đã chọn từ điển Anh-Việt", "Thông báo", -1);
    }//GEN-LAST:event_veTypeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton evTypeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextPane meaningTextPane;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton veTypeButton;
    public javax.swing.JTextField wordTextField;
    // End of variables declaration//GEN-END:variables
}
