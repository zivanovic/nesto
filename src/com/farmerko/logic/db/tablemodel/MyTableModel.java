/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmerko.logic.db.tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class MyTableModel extends AbstractTableModel
{
    private String[] columnNames;
    private ArrayList<Object[]>data ;
    
    public MyTableModel(int column)
    {
        columnNames = new String[column];
        data=new ArrayList<>();
        
    }
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }
    public void setColumnName(int col,String name) {
        columnNames[col] = name;
    }
    
    public void addRow(Object[] row)
    {
        data.add(row);
    }

    public Object getValueAt(int row, int col) {
        return data.get(row)[col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    public boolean isCellEditable(int row, int col) {        
        return false;        
    }
}
