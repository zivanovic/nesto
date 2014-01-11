/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmerko.logic.fileaccess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class FileAccess
{

    public static String readTextFile(String fileName)
    {

        String returnValue = "";
        FileReader file = null;

        try
        {
            file = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(file);
            String line = "";
            while ((line = reader.readLine()) != null)
            {
                returnValue += line + "\n";
            }
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        } finally
        {
            if (file != null)
            {
                try
                {
                    file.close();
                } catch (IOException e)
                {
                    // Ignore issues during closing 
                }
            }
        }
        return returnValue;
    }

    public static void writeTextFile(String fileName, String s)
    {
        FileWriter output = null;
        try
        {
            File file = new File(fileName);
            if(!file.exists())
            {
                file.createNewFile();
            }
            output = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(output);
            writer.write(s);
            writer.flush();
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        } finally
        {
            if (output != null)
            {
                try
                {
                    output.close();
                } catch (IOException e)
                {
                    // Ignore issues during closing
                }
            }
        }
    }
}
