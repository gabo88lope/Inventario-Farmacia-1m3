/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;
import farmacia.Menus.Menu;
import java.io.*;


/**
 *
 * @author Cristhian
 */
public class Farmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        
        int opc=0,opc1 = 0;
        Usuario s=new Usuario();
        String usuario=null;
        String pass=null;
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        do{
        
            Menu.Principal();
        
            try{
             opc=Integer.parseInt(leer.readLine());
            }catch(NumberFormatException ex)
            {ex.getMessage();}
            
            switch(opc){
                case 1:
                    System.out.print("Usuario: ");
                    usuario = leer.readLine();
                    System.out.print("Password: ");
                    pass = leer.readLine();
                    
                    if(usuario==null && pass==null){
                        
                       System.out.println("No ha Ingresado ninguna cuenta");
                       break;
                       
                    }if(usuario.equals(s.getNombre()) && pass.equals(s.getPass())){
                       
                        do {                            
                            Menu.Inventario();
                            
                            try {
                                opc1 = Integer.parseInt(leer.readLine());
                            } catch (NumberFormatException ex) {
                                ex.getMessage();
                            }
                            
                            switch (opc1) {
                                case 1:
                                    System.out.println("hola");
                                    break;
                                    
                                case 2:
                                    System.out.println("que hay de nuevo");
                                    break;
                                    
                                case 3:
                                    break;
                                    
                                case 4:
                                    break;
                                    
                                case 5:
                                    break;
                                    
                                case 6:
                                    break;
                                    
                                case 7:
                                    break;
                                    
                                case 8:
                                    break;
                                    
                                default:
                                    break;
                            }
                        } while (opc1!=8);
                    }else{
                       System.out.println("No ha ingresado una cuenta correcta");
                       break;
                    } 
                case 2:
                   
                    break;
                case 3:
                    System.out.println("- - Saliendo del programa - -");
                    Sleep.s2();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Opcion Invalida!!");
                    break;
            } 
        }while(opc!=3);
        
    }
}
