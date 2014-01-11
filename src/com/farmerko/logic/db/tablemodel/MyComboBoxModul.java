/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmerko.logic.db.tablemodel;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class MyComboBoxModul implements ComboBoxModel{
    
    private ArrayList <InerModulData> data;
    private InerModulData index;

    public MyComboBoxModul()
    {
        data = new ArrayList<>();
        index = null;
    }
    public void setItem(Object obj)
    {
        data.add((InerModulData)obj);
    }
    @Override
    public void setSelectedItem(Object anItem)
    {
        if(data.indexOf(anItem)!=-1)
        {
            index=(InerModulData) anItem;
        }
    }
    
    @Override
    public Object getSelectedItem()
    {
        return index;
    }

    @Override
    public int getSize()
    {
        return data.size();
    }

    @Override
    public Object getElementAt(int index)
    {
        return data.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l)
    {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeListDataListener(ListDataListener l)
    {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

 
    
}
