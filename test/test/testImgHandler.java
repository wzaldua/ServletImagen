/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

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
        Assert.assertEquals(imghan.existeImagen(), true );  
    }
    
}
