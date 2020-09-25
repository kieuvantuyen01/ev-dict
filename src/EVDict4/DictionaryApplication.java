/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVDict4;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DictionaryApplication extends javax.swing.JFrame {
    DictionaryManagement dic_Application;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form DictionaryApplication
     */
    public DictionaryApplication() {
        initComponents();
        
        dic_Application = new DictionaryManagement();
        dic_Application.insertFromFile();   // Đọc file dictionary lên
        speakerButton.setVisible(false);    // Ẩn speakerButton từ đầu
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchWordTextField = new javax.swing.JTextField();
        search_Button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        signInButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        fixButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordTable = new javax.swing.JTable();
        bookmarkButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        historyButton = new javax.swing.JButton();
        trashButton = new javax.swing.JButton();
        practiceButton = new javax.swing.JButton();
        tutorialButton = new javax.swing.JButton();
        findWordLabel = new javax.swing.JLabel();
        speakerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EVDICT");

        searchWordTextField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchWordTextField.setText("Search EVDict Learner's Dictionary ");

        search_Button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        search_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/search_icon.jpg"))); // NOI18N
        search_Button.setText("Search");
        search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchWordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_Button))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(search_Button)
                .addComponent(searchWordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        signInButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        signInButton.setText("Sign in");

        signUpButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        signUpButton.setText("Sign up");

        addButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/add_icon.jpg"))); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/delete_icon.jpg"))); // NOI18N

        fixButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/edit_icon.jpg"))); // NOI18N

        exportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/output_icon.jpg"))); // NOI18N
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(addButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(signUpButton)
                .addGap(18, 18, 18)
                .addComponent(signInButton))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fixButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        wordTable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        wordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Word", "Meaning"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        wordTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(wordTable);

        bookmarkButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/important_icon.jpg"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/arrow.jpg"))); // NOI18N

        historyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/history_icon.jpg"))); // NOI18N

        trashButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/trashcan_icon.jpg"))); // NOI18N

        practiceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/practice_icon.jpg"))); // NOI18N
        practiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practiceButtonActionPerformed(evt);
            }
        });

        tutorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/guide_icon.jpg"))); // NOI18N
        tutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialButtonActionPerformed(evt);
            }
        });

        findWordLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        speakerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4/image/speaker_icon.jpg"))); // NOI18N
        speakerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bookmarkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(historyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trashButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(practiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tutorialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(findWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(speakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bookmarkButton)
                        .addGap(18, 18, 18)
                        .addComponent(historyButton)
                        .addGap(18, 18, 18)
                        .addComponent(trashButton)
                        .addGap(18, 18, 18)
                        .addComponent(practiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tutorialButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(findWordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(speakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_ButtonActionPerformed
        defaultTableModel = new DefaultTableModel();
        wordTable.setModel(defaultTableModel);       
        defaultTableModel.addColumn("Word");
        defaultTableModel.addColumn("Meaning");        
        String word_Searching = String.valueOf(searchWordTextField.getText());
        word_Searching = word_Searching.toLowerCase();
        boolean finding_Word = false;  // Biến để kiểm tra xem từ ms nhập có trong từ điển không
        
        for(Word word_iterator : dic_Application.dict.words) {
            if(word_iterator.getWord_target().equals(word_Searching)) {
                String word_Target = word_iterator.getWord_target();
                String word_explain= word_iterator.getWord_explain();
                defaultTableModel.addRow(new Object[]{word_Target, word_explain});  // Tải dữ liệu lên Table
                finding_Word = true;  // Gán biến kiểm tra = true
                break;
            }
        }
        if(finding_Word) {
            speakerButton.setVisible(true);   // Hiện speakerButton để nói
            findWordLabel.setText("");        // Ẩn label thông báo ko tìm dc từ
        }
        if(!finding_Word) {
            speakerButton.setVisible(false);   // Ẩn speakerButton 
            findWordLabel.setText("Can't find the word in dictionary!"); // Hiện label thông báo ko tìm dc từ
        }
    }//GEN-LAST:event_search_ButtonActionPerformed

    private void speakerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakerButtonActionPerformed
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice("kevin16");
        voice.allocate();
        voice.speak(searchWordTextField.getText());  
    }//GEN-LAST:event_speakerButtonActionPerformed

    private void tutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialButtonActionPerformed
        new tutorialFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tutorialButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportButtonActionPerformed

    private void practiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_practiceButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton bookmarkButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JLabel findWordLabel;
    private javax.swing.JButton fixButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton practiceButton;
    private javax.swing.JTextField searchWordTextField;
    private javax.swing.JButton search_Button;
    private javax.swing.JButton signInButton;
    private javax.swing.JButton signUpButton;
    private javax.swing.JButton speakerButton;
    private javax.swing.JButton trashButton;
    private javax.swing.JButton tutorialButton;
    private javax.swing.JTable wordTable;
    // End of variables declaration//GEN-END:variables
}
