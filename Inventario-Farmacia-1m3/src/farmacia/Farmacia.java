/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;
import farmacia.Menus.Menu;
import farmacia.Metodos.InveDefault;
import farmacia.Metodos.Listar;
import farmacia.Metodos.Sleep;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


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
        
        int opc = 0, opc1 = 0;
        Usuario s = new Usuario();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> cantidad = new ArrayList<Integer>();
        List<String> nombres = new ArrayList<String>();
        List<String> fecha = new ArrayList<String>();
        List<Double> precio = new ArrayList<Double>();
        
        do {                            
            Menu.Inventario();

            try {
                opc = Integer.parseInt(leer.readLine());
            } catch (NumberFormatException ex) {
                ex.getMessage();
            }

            switch (opc) {
                case 1:
                    do{
                        
                        Menu.Listar();
                        
                        try {
                            opc1 = Integer.parseInt(leer.readLine());
                        } catch (NumberFormatException ex) {
                            ex.getMessage();
                        }
                        
                        switch(opc1){
                            case 1:
                                Usuario e=new Usuario();

                                for(int i = 0; i < 10; i++){
                                
                                    cantidad.add(i,InveDefault.Cantidad(cantidad).get(i));
                                }

                                for(int i = 0; i < 10; i++){
                                

                                    nombres.add(i, InveDefault.Nombres(nombres).get(i));
                                }
                                for(int i = 0; i < 10; i++){
                                

                                    fecha.add(i, InveDefault.Fecha(fecha).get(i));
                                }
                                
                                for(int i = 0; i < 10; i++) {
                                    
                                    precio.add(i, InveDefault.Precios(precio).get(i));
                                    
                                }
                             
                             
                                Listar.RecorrerListas(nombres, cantidad,e,fecha,precio);
                                break;
                            case 2:
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
                            default:
                                break;
                        
                        }
                    
                    }while(opc1!=7);
                    
                    break;

                case 2:
                    
                    do{
                        
                        Menu.Modificar();
                        
                        try {
                            opc1 = Integer.parseInt(leer.readLine());
                        } catch (NumberFormatException ex) {
                            ex.getMessage();
                        }
                        
                        switch(opc1){
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
                            case 6:
                                break;
                            default:
                                break;
                        
                        }
                    
                    }while(opc1!=6);
                    
                    
                    break;

                case 3:
                    
                    do{
                        Menu.Buscar();
                        
                        try {
                            opc1 = Integer.parseInt(leer.readLine());
                        } catch (NumberFormatException ex) {
                            ex.getMessage();
                        }
                        
                        switch(opc1){
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
                            case 6:
                                break;
                            case 7:
                                break;
                            default:
                                break;
                        
                        }
                    
                    }while(opc1!=7);
                    
                    
                    break;

                case 4:
                    return;

                case 5:
                    System.out.println("- - Saliendo del programa - -");
                    Sleep.s2();
                    System.exit(0);
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

