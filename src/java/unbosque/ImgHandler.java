/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unbosque;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author wilvergzalduae
 */
public class ImgHandler {
    
    ArrayList<Byte> arrayimagen;
    static byte[] resultado;
    static File f;
    public static ImgHandler instance;
    
    ///constructor
    private ImgHandler(){
        f=new File("D:\\casa.jpg");
    }
    
    //clase que devuelve la instancia
    public static ImgHandler getInstance(){
        if(instance == null){
            instance = new ImgHandler();
        }
        return instance;
    }
   
    
    public File existeImagen(){
        // f=new File("D:\\casa.jpg");
         return f;
    }
    
    public ArrayList<Byte> llenarArrayImagen() throws FileNotFoundException, IOException{
        resultado = new byte[1024];
        FileInputStream fileInStre = new FileInputStream(f);
        while ((fileInStre.read(resultado)) >= 0) {
            fileInStre.read(resultado);
        }   
        return arrayimagen;   
    }
    
}
