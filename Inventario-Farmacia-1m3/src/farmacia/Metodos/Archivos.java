/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.Metodos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Cristhian
 */
public class Archivos {
    
    FileInputStream fis;
    FileOutputStream fos;
    File f;
    static String path="File";

    public Archivos(String nombre)throws IOException
    {
        f=new File("C:\\Users\\Cristhian\\Documents\\Archivo",nombre+".txt");

        if(!f.exists())
        {
            f.createNewFile();
        }
    }

    public void crear(String texto)throws FileNotFoundException, IOException
    {
        fos=new FileOutputStream(f,true);

        if(texto==null || texto.length()==0)
        {
           return;
        }

        fos.write(texto.getBytes());
    }

    public String leer() throws FileNotFoundException, IOException
    {
        byte[] a=new byte[(int)f.length()];
        fis=new FileInputStream(f);
      if(f.length()==0){
          System.out.println("No exite archivo");
          return "";
      }

        if(fis!=null)
        {
           fis.read(a);
        }

        return new String(a);
    }

    public void cerrar() throws IOException{
        if(fis==null && fos==null)
        {
            fis.close();
            fos.close();
        }
    }    
}
