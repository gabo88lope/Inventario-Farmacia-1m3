/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmacia.Metodos;

import farmacia.Usuario;
import java.util.List;

/**
 *
 * @author montano
 */
public class Listar {
    
    public static void RecorrerListas(List<String>art,List<Integer>cnt,Usuario e,List<String> fecha)
    {
        System.out.println("");
        System.out.println("Usuario: "+e.getNombre());
        System.out.println("");
        System.out.println("=======================================================================================");
        System.out.println("Nombre\t\t    Cantidad\t\tFecha de Vencimiento\t\tPrecio Unitario");
        System.out.println("=======================================================================================");
        for(int i=0;i<10;i++)
        {
            System.out.println(art.get(i)+"\t\t"+cnt.get(i)+"\t\t"+fecha.get(i));
        }
    }
    
}
