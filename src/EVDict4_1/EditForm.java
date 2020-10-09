/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVDict4_1;

import javax.swing.JOptionPane;

import static EVDict4_1.DictApp.dictApp;
import static EVDict4_1.DictionaryData.dictionaryType.EV;
import static EVDict4_1.DictionaryData.dictionaryType.VE;

/**
 * @author ADMIN
 */
public class EditForm extends javax.swing.JFrame {

    public EditForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
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
    }// </editor-fold>

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (wordTextField.getText().isEmpty() || meaningTextPane.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ô từ mới đang bị rỗng!!! Vui lòng nhập lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int answer = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn sửa từ này?", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            if (answer == JOptionPane.YES_OPTION) {
                String old_word = dictApp.dictList.getSelectedValue();
                String new_word = wordTextField.getText().toLowerCase();
                String meaning = meaningTextPane.getText();
                meaning = meaning.replace("\n", "");
                if (dictApp.state == EV) {
                    dictApp.dictEV.editInDict(old_word, new_word, meaning);
                } else if (dictApp.state == VE) {
                    dictApp.dictVE.editInDict(old_word, new_word, meaning);
                }
                JOptionPane.showMessageDialog(null, "Đã hoàn thành", "Thông báo", -1);
                setVisible(false);
                dictApp.initDictList();
            }
        }
    }

    private void evTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dictApp.state = EV;
//        JOptionPane.showMessageDialog(null, "Bạn đã chọn từ điển Anh-Việt", "Thông báo", -1);
    }

    private void veTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dictApp.state = VE;
//        JOptionPane.showMessageDialog(null, "Bạn đã chọn từ điển Việt Anh", "Thông báo", -1);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton evTypeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextPane meaningTextPane;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton veTypeButton;
    public javax.swing.JTextField wordTextField;
    // End of variables declaration
}

