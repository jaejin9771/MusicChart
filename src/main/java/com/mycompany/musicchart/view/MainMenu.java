package com.mycompany.musicchart.view;

import static com.mycompany.musicchart.controller.Search.MusicSearch;
import com.mycompany.musicchart.model.Chart;
import javax.swing.JTable;
import javax.swing.table.*;

public class MainMenu extends javax.swing.JFrame {
    Chart rg = new Chart("https://www.genie.co.kr/chart/top200", "td.info a.title.ellipsis", "td.info a.artist.ellipsis"); // 크롤링을 한번 요청하고 객체에 저장해 계속 정보를 씀
    Chart rm = new Chart("https://www.melon.com/chart/index.htm", "div.wrap_song_info div.ellipsis.rank01 span a", "div.wrap_song_info div.ellipsis.rank02 span a");
    DefaultTableModel dtm; 
    JTable table;
    Object[][] rowData = new Object[50][3];
    String[] columTitle = {"순위","제목","가수"};
    int ROW = 50;
    int COL = 3;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TextSong = new javax.swing.JTextField();
        MelonChart = new javax.swing.JButton();
        GenieChart = new javax.swing.JButton();
        SearchMelon = new javax.swing.JButton();
        SearchGenie = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TextSinger = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "순위", "제목", "가수"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jLabel2.setText("제목");

        TextSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSongActionPerformed(evt);
            }
        });

        MelonChart.setText("Melon");
        MelonChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MelonChartActionPerformed(evt);
            }
        });

        GenieChart.setText("Genie");
        GenieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenieChartActionPerformed(evt);
            }
        });

        SearchMelon.setText("Search Melon");
        SearchMelon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMelonActionPerformed(evt);
            }
        });

        SearchGenie.setText("Search Genie");
        SearchGenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchGenieActionPerformed(evt);
            }
        });

        jLabel1.setText("가수");

        TextSinger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSingerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextSong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(TextSinger, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MelonChart))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(GenieChart)))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchMelon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchGenie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(SearchMelon))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MelonChart)
                                .addComponent(TextSinger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchGenie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenieChart))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>                        

    private void MelonChartActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //멜론차트 1~50 표시
        //1~50위 표시하는 함수 만들기
        
        for(int i = 0; i < rowData.length; i++) {
            int colnum = 0;
            rowData[i][colnum] = i + 1;
            rowData[i][++colnum] = rm.getListTitle().get(i);
            rowData[i][++colnum] = rm.getListName().get(i);
        }
        dtm = new DefaultTableModel(rowData, columTitle);
         
        table = new JTable(dtm);
        
        jTable1.setModel(dtm);
    }                                          

    private void GenieChartActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // 지니뮤직 차트 1~50등 표시
        //1~50위 표시하는 함수 만들기
        
        for(int i = 0; i < rowData.length; i++) {             
            int colnum = 0;
            rowData[i][colnum] = i + 1;
            rowData[i][++colnum] = rg.getListTitle().get(i);
            rowData[i][++colnum] = rg.getListName().get(i);
        }
        
        dtm = new DefaultTableModel(rowData, columTitle);
        
        table = new JTable(dtm);
        
        jTable1.setModel(dtm);
    }                                          

    private void TextSongActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void SearchMelonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //멜론차트에서 검색하기
        rowData = new Object[ROW][COL];
        String str1 = TextSong.getText();
        String str2 = TextSinger.getText();

        int j = 0;
        
        rowData = MusicSearch(rowData,str1,str2,rm);
        
        dtm = new DefaultTableModel(rowData,columTitle);
        
        table = new JTable(dtm);
        
        jTable1.setModel(dtm);
    }                                           

    private void SearchGenieActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //지니뮤직에서 검색하기
        rowData = new Object[ROW][COL];
        String str1 = TextSong.getText();
        String str2 = TextSinger.getText();
         //상수 부분을 변수로 교체해주기, 코드 보수 편리함
        int j = 0;
        
        // 이 부분 바꾸기
        System.out.println("str1  =  " + str1.isEmpty());
        
        rowData = MusicSearch(rowData,str1,str2,rg);
        dtm = new DefaultTableModel(rowData,columTitle);
        
        table = new JTable(dtm);
        
        jTable1.setModel(dtm);
    }                                           

    private void TextSingerActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    /**
     * @param args the command line arguments
     */
    
    public void runMusicChart() {
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton GenieChart;
    private javax.swing.JButton MelonChart;
    private javax.swing.JButton SearchGenie;
    private javax.swing.JButton SearchMelon;
    private javax.swing.JTextField TextSinger;
    private javax.swing.JTextField TextSong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}
