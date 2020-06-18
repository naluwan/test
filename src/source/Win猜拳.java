package source;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.parser.TokenType;

public class Win猜拳 extends javax.swing.JFrame {

    String[] colnum = {"電腦", "玩家", "結果"};

    Object[][] data = {};

    String[] column2 = {"總局數", "電腦共贏", "玩家共贏", "平手"};

    public DefaultTableModel myModel = null;
    public DefaultTableModel myModel2 = null;

    public ImageIcon[] ic = new ImageIcon[3];
    public JButton[] btn = new JButton[3];
    public int op, times = 1, comwin = 0, playerwin = 0, nowin = 0;

    ;

    public Win猜拳() {
        initComponents();
        myModel = (DefaultTableModel) jTable1.getModel();
        myModel2 = (DefaultTableModel) jTable2.getModel();
        ic[0] = new ImageIcon(getClass().getResource("/pic/1.jpg"));
        ic[1] = new ImageIcon(getClass().getResource("/pic/0.jpg"));
        ic[2] = new ImageIcon(getClass().getResource("/pic/2.jpg"));

        btn = new JButton[]{btnscissors, btnrock, btnpapper};

        for (int i = 0; i < btn.length; i++) {
            btn[i].setIcon(ic[i]);
        }
        lblplayernum.setVisible(false);
        lblcomnum.setVisible(false);
        lblplayernum2.setVisible(false);
        jTable1.setRowHeight(25);
        jTable2.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblcom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblplayer = new javax.swing.JLabel();
        lblscissors = new javax.swing.JPanel();
        btnscissors = new javax.swing.JButton();
        btnrock = new javax.swing.JButton();
        btnpapper = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblplayernum = new javax.swing.JLabel();
        lblcomnum = new javax.swing.JLabel();
        lblplayernum2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnclean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("猜拳");

        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 3, 3));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("電腦：");
        jPanel1.add(jLabel1);

        lblcom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblcom);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("玩家：");
        jPanel1.add(jLabel3);

        lblplayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblplayer);

        lblscissors.setLayout(new java.awt.GridLayout(3, 0, 0, 5));

        btnscissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addictolbl(evt);
            }
        });
        lblscissors.add(btnscissors);

        btnrock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addictolbl(evt);
            }
        });
        lblscissors.add(btnrock);

        btnpapper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addictolbl(evt);
            }
        });
        lblscissors.add(btnpapper);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,
            colnum
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            data,
            column2
        ));
        jScrollPane2.setViewportView(jTable2);

        btnclean.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnclean.setText("清除");
        btnclean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclean, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblplayernum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcomnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblscissors, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblplayernum, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblscissors, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblplayernum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblcomnum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(lblplayernum2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnclean, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addictolbl(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addictolbl
        JButton btncontrol = (JButton) evt.getSource();

        String[] num = {"剪刀", "石頭", "布"};
        int[] num2 = {1, 2, 3};
        int playernum = 0;
        Object[] row = {};

        for (int i = 0; i < btn.length; i++) {
            op = (int) (Math.random() * 3) + 1;
            if (btncontrol == btn[i]) {
                lblplayer.setIcon(ic[i]);
                lblplayernum.setText(num[i]);
                lblplayernum2.setText(String.valueOf(num2[i]));
                playernum = Integer.parseInt(lblplayernum2.getText());
            }

        }

        switch (op) {
            case 1:
                lblcom.setIcon(ic[0]);
                lblcomnum.setText("剪刀");
                break;
            case 2:
                lblcom.setIcon(ic[1]);
                lblcomnum.setText("石頭");
                break;
            case 3:
                lblcom.setIcon(ic[2]);
                lblcomnum.setText("布");
                break;
        }

        if (op == playernum) {
            row = new Object[]{lblcomnum.getText(), lblplayernum.getText(), "平手"};
            myModel.addRow(row);
        } else if (op > playernum) {
            if (op == 2 && playernum == 1) {
                row = new Object[]{lblcomnum.getText(), lblplayernum.getText(), "電腦贏"};
                myModel.addRow(row);
            } else if (op == 3 && playernum == 2) {
                row = new Object[]{lblcomnum.getText(), lblplayernum.getText(), "電腦贏"};
                myModel.addRow(row);
            } else if (op == 3 && playernum == 1) {
                row = new Object[]{lblcomnum.getText(), lblplayernum.getText(), "玩家贏"};
                myModel.addRow(row);
            }

        } else {
            if (playernum == 2 && op == 1) {
                row = new Object[]{lblcomnum.getText(), lblplayernum.getText(), "玩家贏"};
                myModel.addRow(row);
            } else if (playernum == 3 && op == 2) {
                row = new Object[]{lblcomnum.getText(), lblplayernum.getText(), "玩家贏"};
                myModel.addRow(row);
            } else if (playernum == 3 && op == 1) {
                row = new Object[]{lblcomnum.getText(), lblplayernum.getText(), "電腦贏"};
                 myModel.addRow(row);
            }
        }

        myModel2.setRowCount(0);
        if (row[2].equals("玩家贏")) {
//                Object[] row2 = {jTable1.getRowCount(), comwin, playerwin++,nowin};
//                myModel2.addRow(row2);
            playerwin++;

        } else if (row[2].equals("電腦贏")) {
//                Object[] row2 = {jTable1.getRowCount(), comwin++, playerwin,nowin};
//                myModel2.addRow(row2);
            comwin++;

        } else if (row[2].equals("平手")) {
//                Object[] row2 = {jTable1.getRowCount(), comwin, playerwin,nowin++};
//                myModel2.addRow(row2);
            nowin++;

        }
        Object[] row2 = {jTable1.getRowCount(), comwin, playerwin, nowin};
        myModel2.addRow(row2);


    }//GEN-LAST:event_addictolbl

    private void btncleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncleanActionPerformed
        myModel.setRowCount(0);
        myModel2.setRowCount(0);
        playerwin = 0;
        comwin = 0;
        nowin = 0;
    }//GEN-LAST:event_btncleanActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Win猜拳.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Win猜拳.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Win猜拳.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Win猜拳.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win猜拳().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclean;
    private javax.swing.JButton btnpapper;
    private javax.swing.JButton btnrock;
    private javax.swing.JButton btnscissors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblcom;
    private javax.swing.JLabel lblcomnum;
    private javax.swing.JLabel lblplayer;
    private javax.swing.JLabel lblplayernum;
    private javax.swing.JLabel lblplayernum2;
    private javax.swing.JPanel lblscissors;
    // End of variables declaration//GEN-END:variables

}
