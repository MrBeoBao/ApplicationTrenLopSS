/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ddd;

/**
 *
 * @author kinna
 */
public class Frame4 extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Frame4.class.getName());
    private Player player;

    /**
     * Creates new form Frame4
     */
    public Frame4(Player player) {
        initComponents();
        this.player = player;
        jLabel2.setText("Stats point: " + player.getStatsPoint());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(30, 30, 30));
        jButton1.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 215, 0));
        jButton1.setText("+1 Attack");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 120, 40));

        jButton2.setBackground(new java.awt.Color(30, 30, 30));
        jButton2.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 215, 0));
        jButton2.setText("+1 Defend");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 120, 40));

        jButton3.setBackground(new java.awt.Color(30, 30, 30));
        jButton3.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 215, 0));
        jButton3.setText("+3 MP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 110, 40));

        jButton4.setBackground(new java.awt.Color(30, 30, 30));
        jButton4.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 215, 0));
        jButton4.setText("+5 HP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 110, 40));

        jButton5.setBackground(new java.awt.Color(30, 30, 30));
        jButton5.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 215, 0));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 520, 110, 40));

        jLabel2.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 18)); // NOI18N
        jLabel2.setText("Stats point");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, 330, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/statScreen_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (player.getStatsPoint() > 0) {
            player.setAttack(player.getAttack() + 1);
            player.setStatsPoint(player.getStatsPoint() - 1);
            jLabel2.setText("Stats point: " + player.getStatsPoint());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Not enough stat points!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (player.getStatsPoint() > 0) {
            player.setDef(player.getDef() + 1);
            player.setStatsPoint(player.getStatsPoint() - 1);
            jLabel2.setText("Stats point: " + player.getStatsPoint());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Not enough stat points!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (player.getStatsPoint() > 0) {
            player.setMaxMP(player.getMaxMP() + 3);
            
            player.setStatsPoint(player.getStatsPoint() - 1);
            jLabel2.setText("Stats point: " + player.getStatsPoint());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Not enough stat points!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (player.getStatsPoint() > 0) {
            player.setMaxHP(player.getMaxHP() + 5);
            
            player.setStatsPoint(player.getStatsPoint() - 1);
            jLabel2.setText("Stats point: " + player.getStatsPoint());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Not enough stat points!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Frame f = new Frame(player);
        f.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
