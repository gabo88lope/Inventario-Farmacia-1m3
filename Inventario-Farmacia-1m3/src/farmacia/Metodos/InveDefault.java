/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.Metodos;
import java.util.*;
import java.io.*;
/**
 *
 * @author Cristhian
 */
public class InveDefault {
    
    public static List<Integer> Cantidad(List<Integer> can)
    {
        Random s=new Random();
        for(int i=0;i<10;i++)
        {
           can.add(i,s.nextInt(i+15)+1);
        }
        return can;
    }
    
    public static List<String> Nombres(List<String> nom)
    {
       
        nom.add(0,"Clonazepam");
        nom.add(1,"Peptobismol");
        nom.add(2,"Atenolol");
        nom.add(3,"Normolip");
        nom.add(4,"Diazepam");
        nom.add(5,"Metropolol");
        nom.add(6,"Enzitrol");
        nom.add(7,"Acido Acetil");
        nom.add(8,"Sulfato Ferroso");
        nom.add(9,"Migretil");
        
      
        return nom;
    }
    
    public static List<String> Fecha(List<String> fe)
    {
        fe.add(0,"12/11/2022");
        fe.add(1,"04/03/2033");
        fe.add(2,"02/12/2015");
        fe.add(3,"06/08/2038");
        fe.add(4,"18/03/2016");
        fe.add(5,"22/01/2021");
        fe.add(6,"03/04/2017");
        fe.add(7,"05/07/2018");
        fe.add(8,"17/10/2040");
        fe.add(9,"09/05/2030");
        
        
        return fe;
    }
    
}
