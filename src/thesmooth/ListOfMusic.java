/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesmooth;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author C_aar
 */
public class ListOfMusic {
    String path;
    ArrayList<String> listMp3;
      
    
    public ListOfMusic()
    {
    }
    public ListOfMusic(String path)
    {
        this.path = path;
        System.out.println("Ceate list of music already." +"---->"+this.path);
    }
    
    
    
    
    public void setPath(String path)
    {
        this.path = path;
    }
    public String getPath()
    {
        return path;
    }
    
    
    public void ceateListOfMusic()
    {
        System.out.println("Get list of music.");
        File file = new File(path);
        File[] listOfFiles = file.listFiles();
        listMp3 = new ArrayList<>();

        for (int i = 0; i < listOfFiles.length; i++)
        {
            if (listOfFiles[i].isFile() && (listOfFiles[i].getName().endsWith(".mp3") || listOfFiles[i].getName().endsWith(".flac")))
            {
//                System.out.println("File " + listOfFiles[i].getName());
                listMp3.add(listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory())
            {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
   
    
    }
    
    public ArrayList<String> getListOfMusic()
    {
        return listMp3;
    }
}

