/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmerko.logic.db.tablemodel;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class InerModulData
{
     public int intVal;
        public String stringVal;
        public String name;

        public InerModulData(int intVal, String stringVal, String name)
        {
            this.intVal = intVal;
            this.stringVal = stringVal;
            this.name = name;
        }

    public InerModulData()
    {
        
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}
