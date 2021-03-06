/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmerko.gui;

import com.farmerko.gui.administrator.AdminStart;
import com.farmerko.logic.config.Config;
import com.farmerko.logic.db.MySqlConnection;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class Farmerko extends javax.swing.JFrame
{

    /**
     * Creates new form Farmerko
     */
    public Farmerko()
    {
        Config.parseConfig();
        
        if (init_db())
        {
            initComponents();
            initSize();
            auto_log_in();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        logInPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_username = new javax.swing.JTextField();
        jpf_password = new javax.swing.JPasswordField();
        jb_reset = new javax.swing.JButton();
        jb_prijavi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jmb_menu_bar = new javax.swing.JMenuBar();
        jm_fsrmerko = new javax.swing.JMenu();
        jmi_odjavi_se = new javax.swing.JMenuItem();
        jmi_exit = new javax.swing.JMenuItem();
        jm_farma = new javax.swing.JMenu();
        jm_zivotinje = new javax.swing.JMenu();
        jmi_krave = new javax.swing.JMenuItem();
        jmi_svinje = new javax.swing.JMenuItem();
        jm_ratarstvo = new javax.swing.JMenu();
        jmi_kukuruz = new javax.swing.JMenuItem();
        jmi_jecam = new javax.swing.JMenuItem();
        jm_voce = new javax.swing.JMenu();
        jm_pomoc = new javax.swing.JMenu();
        jmi_o_farmerku = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmerko");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        logInPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Korisničko ime:");

        jLabel2.setText("Šifra:");

        jpf_password.setToolTipText("");

        jb_reset.setText("Reset");
        jb_reset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jb_resetActionPerformed(evt);
            }
        });

        jb_prijavi.setText("Prijavi se");
        jb_prijavi.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jb_prijaviActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Prijavljivanje");

        javax.swing.GroupLayout logInPanelLayout = new javax.swing.GroupLayout(logInPanel);
        logInPanel.setLayout(logInPanelLayout);
        logInPanelLayout.setHorizontalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(logInPanelLayout.createSequentialGroup()
                        .addGap(0, 162, Short.MAX_VALUE)
                        .addComponent(jb_prijavi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_reset))
                    .addGroup(logInPanelLayout.createSequentialGroup()
                        .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpf_password)
                            .addComponent(jtf_username))))
                .addGap(14, 14, 14))
        );
        logInPanelLayout.setVerticalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_prijavi)
                    .addComponent(jb_reset))
                .addContainerGap())
        );

        jm_fsrmerko.setText("Farmerko");

        jmi_odjavi_se.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jmi_odjavi_se.setText("Odjavi se");
        jmi_odjavi_se.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmi_odjavi_seActionPerformed(evt);
            }
        });
        jm_fsrmerko.add(jmi_odjavi_se);

        jmi_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmi_exit.setText("Izadji");
        jmi_exit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmi_exitActionPerformed(evt);
            }
        });
        jm_fsrmerko.add(jmi_exit);

        jmb_menu_bar.add(jm_fsrmerko);

        jm_farma.setText("Farma");

        jm_zivotinje.setText("Životinje");

        jmi_krave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jmi_krave.setText("Krave");
        jm_zivotinje.add(jmi_krave);

        jmi_svinje.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmi_svinje.setText("Svinje");
        jm_zivotinje.add(jmi_svinje);

        jm_farma.add(jm_zivotinje);

        jm_ratarstvo.setText("Ratarsto");

        jmi_kukuruz.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jmi_kukuruz.setText("Kukuruz");
        jm_ratarstvo.add(jmi_kukuruz);

        jmi_jecam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jmi_jecam.setText("Ječam");
        jm_ratarstvo.add(jmi_jecam);

        jm_farma.add(jm_ratarstvo);

        jm_voce.setText("Voće");
        jm_farma.add(jm_voce);

        jmb_menu_bar.add(jm_farma);

        jm_pomoc.setText("Pomoć");

        jmi_o_farmerku.setText("O Farmerku");
        jm_pomoc.add(jmi_o_farmerku);

        jmb_menu_bar.add(jm_pomoc);

        setJMenuBar(jmb_menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(logInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(logInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_resetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jb_resetActionPerformed
    {//GEN-HEADEREND:event_jb_resetActionPerformed
        jtf_username.setText("");
        jpf_password.setText("");
    }//GEN-LAST:event_jb_resetActionPerformed

    private void jb_prijaviActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jb_prijaviActionPerformed
    {//GEN-HEADEREND:event_jb_prijaviActionPerformed
        String username = jtf_username.getText();
        String password = jpf_password.getText();
        //try 
        String upit = "select * from korisnik where username='" + username + "' AND password='" + password + "';";
        ResultSet rs = db_connection.executeQuery(upit);
        try
        {
            if (rs != null)
            {
                rs.last();
                if (rs.getRow() == 1)
                {
                    int status = rs.getInt("status");
                    if(status == 1)
                    {
                    this.remove(logInPanel);
                    init_menue();
                    addStartPanel(rs.getInt("tip"));
                    this.repaint();
                    }
                    
                } else
                {
                    jmb_menu_bar.setVisible(false);
                }
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(Farmerko.class.getName()).log(Level.SEVERE, null, ex);
        }
        jb_reset.doClick();
    }//GEN-LAST:event_jb_prijaviActionPerformed

    private void jmi_exitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmi_exitActionPerformed
    {//GEN-HEADEREND:event_jmi_exitActionPerformed
        db_connection.disconnect();
        Config.saveConfig();
        System.exit(0);
    }//GEN-LAST:event_jmi_exitActionPerformed

    private void jmi_odjavi_seActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmi_odjavi_seActionPerformed
    {//GEN-HEADEREND:event_jmi_odjavi_seActionPerformed
        //remuve all panels and 
        this.remove(current_pannel);

        jmb_menu_bar.setVisible(false);

        //add login panel
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(logInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(218, 218, 218)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(logInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE)));
        current_pannel = logInPanel;
        repaint();
    }//GEN-LAST:event_jmi_odjavi_seActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Farmerko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Farmerko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Farmerko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Farmerko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Farmerko().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb_prijavi;
    private javax.swing.JButton jb_reset;
    private javax.swing.JMenu jm_farma;
    private javax.swing.JMenu jm_fsrmerko;
    private javax.swing.JMenu jm_pomoc;
    private javax.swing.JMenu jm_ratarstvo;
    private javax.swing.JMenu jm_voce;
    private javax.swing.JMenu jm_zivotinje;
    private javax.swing.JMenuBar jmb_menu_bar;
    private javax.swing.JMenuItem jmi_exit;
    private javax.swing.JMenuItem jmi_jecam;
    private javax.swing.JMenuItem jmi_krave;
    private javax.swing.JMenuItem jmi_kukuruz;
    private javax.swing.JMenuItem jmi_o_farmerku;
    private javax.swing.JMenuItem jmi_odjavi_se;
    private javax.swing.JMenuItem jmi_svinje;
    private javax.swing.JPasswordField jpf_password;
    private javax.swing.JTextField jtf_username;
    private javax.swing.JPanel logInPanel;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel current_pannel;
    private MySqlConnection db_connection;

    private void auto_log_in()
    {
        //get username and password
        jtf_username.setText(Config.USERNAME);
        jpf_password.setText(Config.PASSWORD);
        jb_prijavi.doClick();

    }

    private boolean init_db()
    {
        db_connection = new MySqlConnection(Config.DB_USERNAME, Config.DB_PASSWORD, Config.DB_URL);
        return db_connection.connect();

    }

    private void init_menue()
    {
        jmb_menu_bar.setVisible(true);
    }

    private void addStartPanel(int tip)
    {
        JPanel tmp = null;
        if(tip==0)
        {
            tmp = new AdminStart(db_connection);
        } else if(tip==1)
        {
            tmp = new StartJPanel();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                ));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10,10,10)
                ));

        current_pannel = tmp;
        repaint();
    }

    private void initSize()
    {
        Toolkit tk = Toolkit.getDefaultToolkit();  
        int xSize = ((int) tk.getScreenSize().getWidth());  
        int ySize = ((int) tk.getScreenSize().getHeight());  
        this.setSize(xSize,ySize);
        this.setPreferredSize(new Dimension(xSize,ySize));
        
    }
}
