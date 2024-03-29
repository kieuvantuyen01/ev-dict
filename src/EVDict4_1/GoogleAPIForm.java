/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVDict4_1;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static EVDict4_1.DictApp.dictApp;
import static EVDict4_1.DictionaryData.dictionaryType.EV;
import static EVDict4_1.DictionaryData.dictionaryType.VE;

/**
 * @author Tham khảo trên Stackoverflow./Refer on Stackoverflow.
 */
public class GoogleAPIForm extends javax.swing.JFrame {

    /**
     * Creates new form GoogleAPIForm
     */
    public GoogleAPIForm(DictApp newDictApp) {
        dictApp = newDictApp;
        initComponents();
        textSpeakerButton.setVisible(false);
        meaningSpeakerButton.setVisible(false);
    }


    private static String translate(String langFrom, String langTo, String text) throws IOException {
        // INSERT YOU URL HERE
        String urlStr = "https://script.google.com/macros/s/AKfycbxiQVsKyWiGXFDU8LeW-fi9KfS0ZIE01ovCpDUJkbJL0-3R6lw/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +
                "&target=" + langTo +
                "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }


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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        meaningTextPane = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        wordTextPane = new javax.swing.JTextPane();
        textSpeakerButton = new javax.swing.JButton();
        meaningSpeakerButton = new javax.swing.JButton();
        dictLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        evTypeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/evdict.png"))); // NOI18N
        evTypeButton.setBorder(null);
        evTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evTypeButtonActionPerformed(evt);
            }
        });

        veTypeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/vedict.png"))); // NOI18N
        veTypeButton.setBorder(null);
        veTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veTypeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kiểu/Type:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Văn bản/Text:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dịch/Meaning:");

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitButton.setText("Xác nhận/Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(meaningTextPane);

        jScrollPane2.setViewportView(wordTextPane);

        textSpeakerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/speaker.png"))); // NOI18N
        textSpeakerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSpeakerButtonActionPerformed(evt);
            }
        });

        meaningSpeakerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/speaker.png"))); // NOI18N
        meaningSpeakerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meaningSpeakerButtonActionPerformed(evt);
            }
        });

        dictLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(evTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(veTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(dictLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textSpeakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meaningSpeakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(veTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dictLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(evTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(textSpeakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(meaningSpeakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String text = wordTextPane.getText();
        if (checkAvailable()) {
            if (wordTextPane.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ô văn bản đang bị trống!!! Vui lòng nhập lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                if (dictApp.state == EV) {
                    try {
                        meaningTextPane.setText(translate("en", "vi", text));
                    } catch (IOException ex) {
                        Logger.getLogger(GoogleAPIForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (dictApp.state == VE) {
                    try {
                        meaningTextPane.setText(translate("vi", "en", text));
                    } catch (IOException ex) {
                        Logger.getLogger(GoogleAPIForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                textSpeakerButton.setVisible(true);
                meaningSpeakerButton.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng thử lại kết nối Internet!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void veTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veTypeButtonActionPerformed
        // TODO add your handling code here:
        dictApp.state = VE;
        dictLabel.setText("Việt - Anh");
    }//GEN-LAST:event_veTypeButtonActionPerformed

    private void textSpeakerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSpeakerButtonActionPerformed
        // TODO add your handling code here:
        dictApp.speaker.HandleVoice(wordTextPane.getText());
    }//GEN-LAST:event_textSpeakerButtonActionPerformed

    private void meaningSpeakerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meaningSpeakerButtonActionPerformed
        // TODO add your handling code here:
        dictApp.speaker.HandleVoice(meaningTextPane.getText());
    }//GEN-LAST:event_meaningSpeakerButtonActionPerformed

    private void evTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evTypeButtonActionPerformed
        // TODO add your handling code here:
        dictApp.state = EV;
        dictLabel.setText("Anh - Việt");
    }//GEN-LAST:event_evTypeButtonActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GoogleAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GoogleAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GoogleAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GoogleAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GoogleAPIForm().setVisible(true);
//            }
//        });
//    }
    private boolean checkAvailable() {
        try {
            final URL url = new URL("http://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
            conn.getInputStream().close();
            return true;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dictLabel;
    private javax.swing.JButton evTypeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton meaningSpeakerButton;
    private javax.swing.JTextPane meaningTextPane;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton textSpeakerButton;
    private javax.swing.JButton veTypeButton;
    private javax.swing.JTextPane wordTextPane;
    // End of variables declaration//GEN-END:variables
}
