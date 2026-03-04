package ddd;

public class Frame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Frame.class.getName());

    private Player player;
    public Frame(Player player) {
        initComponents();
        this.player = player;
        
    }
    public Player getPlayer() {
        return player;
    }
    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        Player player = new Player(50, 50, 0, 50, 100, 100, 0 , 1);
        new Frame(player).setVisible(true);
    });
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 215, 0));
        jLabel1.setText("MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 170, 100));

        jButton1.setBackground(new java.awt.Color(25, 25, 112));
        jButton1.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("TIME TO HUNT");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 120, 50));

        jButton2.setBackground(new java.awt.Color(25, 25, 112));
        jButton2.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.setText("Shop");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230), 2));
        jButton2.setPreferredSize(new java.awt.Dimension(112, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 120, 50));

        jButton3.setBackground(new java.awt.Color(25, 25, 112));
        jButton3.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 255));
        jButton3.setText("restore(50)");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 50));

        jButton4.setBackground(new java.awt.Color(25, 25, 112));
        jButton4.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 255, 255));
        jButton4.setText("Stats");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230), 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 120, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/Menu.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1280, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.player.equipStrongestWeapon();
        Frame2 frame2 = new Frame2(player);
        frame2.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        java.awt.EventQueue.invokeLater(() -> new Frame3(player).setVisible(true));
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(player.getMoney() >= 50){
            player.setHP(player.getMaxHP());
            player.setMP(player.getMaxMP());
            player.setMoney(player.getMoney() - 50);
            javax.swing.JOptionPane.showMessageDialog(this, "All stat has restored");
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Don't have enough money");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Frame4 f = new Frame4(player);
        
        f.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    

    
}
