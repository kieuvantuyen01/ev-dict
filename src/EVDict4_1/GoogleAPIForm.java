/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVDict4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import static EVDict4_1.DictApp.dictApp;
import static EVDict4_1.DictionaryData.dictionaryType.EV;
import static EVDict4_1.DictionaryData.dictionaryType.VE;

/**
 *
 * @author ADMIN
 */
public class GoogleAPIForm extends javax.swing.JFrame {

    public GoogleAPIForm() {
        initComponents();
        textSpeakerButton.setVisible(false);
        meaningSpeakerButton.setVisible(false);
    }

    private String translate(String langFrom, String langTo, String text) throws IOException {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        evTypeButton.setText("Eng_Viet");
        evTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evTypeButtonActionPerformed(evt);
            }
        });

        veTypeButton.setText("Viet_Anh");
        veTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veTypeButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Kiểu/Type:");

        jLabel2.setText("Văn bản/Text:");

        jLabel3.setText("Dịch/Meaning:");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    submitButtonActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(DictApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jScrollPane1.setViewportView(meaningTextPane);

        jScrollPane2.setViewportView(wordTextPane);

        textSpeakerButton.setText("Speaker");
        textSpeakerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSpeakerButtonActionPerformed(evt);
            }
        });

        meaningSpeakerButton.setText("Speaker");
        meaningSpeakerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meaningSpeakerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addComponent(evTypeButton)
                                                .addGap(151, 151, 151)
                                                .addComponent(veTypeButton)
                                                .addContainerGap(253, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(textSpeakerButton)
                                                        .addComponent(meaningSpeakerButton))
                                                .addGap(29, 29, 29))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitButton)
                                .addGap(344, 344, 344))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(evTypeButton)
                                        .addComponent(veTypeButton)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(82, 82, 82)
                                                .addComponent(textSpeakerButton)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(64, 64, 64)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(meaningSpeakerButton)
                                                .addGap(68, 68, 68)))
                                .addComponent(submitButton)
                                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
        String text = dictApp.apiForm.wordTextPane.getText();
        if (checkAvailable()) {
            if (wordTextPane.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ô văn bản đang bị trống!!! Vui lòng nhập lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                if (dictApp.state == EV) {
                    dictApp.apiForm.meaningTextPane.setText(dictApp.apiForm.translate("en", "vi", text));
                } else if (dictApp.state == VE) {
                    dictApp.apiForm.meaningTextPane.setText(dictApp.apiForm.translate("vi", "en", text));
                }
                textSpeakerButton.setVisible(true);
                meaningSpeakerButton.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng thử lại kết nối Internet!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void evTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dictApp.state = EV;
        JOptionPane.showMessageDialog(null, "Bạn đã chọn từ điển Anh-Việt", "Thông báo", -1);
    }

    private void veTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dictApp.state = VE;
        JOptionPane.showMessageDialog(null, "Bạn đã chọn từ điển Việt-Anh", "Thông báo", -1);
    }

    private void textSpeakerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dictApp.speaker.HandleVoice(wordTextPane.getText());
    }

    private void meaningSpeakerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dictApp.speaker.HandleVoice(meaningTextPane.getText());
    }

    // Variables declaration - do not modify
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
    // End of variables declaration

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
}