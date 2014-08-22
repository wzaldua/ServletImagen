/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.io.File;
import org.testng.annotations.Test;
import org.testng.Assert;
import unbosque.ImgHandler;

/**
 *
 * @author wilvergzalduae
 */
public class testImgHandler {
    
    @Test
    public void archivoExiste(){
        ImgHandler imghan = new ImgHandler(); 
        File f = imghan.existeImagen();
        Assert.assertEquals(f.exists(), true );  
    }
    
}
