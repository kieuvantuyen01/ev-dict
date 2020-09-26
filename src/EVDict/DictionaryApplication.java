/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVDict;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DictionaryApplication extends javax.swing.JFrame {
    DictionaryManagement dic_Application;
    int check_language;   
    String voice_speak;    
    /**
     * Creates new form DictionaryApplication
     */
    public DictionaryApplication() {
        initComponents();
        
        dic_Application = new DictionaryManagement();
        dic_Application.insertFromFileE_V();   // Đọc file dictionariesE_V lên
        dic_Application.insertFromFileV_E();   // Đọc file dictionariesV_E lên
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        outputButton = new javax.swing.JButton();
        languageCombobox = new javax.swing.JComboBox<>();
        speakerButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        importantButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        trashcanButton = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        tutorialButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        meaningPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EVDICT");

        searchWordTextField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchWordTextField.setText("Search EVDict Learner's Dictionary ");
        searchWordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchWordTextFieldMouseClicked(evt);
            }
        });
        searchWordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchWordTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchWordTextFieldKeyReleased(evt);
            }
        });

        search_Button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        search_Button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\search_icon.jpg")); // NOI18N
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
                .addComponent(searchWordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_Button))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(search_Button)
                .addComponent(searchWordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Sign in");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Sign up");

        addButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\add_icon.jpg")); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\delete_icon.jpg")); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\edit_icon.jpg")); // NOI18N
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        outputButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\output_icon.jpg")); // NOI18N

        languageCombobox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        languageCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vietnamese-English", "English-Vietnamese" }));
        languageCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageComboboxActionPerformed(evt);
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
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(languageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(languageCombobox))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        speakerButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\speaker_icon.jpg")); // NOI18N
        speakerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakerButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        importantButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\important_icon.jpg")); // NOI18N
        importantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importantButtonActionPerformed(evt);
            }
        });

        historyButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\history_icon.jpg")); // NOI18N
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        trashcanButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\trashcan_icon.jpg")); // NOI18N
        trashcanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trashcanButtonActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\practice_icon.jpg")); // NOI18N

        tutorialButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\EVDict\\src\\EVDict\\image\\guide_icon.jpg")); // NOI18N
        tutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(importantButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(historyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(trashcanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tutorialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(importantButton)
                .addGap(18, 18, 18)
                .addComponent(historyButton)
                .addGap(18, 18, 18)
                .addComponent(trashcanButton)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tutorialButton)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        wordList.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        wordList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                wordListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(wordList);

        meaningPane.setContentType("text/html"); // NOI18N
        meaningPane.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        meaningPane.setText("");
        jScrollPane2.setViewportView(meaningPane);
        meaningPane.getAccessibleContext().setAccessibleDescription("text/plain");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(speakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(110, 110, 110))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(speakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_ButtonActionPerformed
        String word_Searching = String.valueOf(searchWordTextField.getText());
        word_Searching = word_Searching.toLowerCase();
        boolean finding_Word = false;  // Biến để kiểm tra xem từ ms nhập có trong từ điển không
        
        if (check_language == 0) { 
            for (Word word_iterator : dic_Application.dict.wordsV_E) {
                if (word_iterator.getWord_target().equals(word_Searching)) {
                    String word_explain = word_iterator.getWord_explain();
                    voice_speak = word_iterator.getWord_target();
                    meaningPane.setText(word_explain);
                    finding_Word = true;  // Gán biến kiểm tra = true
                    break;
                }
            }
        }       
        if (check_language == 1) { 
            for (Word word_iterator : dic_Application.dict.wordsE_V) {
                if (word_iterator.getWord_target().equals(word_Searching)) {
                    String word_explain = word_iterator.getWord_explain();
                    voice_speak = word_iterator.getWord_target();
                    meaningPane.setText(word_explain);
                    finding_Word = true;  // Gán biến kiểm tra = true
                    break;
                }
            }
        }
        
        if (finding_Word) {
            speakerButton.setVisible(true);   // Hiện speakerButton để nói
        }
        if (!finding_Word) {
            setInterfaceToDefault();           // Set frame về default
        }
    }//GEN-LAST:event_search_ButtonActionPerformed

    private void speakerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakerButtonActionPerformed
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();   // Phương thức xử lí giọng nói
        voice = voiceManager.getVoice("kevin16");
        voice.allocate();
        voice.speak(voice_speak);  
    }//GEN-LAST:event_speakerButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        new addFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       new deleteFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
       new editFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    private void searchWordTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchWordTextFieldMouseClicked
        String word_Searching = String.valueOf(searchWordTextField.getText());  // Khi click chuột vào ô search sẽ mất dòng chữ ban đầu
        if (word_Searching.equals("Search EVDict Learner's Dictionary ")) {
            searchWordTextField.setText("");
        }
    }//GEN-LAST:event_searchWordTextFieldMouseClicked

    private void searchWordTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchWordTextFieldKeyPressed
       
    }//GEN-LAST:event_searchWordTextFieldKeyPressed
    
    void getDataV_E(String word_Seacher) {
        String[] word_Find;                                           
        word_Find = dic_Application.dictionarySearcherV_E(word_Seacher);
        wordList.setListData(word_Find);
    }
    
    void getDataE_V(String word_Seacher) {
        String[] word_Find;                                           
        word_Find = dic_Application.dictionarySearcherE_V(word_Seacher);
        wordList.setListData(word_Find);
    }
    
    void setInterfaceToDefault() {
        String[] word_Find = new String[1];
        word_Find[0] = "";
        wordList.setListData(word_Find);
        speakerButton.setVisible(false);
        meaningPane.setText("");
    }
    
    private void searchWordTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchWordTextFieldKeyReleased
        String word_Seacher = String.valueOf(searchWordTextField.getText());
        word_Seacher = word_Seacher.toLowerCase();
        if (word_Seacher.length() > 0) {
            if (check_language == 0) {
                getDataV_E(word_Seacher);
            }
            else if (check_language == 1) {
                getDataE_V(word_Seacher);
            }
        }
        if (word_Seacher.length() == 0) {
            setInterfaceToDefault();   // Set frame về default
        }
    }//GEN-LAST:event_searchWordTextFieldKeyReleased

    private void languageComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageComboboxActionPerformed
        String language_selected = languageCombobox.getSelectedItem().toString();
        if (language_selected.equals("Vietnamese-English")) {
            setInterfaceToDefault();
            searchWordTextField.setText("Search EVDict Learner's Dictionary ");
            check_language = 0;          
        }
        else if (language_selected.equals("English-Vietnamese")) {
            setInterfaceToDefault();
            searchWordTextField.setText("Search EVDict Learner's Dictionary ");
            check_language = 1;   
        }
    }//GEN-LAST:event_languageComboboxActionPerformed

    private void wordListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_wordListValueChanged
        String word_list_selected = wordList.getSelectedValue();
        if (check_language == 0) {
            for (Word word_iterator : dic_Application.dict.wordsV_E) {
                if (word_iterator.getWord_target().equals(word_list_selected)) {
                    String word_explain = word_iterator.getWord_explain();
                    voice_speak = word_iterator.getWord_target();
                    meaningPane.setText(word_explain);
                    speakerButton.setVisible(true);
                    break;
                }
            }
        }
        else if (check_language == 1) {
            for (Word word_iterator : dic_Application.dict.wordsE_V) {
                if (word_iterator.getWord_target().equals(word_list_selected)) {
                    String word_explain = word_iterator.getWord_explain();
                    voice_speak = word_iterator.getWord_target();
                    meaningPane.setText(word_explain);
                    speakerButton.setVisible(true);
                    break;
                }
            }
        }
    }//GEN-LAST:event_wordListValueChanged

    private void tutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialButtonActionPerformed
        new tutorialFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tutorialButtonActionPerformed

    private void trashcanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trashcanButtonActionPerformed
        new trashcanFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_trashcanButtonActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        new historyFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_historyButtonActionPerformed

    private void importantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importantButtonActionPerformed
        new importantFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_importantButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JButton importantButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> languageCombobox;
    private javax.swing.JTextPane meaningPane;
    private javax.swing.JButton outputButton;
    private javax.swing.JTextField searchWordTextField;
    private javax.swing.JButton search_Button;
    private javax.swing.JButton speakerButton;
    private javax.swing.JButton trashcanButton;
    private javax.swing.JButton tutorialButton;
    private javax.swing.JList<String> wordList;
    // End of variables declaration//GEN-END:variables
}