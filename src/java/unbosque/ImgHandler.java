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
    
    static ArrayList<Byte> arrayimagen;
    static byte[] resultado;
    static File f;
    
    public ImgHandler(){
        
    }
    
    public File existeImagen(){
         f=new File("//Users/wilvergzalduae/Downloads/BigImageMix.png");
         return f;
    }
    
    public ArrayList<Byte> llenarArrayImagen() throws FileNotFoundException, IOException{
        resultado = new byte[4096];
        FileInputStream fileInStre = new FileInputStream(f);
        int count = 0;
            while ((count = fileInStre.read(resultado)) >= 0) {
                arrayimagen.add((byte)count);
            }
        return arrayimagen;   
    }
    
}
