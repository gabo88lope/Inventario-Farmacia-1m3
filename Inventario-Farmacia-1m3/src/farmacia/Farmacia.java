/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;
import farmacia.Menus.Menu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Cristhian
 */
public class Farmacia {

    /**
     * 
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void InventarioMain() throws IOException, InterruptedException {
        
        int opc=0,opc1 = 0;
        Usuario s=new Usuario();
        String usuario;
        String pass;
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        do {                            
            Menu.Inventario();

            try {
                opc = Integer.parseInt(leer.readLine());
            } catch (NumberFormatException ex) {
                ex.getMessage();
            }

            switch (opc) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                default:
                    break;
            }
        } while (opc!=5);
        
    }

    /**
     *
     * @throws IOException
     * @throws InterruptedException
     */
    public static void VentaMain() throws IOException, InterruptedException {
        
        int opc=0;
        Usuario s=new Usuario();
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        do {                            
            Menu.Venta();

            try {
                opc = Integer.parseInt(leer.readLine());
            } catch (NumberFormatException ex) {
                ex.getMessage();
            }

            switch (opc) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    return;

                case 5:
                    break;

                default:
                    break;
            }
        } while (opc!=5);
        
    }
}

