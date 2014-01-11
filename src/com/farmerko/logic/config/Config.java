/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmerko.logic.config;

import com.farmerko.logic.fileaccess.FileAccess;
import java.util.StringTokenizer;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class Config
{
    //constats
    private static final String FILE_CONFIG = "farmerko.config";
    //-TAG
    private static final String TAG_USERNAME="username";
    private static final String TAG_PASSWORD="password";
    private static final String TAG_DB_URL="db_url";
    private static final String TAG_DB_USERNAME="db_username";
    private static final String TAG_DB_PASSWORD="db_password";
    
    //DB connection config
    public static String DB_URL="";
    public static String DB_USERNAME="";
    public static String DB_PASSWORD="";
    
    
    public static String USERNAME="";
    public static String PASSWORD="";
    
    public static void parseConfig()
    {
        String data = FileAccess.readTextFile(FILE_CONFIG);
        StringTokenizer st = new StringTokenizer(data, "\n");
        String token = st.nextToken();
        do
        {

            String tag = token.split("=")[0];
            String val = token.split("=")[1];
            
            if(tag == null || val == null)
                continue;
            if (tag.equals(TAG_USERNAME))
            {
                Config.USERNAME = val;
            } else if (tag.equals(TAG_PASSWORD))
            {
                Config.PASSWORD = val;
            } else if (tag.equals(TAG_DB_URL))
            {
                Config.DB_URL = val;
            } else if (tag.equals(TAG_DB_USERNAME))
            {
                Config.DB_USERNAME = val;
            } else if (tag.equals(TAG_DB_PASSWORD))
            {
                Config.DB_PASSWORD = val;
            }

            try
            {
                token = st.nextToken();
            } catch (Exception e)
            {
                token = null;
            }
        } while (token != null);
    }

    public static void saveConfig()
    {
        String config_val="";
        config_val+=TAG_DB_URL+"="+DB_URL+"\n"+
                    TAG_DB_USERNAME+"="+DB_USERNAME+"\n"+
                    TAG_DB_PASSWORD+"="+DB_PASSWORD+"\n"+
                    TAG_USERNAME+"="+USERNAME+"\n"+
                    TAG_PASSWORD+"="+PASSWORD+"\n";
        FileAccess.writeTextFile(FILE_CONFIG, config_val);
        
    }
    
}
