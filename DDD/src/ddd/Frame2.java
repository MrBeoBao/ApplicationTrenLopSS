
package ddd;

public class Frame2 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Frame2.class.getName());
    private Player player;
    private Enemy enemy;
    public Frame2(Player player) {
        initComponents();
        this.player = player;
        Enemy enemy = new Enemy(player.getLevel());
        this.enemy = enemy;
        player.equipArmorFromInventory();
        javax.swing.JOptionPane.showMessageDialog(this, "Auto equip armor " + player.getDef());
        updateLabels();
    }
    private void updateLabels() {
        jLabel1.setText("HP: " + player.getHP() + "/" + player.getMaxHP());
        jLabel3.setText("MP: " + player.getMP() + "/" + player.getMaxMP());
        jLabel4.setText("Rage: " + player.getRagePoint() + "/" + player.getMaxRagePoint());
        jLabel5.setText("Level: " + player.getLevel());
        jLabel6.setText("Weapon: " + player.getWeapon().getName());
        
        jLabel7.setText("HP: " + enemy.getHP() + "/" + enemy.getMaxHP());
        jLabel8.setText("Level: " + enemy.getLevel());
        jLabel9.setText("Attack: " + enemy.getAttack());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(44, 44, 44));
        jButton1.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(241, 196, 15));
        jButton1.setText("Run");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 156, 18), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 140, 50));

        jLabel1.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HP:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 30));

        jLabel3.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mp:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 150, 30));

        jLabel4.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rage:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 30));

        jLabel5.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Level:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, 30));

        jLabel6.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Weapon:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 330, 30));

        jLabel7.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HP:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 150, 30));

        jLabel8.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Level");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 60, 150, 30));

        jLabel9.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Attack");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 150, 30));

        jButton2.setBackground(new java.awt.Color(44, 44, 44));
        jButton2.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(241, 196, 15));
        jButton2.setText("Attack");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 156, 18), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 600, 20));

        jButton3.setBackground(new java.awt.Color(44, 44, 44));
        jButton3.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(241, 196, 15));
        jButton3.setText("Blade of Fury");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 156, 18), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 460, 140));

        jButton4.setBackground(new java.awt.Color(44, 44, 44));
        jButton4.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(241, 196, 15));
        jButton4.setText("Cast Heal");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 156, 18), 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 460, 190));

        jButton5.setBackground(new java.awt.Color(44, 44, 44));
        jButton5.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(241, 196, 15));
        jButton5.setText("Cast Empower");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 156, 18), 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 50));

        jButton6.setBackground(new java.awt.Color(44, 44, 44));
        jButton6.setFont(new java.awt.Font("DFVN Obelix Pro", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(241, 196, 15));
        jButton6.setText("Cast fire ball");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 156, 18), 2));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 60, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/CombatScreen.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 702));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Frame f = new Frame(player);
        f.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        enemy.takeDamage(player.getWeapon().getStat() + player.getAttack());
        if (player.isEmpowered()) {
        player.resetEmpower();
        }
        
        if (enemy.getHP() <= 0) {
            int reward = enemy.getLevel() * 15;
            player.setMoney(player.getMoney() + reward);
            javax.swing.JOptionPane.showMessageDialog(this, "YOU WIN " + reward + " money");
            player.setLevel(player.getLevel() + 1);
            player.setStatsPoint(player.getStatsPoint() + 3);
            Frame f = new Frame(player);
            f.setVisible(true);
            setVisible(false);
            return;
            
        } else {
            
            player.takeDamage(enemy.getAttack() - player.getDef());

            
            if (player.getHP() <= 0) {
                player.setMoney(0);
                javax.swing.JOptionPane.showMessageDialog(this, "You are lost all of your money");
                player.setHP(player.getMaxHP());
                
                
                Frame f = new Frame(player);
                f.setVisible(true);
                setVisible(false);
                return;
            }
        }

        player.setRagePoint(player.getRagePoint() + 20);
        updateLabels();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (player.getRagePoint() >= player.getMaxRagePoint()) {
        
        int damage = (player.getWeapon().getStat() + player.getAttack()) * 2;
        enemy.takeDamage(damage);

        
        if (player.isEmpowered()) {
            player.resetEmpower();
        }

        player.setRagePoint(0); 

        if (enemy.getHP() <= 0) {
            int reward = enemy.getLevel() * 15;
            player.setMoney(player.getMoney() + reward);
            javax.swing.JOptionPane.showMessageDialog(this, "YOU WIN " + reward + " money");
            player.setLevel(player.getLevel() + 1);
            player.setStatsPoint(player.getStatsPoint() + 1000);
            

            Frame f = new Frame(player);
            f.setVisible(true);
            setVisible(false);
            return;
        }

        
        player.takeDamage(enemy.getAttack() - player.getDef());
        if (player.getHP() <= 0) {
            player.setMoney(0);
            javax.swing.JOptionPane.showMessageDialog(this, "You lost all of your money");
            player.setHP(player.getMaxHP());
            Frame f = new Frame(player);
            f.setVisible(true);
            setVisible(false);
            return;
        }

    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Not enough Rage Point!");
    }

    updateLabels();
        
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(player.getMP() >= 15){
            player.setHP(player.getHP() + 20);
            player.setMP(player.getMP() - 15);
            updateLabels();
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Not enough MP!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (player.getMP() >= 20) {
        player.setMP(player.getMP() - 20);
        player.empower();
        javax.swing.JOptionPane.showMessageDialog(this, "Attack increased by 20 for the next turn!");
        updateLabels();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Not enough MP!");
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(player.getMP() >= 20){
        enemy.takeDamage(20);
        player.setMP(player.getMP() - 20);
        updateLabels();
        
        if (enemy.getHP() <= 0) {
            int reward = enemy.getLevel() * 15;
            player.setMoney(player.getMoney() + reward);
            javax.swing.JOptionPane.showMessageDialog(this, "YOU WIN " + reward + " money");
            player.setLevel(player.getLevel() + 1);
            player.setStatsPoint(player.getStatsPoint() + 3);
            
            Frame f = new Frame(player);
            f.setVisible(true);
            setVisible(false);
            return;
            } 
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Not enough MP!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variable
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
