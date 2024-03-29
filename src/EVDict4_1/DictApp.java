/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVDict4_1;


import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static EVDict4_1.DictionaryData.dictionaryType.EV;
import static EVDict4_1.DictionaryData.dictionaryType.VE;
import static EVDict4_1.DictionaryData.dictionaryType.RECENT;
import static EVDict4_1.DictionaryData.dictionaryType.BOOKMARK;


/**
 * @author ADMIN
 */
public class DictApp extends javax.swing.JFrame {

    /**
     * Creates new form DictApp
     */
    public DictApp() {
        initComponents();
        initRecentWordList();
        speakerButton.setVisible(false);
    }

    public DictionaryData.dictionaryType state = RECENT;
    public int check_input = 0;
    DefaultListModel list = new DefaultListModel();
    String word_select = "";

    FileImplement dictEV = new FileImplement(EV);
    FileImplement dictVE = new FileImplement(VE);

    DictionaryData da = new DictionaryData();

    VoiceImplement speaker = new VoiceImplement();

    AddForm af = new AddForm(this);
    EditForm ef = new EditForm(this);
    GoogleAPIForm apiForm = new GoogleAPIForm(this);
    PracticeForm pf = new PracticeForm(this);

    public void initRecentWordList() {
        list = da.initRecentList(da.recentWord);
        dictList.setModel(list);
    }

    public void initBookmarkWordList() {
        list = da.initBookmarkList(da.markedWord);
        dictList.setModel(list);
    }

    public void initDictList() {
        list = new DefaultListModel();
        if (state == EV) {
            list = dictEV.initDict();
        } else if (state == VE) {
            list = dictVE.initDict();
        }
        dictList.setModel(list);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dictList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        meaningTextPane = new javax.swing.JTextPane();
        speakerButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        evButton = new javax.swing.JButton();
        veButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        apiButton = new javax.swing.JButton();
        practiceButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        addBmButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        selectMenu1 = new javax.swing.JMenu();
        recentWordMenuItem = new javax.swing.JMenuItem();
        bookmarkMenuItem = new javax.swing.JMenuItem();
        guideMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenu();
        stateMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VTT Dictionary");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        searchTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchTextField.setText("Tra cứu từ ở đây bạn nhé...");
        searchTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextFieldMouseClicked(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        dictList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dictListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(dictList);

        meaningTextPane.setBackground(new java.awt.Color(204, 204, 255));
        meaningTextPane.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(meaningTextPane);

        speakerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/speaker.png"))); // NOI18N
        speakerButton.setToolTipText("Pronounce");
        speakerButton.setBorder(null);
        speakerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakerButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        addButton.setBackground(new java.awt.Color(153, 153, 255));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/add.png"))); // NOI18N
        addButton.setToolTipText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(153, 153, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/remove.png"))); // NOI18N
        deleteButton.setToolTipText("Remove");
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(153, 153, 255));
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/edit.png"))); // NOI18N
        editButton.setToolTipText("Edit");
        editButton.setBorder(null);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        exportButton.setBackground(new java.awt.Color(153, 153, 255));
        exportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/export.png"))); // NOI18N
        exportButton.setToolTipText("Update File");
        exportButton.setBorder(null);
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        evButton.setBackground(new java.awt.Color(153, 153, 255));
        evButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/evdict.png"))); // NOI18N
        evButton.setToolTipText("English - Vietnamese");
        evButton.setBorder(null);
        evButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evButtonActionPerformed(evt);
            }
        });

        veButton.setBackground(new java.awt.Color(153, 153, 255));
        veButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/vedict.png"))); // NOI18N
        veButton.setToolTipText("Tiếng Việt - Tiếng Anh");
        veButton.setBorder(null);
        veButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(logoLabel)
                .addGap(56, 56, 56)
                .addComponent(evButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(veButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(evButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(veButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        apiButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/ggtranslate.png"))); // NOI18N
        apiButton.setText("Dịch văn bản");
        apiButton.setToolTipText("Translate Text");
        apiButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        apiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apiButtonActionPerformed(evt);
            }
        });

        practiceButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        practiceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/practice.png"))); // NOI18N
        practiceButton.setText("Luyện tập");
        practiceButton.setToolTipText("Practice");
        practiceButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        practiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practiceButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/search.png"))); // NOI18N
        searchButton.setText("Tra cứu");
        searchButton.setToolTipText("Search");
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        addBmButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addBmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/addbookmark.png"))); // NOI18N
        addBmButton.setText("Lưu từ");
        addBmButton.setToolTipText("Add to Bookmark");
        addBmButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addBmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(apiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(practiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addBmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(addBmButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(apiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(practiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        selectMenu1.setText("Tuỳ chọn");
        selectMenu1.setToolTipText("");
        selectMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        recentWordMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        recentWordMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/history.png"))); // NOI18N
        recentWordMenuItem.setText("Lịch sử tìm kiếm");
        recentWordMenuItem.setToolTipText("Search history");
        recentWordMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recentWordMenuItemActionPerformed(evt);
            }
        });
        selectMenu1.add(recentWordMenuItem);

        bookmarkMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        bookmarkMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/bookmark.png"))); // NOI18N
        bookmarkMenuItem.setText("Từ đánh dấu");
        bookmarkMenuItem.setToolTipText("Bookmark");
        bookmarkMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookmarkMenuItemActionPerformed(evt);
            }
        });
        selectMenu1.add(bookmarkMenuItem);

        jMenuBar1.add(selectMenu1);

        guideMenu.setText("Hướng dẫn");
        guideMenu.setToolTipText("Guide");
        guideMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        guideMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guideMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(guideMenu);

        aboutMenu.setText("Giới thiệu");
        aboutMenu.setToolTipText("About us");
        aboutMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aboutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(aboutMenu);

        stateMenu.setText("Vui lòng chọn trạng thái từ điển !!! - Please select the status of the dictionary !!!");
        stateMenu.setToolTipText("");
        stateMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.add(stateMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(speakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchTextField)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String searchWord = searchTextField.getText();
            if (searchWord.trim().isEmpty()) {
                speakerButton.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, "Từ đang bị trống, vui lòng nhập lại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else if (dictEV.getWord().contains(searchWord)) {
                speakerButton.setVisible(true);
                meaningTextPane.setText(dictEV.getDictData().get(searchWord));
            } else if (dictVE.getWord().contains(searchWord)) {
                speakerButton.setVisible(true);
                meaningTextPane.setText(dictVE.getDictData().get(searchWord));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Từ này đang không có trong từ điển!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        // TODO add your handling code here:
        ArrayList<String> newDictList = new ArrayList<>();
        list = new DefaultListModel<>();
        String searchWord = searchTextField.getText();
        if (searchWord.trim().isEmpty()) {
            speakerButton.setVisible(false);
            newDictList = new ArrayList(dictEV.getWord());
        } else if (state == EV) {
            newDictList = dictEV.searchWord(searchWord, dictEV.getWord());
        } else if (state == VE) {
            newDictList = dictVE.searchWord(searchWord, dictVE.getWord());
        }
        for (String word : newDictList) {
            list.addElement(word);
        }
        dictList.setModel(list);
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void dictListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dictListValueChanged
        // TODO add your handling code here:
        word_select = dictList.getSelectedValue();
        searchTextField.setText(word_select);
        da.saveToRencent(word_select);
        try {
            da.readToFile(da.recentWord, "data\\RecentList.txt");
        } catch (IOException ex) {
            Logger.getLogger(DictApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        String meaning = "";
        if (state == RECENT || state == BOOKMARK) {
            if (dictEV.getWord().contains(word_select)) {
                meaning = dictEV.getDictData().get(word_select);
            } else if (dictVE.getWord().contains(word_select)) {
                meaning = dictVE.getDictData().get(word_select);
            }
        }
        if (state == EV) {
            meaning = dictEV.getDictData().get(word_select);
        } else if (state == VE) {
            meaning = dictVE.getDictData().get(word_select);
        }
        speakerButton.setVisible(true);
        meaningTextPane.setText(meaning);
    }//GEN-LAST:event_dictListValueChanged

    private void evButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evButtonActionPerformed
        // TODO add your handling code here:
        searchTextField.setText("");
        meaningTextPane.setText("");
        stateMenu.setText("State: English - Vietnamese");
        state = EV;
        initDictList();
    }//GEN-LAST:event_evButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String searchWord = searchTextField.getText();
        if (searchWord.trim().isEmpty()) {
            speakerButton.setVisible(false);
            JOptionPane.showMessageDialog(rootPane, "Từ đang bị trống, vui lòng nhập lại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (dictEV.getWord().contains(searchWord)) {
            speakerButton.setVisible(true);
            meaningTextPane.setText(dictEV.getDictData().get(searchWord));
        } else if (dictVE.getWord().contains(searchWord)) {
            speakerButton.setVisible(true);
            meaningTextPane.setText(dictVE.getDictData().get(searchWord));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Từ này đang không có trong từ điển!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        af.setVisible(true);
        af.wordTextField.setText("");
        af.meaningTextPane.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void veButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veButtonActionPerformed
        // TODO add your handling code here:
        searchTextField.setText("");
        meaningTextPane.setText("");
        state = VE;
        stateMenu.setText("Trạng thái: Tiếng Việt - Tiếng Anh");
        initDictList();
    }//GEN-LAST:event_veButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn lưu lại những thay đổi không?", "Thông báo", JOptionPane.YES_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            try {
                dictEV.updateFile();
                dictVE.updateFile();
            } catch (IOException ex) {
                Logger.getLogger(DictApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String word = dictList.getSelectedValue();
        if (word == null) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn từ để xoá!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int answer = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xoá từ này khỏi từ điển không?", "Cảnh báo", JOptionPane.YES_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                switch (state) {
                    case EV:
                        dictEV.removeFromDict(word);
                        initDictList();
                        break;
                    case VE:
                        dictVE.removeFromDict(word);
                        initDictList();
                        break;
                    case RECENT:
                        da.removeFromList(da.recentWord, word);
                        initRecentWordList();
                        break;
                    case BOOKMARK:
                        da.removeFromList(da.markedWord, word);
                        initRecentWordList();
                        break;
                }
                JOptionPane.showMessageDialog(rootPane, "Đã xong!");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        String word = dictList.getSelectedValue();
        if (word == null) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn từ để sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            ef.setVisible(true);
            ef.wordTextField.setText(word);
            if (state == EV) {
                ef.meaningTextPane.setText(dictEV.getDictData().get(word));
            } else if (state == VE) {
                ef.meaningTextPane.setText(dictVE.getDictData().get(word));
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void searchTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextFieldMouseClicked
        // TODO add your handling code here:
        searchTextField.setText("");
        meaningTextPane.setText("");
        speakerButton.setVisible(false);
    }//GEN-LAST:event_searchTextFieldMouseClicked

    private void speakerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakerButtonActionPerformed
        // TODO add your handling code here:
        speaker.HandleVoice(word_select);
    }//GEN-LAST:event_speakerButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        try {
            // TODO add your handling code here:
            dictEV.updateFile();
            dictVE.updateFile();
        } catch (IOException ex) {
            Logger.getLogger(DictApp.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(rootPane, "Mọi thông tin đã được thay đổi!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_exportButtonActionPerformed

    private void apiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apiButtonActionPerformed
        // TODO add your handling code here:
        apiForm.setVisible(true);
    }//GEN-LAST:event_apiButtonActionPerformed

    private void addBmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBmButtonActionPerformed
        // TODO add your handling code here:
        String word = dictList.getSelectedValue();
        da.saveToBookmark(word);
        if (word == null) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn từ để lưu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                da.readToFile(da.markedWord, "data\\BookmarkList.txt");
            } catch (IOException ex) {
                Logger.getLogger(DictApp.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane, "Bạn đã thêm vào Bookmark", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addBmButtonActionPerformed

    private void recentWordMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recentWordMenuItemActionPerformed
        // TODO add your handling code here:
        state = RECENT;
        searchTextField.setText("");
        meaningTextPane.setText("");
        initRecentWordList();
    }//GEN-LAST:event_recentWordMenuItemActionPerformed

    private void bookmarkMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookmarkMenuItemActionPerformed
        // TODO add your handling code here:
        state = BOOKMARK;
        searchTextField.setText("");
        meaningTextPane.setText("");
        initBookmarkWordList();
    }//GEN-LAST:event_bookmarkMenuItemActionPerformed

    private void practiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practiceButtonActionPerformed
        // TODO add your handling code here:
        pf.setVisible(true);
    }//GEN-LAST:event_practiceButtonActionPerformed

    private void guideMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guideMenuMouseClicked
        // TODO add your handling code here:
        String guide = "Use mouse and press ENTER to look up new word\n" 
                + "Use keyboard to type your word you need to look up new word\n"
                + "Thank you!";
        JOptionPane.showMessageDialog(rootPane, guide, "Guide", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_guideMenuMouseClicked

    private void aboutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuMouseClicked
        // TODO add your handling code here:
        String about = "My Team : Phạm Văn Vũ - Đào Xuân Tùng - Kiều Văn Tuyên\n" 
                + "Class: 2021I_INT2204_24\n" + "Library: Java Swing, Freetts, Synthetica\n"
                + "Use: Google API source code from Internet\n"
                + "We look forward to hearing from everyone. Thank you!";
        JOptionPane.showMessageDialog(rootPane, about, "About us", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutMenuMouseClicked

    public static DictApp dictApp;

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
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JButton addBmButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton apiButton;
    private javax.swing.JMenuItem bookmarkMenuItem;
    private javax.swing.JButton deleteButton;
    public javax.swing.JList<String> dictList;
    private javax.swing.JButton editButton;
    private javax.swing.JButton evButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JMenu guideMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JTextPane meaningTextPane;
    private javax.swing.JButton practiceButton;
    private javax.swing.JMenuItem recentWordMenuItem;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JMenu selectMenu1;
    private javax.swing.JButton speakerButton;
    private javax.swing.JMenu stateMenu;
    private javax.swing.JButton veButton;
    // End of variables declaration//GEN-END:variables
}
