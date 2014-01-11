/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmerko.gui.administrator;

import com.farmerko.logic.db.MySqlConnection;
import com.farmerko.logic.db.tablemodel.InerModulData;
import com.farmerko.logic.db.tablemodel.MyComboBoxModul;
import com.farmerko.logic.db.tablemodel.MyTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class AdminStart extends javax.swing.JPanel
{
    private final MySqlConnection db_connection;

    /**
     * Creates new form AdminStart
     */
    public AdminStart()
    {
        this.db_connection=null;
        initComponents();
        initDDi();
        initTableSelectio();
    }

    public AdminStart(MySqlConnection db_connection)
    {
        this.db_connection=db_connection;
        initComponents();
        initDDi();
        initTableSelectio();
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

        jPanel1 = new javax.swing.JPanel();
        jtf_korisnicko_ime = new javax.swing.JTextField();
        jl_korisnicko_ime = new javax.swing.JLabel();
        jb_pretrazi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_result = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_ime = new javax.swing.JTextField();
        jtf_prezime = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jtf_korisnicko_ime_edit = new javax.swing.JTextField();
        jtf_sifra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcb_status = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jcb_tip = new javax.swing.JComboBox();
        jb_snimi = new javax.swing.JButton();
        jb_odustani = new javax.swing.JButton();
        jb_nov = new javax.swing.JButton();

        jl_korisnicko_ime.setText("Korisničko ime:");

        jb_pretrazi.setText("Pretrazi");
        jb_pretrazi.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jb_pretraziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_korisnicko_ime)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_korisnicko_ime)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_pretrazi)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_korisnicko_ime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_korisnicko_ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_pretrazi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jt_result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {},
                {},
                {},
                {}
            },
            new String []
            {

            }
        ));
        jScrollPane1.setViewportView(jt_result);

        jLabel1.setText("Ime:");

        jLabel2.setText("Prezime:");

        jLabel3.setText("e-mail:");

        jLabel4.setText("Korisničko ime:");

        jLabel5.setText("Lozinka:");

        jLabel6.setText("Status:");

        jLabel7.setText("Tip:");

        jb_snimi.setText("Snimi");

        jb_odustani.setText("Odustani");

        jb_nov.setText("Nov");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_ime)
                            .addComponent(jtf_prezime)
                            .addComponent(jtf_email)
                            .addComponent(jtf_korisnicko_ime_edit)
                            .addComponent(jtf_sifra)
                            .addComponent(jcb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcb_tip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_nov)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_odustani)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_snimi)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_prezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_korisnicko_ime_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_sifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcb_tip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_snimi)
                    .addComponent(jb_odustani)
                    .addComponent(jb_nov))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_pretraziActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jb_pretraziActionPerformed
    {//GEN-HEADEREND:event_jb_pretraziActionPerformed
        search();
    }//GEN-LAST:event_jb_pretraziActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_nov;
    private javax.swing.JButton jb_odustani;
    private javax.swing.JButton jb_pretrazi;
    private javax.swing.JButton jb_snimi;
    private javax.swing.JComboBox jcb_status;
    private javax.swing.JComboBox jcb_tip;
    private javax.swing.JLabel jl_korisnicko_ime;
    private javax.swing.JTable jt_result;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_ime;
    private javax.swing.JTextField jtf_korisnicko_ime;
    private javax.swing.JTextField jtf_korisnicko_ime_edit;
    private javax.swing.JTextField jtf_prezime;
    private javax.swing.JTextField jtf_sifra;
    // End of variables declaration//GEN-END:variables

    private void search()
    {
        //todo: start progress bar
        String upit = "select * from korisnik where username like '%"+jtf_korisnicko_ime.getText()+"%';";
        ResultSet resultset = db_connection.executeQuery(upit);
        try
        {
            //populate model
            jt_result.clearSelection();
            ResultSetMetaData meta = resultset.getMetaData();
            int numberOfColumns = meta.getColumnCount();
            MyTableModel mtm= new MyTableModel(numberOfColumns);
            
            for (int i=0;i<numberOfColumns;i++)
            {
                mtm.setColumnName(i,meta.getColumnName(i+1));
            }
            
            while (resultset.next())
            {
                Object [] rowData = new Object[numberOfColumns];
                for (int i = 0; i < rowData.length; ++i)
                {
                    rowData[i] = resultset.getObject(i+1);
                }
                mtm.addRow(rowData);
            }
            jt_result.setModel(mtm);
            mtm.fireTableDataChanged();
            
            //TODO end progrss bar
        } catch (SQLException ex)
        {
            Logger.getLogger(AdminStart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initDDi()
    {
        DefaultComboBoxModel cb_status_modul = new DefaultComboBoxModel();
        DefaultComboBoxModel cb_tip_modul = new DefaultComboBoxModel();
        InerModulData item;
        String upit;
        ResultSet resultset;
        //Status
        upit = "select * from korisnikstatus;";
        resultset = db_connection.executeQuery(upit);
        try
        {
            item = new InerModulData(0,"","");
            cb_status_modul.addElement(item);
            while (resultset.next())            
            {
                item = new InerModulData(resultset.getInt("id_korisnik_status"),"",resultset.getString("naziv"));
                cb_status_modul.addElement(item);
            }
      
            jcb_status.setModel(cb_status_modul);
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        //Tip
        upit = "select * from korisniktip;";
        resultset = db_connection.executeQuery(upit);
        try
        {
            item = new InerModulData(0,"","");
            cb_tip_modul.addElement(item);
            while (resultset.next())            
            {
                item = new InerModulData(resultset.getInt("id_korisnik_tip"),"",resultset.getString("naziv"));
                cb_tip_modul.addElement(item);
            }
            jcb_tip.setModel(cb_tip_modul);
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
    }

    private void initTableSelectio()
    {
        jt_result.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                if(!e.getValueIsAdjusting())
                {
                    int row = jt_result.getSelectedRow();
                    System.out.println("--"+row+"---"+e.getValueIsAdjusting());
                }
                
            }
    });
    }
}